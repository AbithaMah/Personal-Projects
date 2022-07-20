package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Accordion;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import uk.ac.rhul.cs2810.database.AlertManager;
import uk.ac.rhul.cs2810.database.MenuItemManager;
import uk.ac.rhul.cs2810.database.OrderManager;
import uk.ac.rhul.cs2810.enums.OrderStatus;
import uk.ac.rhul.cs2810.object.MenuItem;
import uk.ac.rhul.cs2810.object.Order;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * This is the controller for the Waiter javaFx menu. When the Waiter menu is created it will create
 * this class instance as its controller that will handle its behaviour and interactions.
 *
 * @author Kevin Lemon, Marley Dey, Daniel Rogerson
 *
 */
public class WaiterController {

  private Map<ItemStockFrameContainer, TitledPane> itemStockContainers = null;
  private static WaiterController instance = new WaiterController();
  private static OrderUpdaterThread orderUpdater = null;
  private OrderManager om = OrderManager.getInstance();
  private OrderDetailsController detailsController = null;

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Label invalidLoginLabel;

  @FXML
  private Label orderStatusLabel;

  @FXML
  private Label invalidLoginLabel1;

  @FXML
  private Accordion stockAccordion;

  @FXML
  private Button updateButton;

  @FXML
  private Button logoutButton;

  @FXML
  private VBox ordersvBox;

  /*
   * Updates the items availability for a specific button corresponding to an item with the item id
   * specified.
   */
  private void updateStockItem(int itemId) {
    for (ItemStockFrameContainer container : itemStockContainers.keySet()) {

      if (container.getItemId() != itemId) {
        continue;
      }

      // Finds the pane which represents the desired menu item.
      TitledPane menuItemPane = itemStockContainers.get(container);

      menuItemPane.setContent(container.getAvailableButton());
    }
  }

  @FXML
  void initialize() {
    assert invalidLoginLabel != null : "fx:id=\"invalidLoginLabel\" was not injected: "
        + "check your FXML file 'Waiter.fxml'.";
    assert orderStatusLabel != null : "fx:id=\"orderStatusLabel\" was not injected: "
        + "check your FXML file 'Waiter.fxml'.";
    assert invalidLoginLabel1 != null : "fx:id=\"invalidLoginLabel1\" was not injected: "
        + "check your FXML file 'Waiter.fxml'.";
    assert stockAccordion != null : "fx:id=\"stockAccordion\" was not injected: "
        + "check your FXML file 'Waiter.fxml'.";

    itemStockContainers = new HashMap<ItemStockFrameContainer, TitledPane>();

    // Spacing between orders
    ordersvBox.setSpacing(10);

    initInsertStockItems();
    updateConfirmationOrders();

    startUpdatingOrders();
  }

  /*
   * Inserts the initial list of items from the database into the waiters UI where item availability
   * can be changed with a button press.
   */
  private void initInsertStockItems() {
    List<MenuItem> items = MenuItemManager.getInstance().getAllMenuItems();
    stockAccordion.getPanes().clear(); // Maybe remove if the menu flashes.

    if (items == null) {
      TitledPane noStockPane =
          new TitledPane("No Stock Found", new Label("No items where found in the database!"));

      stockAccordion.getPanes().add(noStockPane);
      return;
    }

    // Loop through all the items to add to the Waiter UI
    for (MenuItem item : items) {

      Button button = new Button();
      final ItemStockFrameContainer isContainer =
          new ItemStockFrameContainer(item.getMenuItemID(), button);;

      // A titled pane that will contain the button to change availability.
      TitledPane menuItemPane = new TitledPane("[" + item.getMenuItemID() + "] " + item.getName(),
          isContainer.getAvailableButton());

      // Setting button action to switch availability of item when clicked.
      button.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          isContainer.switchAvailability();
          updateStockItem(item.getMenuItemID());


          // Wait 1 second then close the pane so the button can be updated.
          Executors.newSingleThreadScheduledExecutor().schedule(() -> {
            menuItemPane.setExpanded(false);
          }, 1, TimeUnit.SECONDS);
        }
      });

      // Setting menu item listener to update the button when it appears to the waiter.
      menuItemPane.expandedProperty().addListener((obs, wasExpanded, isNowExpanded) -> {
        if (isNowExpanded) {
          updateStockItem(item.getMenuItemID());
        }
      });

      // Store the details of the item pane so it can be updated when needed.
      itemStockContainers.put(isContainer, menuItemPane);
      stockAccordion.getPanes().add(menuItemPane);
    }
  }

  /*
   * This will insert the orders that need confirming into the waiter IU with the option to show the
   * details of the order and a confirm button.
   */
  private synchronized void updateConfirmationOrders() {
    OrderManager om = OrderManager.getInstance();
    List<Order> orders = om.getAllOrdersByStatus(OrderStatus.ORDERED);
    orders.addAll(om.getAllOrdersByStatus(OrderStatus.PREPARED));

    ordersvBox.getChildren().clear();

    // If there are no orders requiring attention, let the waiters know.
    if (orders.isEmpty()) {
      ordersvBox.getChildren().add(new Label("No orders requiring attention..."));
      return;
    }

    // Insert each order independently
    for (Order order : orders) {
      insertOrder(order);
    }
  }

  /**
   * This checks the database for any alerts that haven't been handled by the Waiter.
   */
  private synchronized void checkForAlerts() {
    if (AlertManager.alertExists(69420)) {
      AlertManager.getTableNumber();
      AlertController.staticTableNumber = AlertManager.s;
      try {
        AlertController.openAlert();
      } catch (IOException e) {
        e.printStackTrace();
      }
      AlertManager.changeOrderID();
    }
  }

  /**
   * This will insert display container of the order with it's ID and the buttons linked to it to
   * display the details of the items associated with the order and the button to confirm.
   *
   * @param order The order object to display and represent in the orders list.
   */
  private void insertOrder(Order order) {
    // Display the ID of the order
    Label orderIdLabel =
        new Label("ID: [ " + order.getOrderId() + " ]   Table Num: [" + order.getTableNum() + "]");
    orderIdLabel.setPrefWidth(160);

    // Display the status of the order
    Label orderStatusLabel = new Label(order.getOrderStatus().name());
    orderStatusLabel.setStyle("-fx-font-weight: bold;");

    HBox orderDetails = new HBox();

    // Display Order ID and status
    orderDetails.getChildren().addAll(orderIdLabel, orderStatusLabel);

    // Button to open the details window that shows items ordered
    Button expandButton = new Button("Expand");
    expandButton.setPrefWidth(100);

    // Sets expand buttons functionality to open detail window
    expandButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        openOrderDetails(order);
      }
    });

    Button actionButton = null;

    // The confirm/delivered button when the order should be sent to the kitchen/sent to table
    actionButton =
        new Button(order.getOrderStatus() == OrderStatus.ORDERED ? "Confirm" : "Delivered");

    actionButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        // The order needs to update its status
        order.updateStatus(order.getOrderStatus() == OrderStatus.ORDERED ? OrderStatus.CONFIRMED
            : OrderStatus.DELIVERED);
        updateConfirmationOrders(); // Instant update the menu on a status change
      }
    });

    actionButton.setPrefWidth(100);

    Button cancelButton = null;

    // If an order has not been confirmed, then the order should be able to be cancelled.
    if (order.getOrderStatus() == OrderStatus.ORDERED) {
      // Cancel an order if the order has been ordered.
      cancelButton = new Button("Cancel");
      cancelButton.setId("order-cancel-button");

      cancelButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          cancelOrder(order);

          // Show an alert to inform waiter that they have cancelled and removed an order.
          Alert cancelConfirmation = new Alert(AlertType.CONFIRMATION);
          cancelConfirmation.setHeaderText("Order " + +order.getOrderId() + " has been cancelled!");
          cancelConfirmation
              .setContentText("The order has been removed from the order database...");

          cancelConfirmation.show();

          updateConfirmationOrders(); // Instant update the menu on a status change

        }
      });

      cancelButton.setPrefWidth(100);
    }

    HBox orderButtons = new HBox();
    // Display buttons to expand the order and

    if (cancelButton == null) {
      orderButtons.getChildren().addAll(expandButton, actionButton);
    } else {
      orderButtons.getChildren().addAll(expandButton, actionButton, cancelButton);
    }
    orderButtons.setSpacing(5);

    VBox ordervBox = new VBox();
    ordervBox.getChildren().addAll(orderDetails, orderButtons);
    ordervBox.setStyle("-fx-background-color: "
        + (order.getOrderStatus() == OrderStatus.ORDERED ? "#fffd91" : "#4abd4f") + ";");

    // Add this order to the vBox of orders needed confirmation
    ordersvBox.getChildren().add(ordervBox);
  }

  /*
   * Allows waiter to cancel the order in the waiter UI.
   */
  private void cancelOrder(Order order) {
    try {
      om.deleteOrder(order.getOrderId());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  /*
   * This opens the individual details window that displays all the items ordered by the customer.
   */
  private void openOrderDetails(Order order) {
    // Close the previous details window before opening the next one.
    if (detailsController != null) {
      detailsController.close();
    }

    try {
      // Load the details menu
      DisplayUtil.createAdditionalStage("OrderDetails.fxml", 400, 420, "application.css",
          detailsController = new OrderDetailsController(order)).show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /*
   * This will start a thread that will update the confirmation orders list every 5 seconds.
   */
  private void startUpdatingOrders() {
    if (orderUpdater == null) {
      orderUpdater = new OrderUpdaterThread();
    }
    if (orderUpdater.isAlive()) {
      return;
    }
    orderUpdater.start();
  }

  /*
   * This is the Thread class that will update the orders list in the Waiter UI that need
   * confirming.
   */
  private class OrderUpdaterThread extends Thread {

    // Exit condition for the thread
    private boolean exit = false;

    public void run() {
      while (!exit) {
        Thread.yield(); // Yield to other more important threads

        // This allows threads to update FX applications
        Platform.runLater(new Runnable() {
          @Override
          public void run() {
            updateConfirmationOrders();
            checkForAlerts();
          }
        });

        try {
          // The 2 second delay between updates
          Thread.sleep(2000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }

    /*
     * Exit condition of the thread, instead of Thread#join()
     */
    public void exit() {
      exit = true;
    }

  }

  /*
   * This will stop the thread updating the confirmation orders list.
   */
  private void stopUpdatingOrders() {
    if (orderUpdater != null) {
      orderUpdater.exit();
    }

    orderUpdater = null;
  }

  @FXML
  void onLogout(ActionEvent event) throws IOException {
    stopUpdatingOrders();
    LandingController.showLanding();
  }

  /**
   * Gets the singleton instance of the WaiterUI controller class.
   *
   * @return instance of class.
   */
  public static WaiterController getInstance() {
    return instance;
  }

  /**
   * This opens the waiter UI for after a member of staff logs into the login page and are a waiter.
   *
   * @throws IOException If the file could not not be opened and/or found
   */
  public static void showWaiter() throws IOException {
    DisplayUtil.createStage("Waiter.fxml", 420, 800, "application.css", instance).show();
  }

}
