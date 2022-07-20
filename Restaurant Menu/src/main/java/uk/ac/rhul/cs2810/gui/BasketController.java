package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import uk.ac.rhul.cs2810.database.MenuItemManager;
import uk.ac.rhul.cs2810.database.OrderManager;
import uk.ac.rhul.cs2810.enums.OrderStatus;
import uk.ac.rhul.cs2810.object.MenuItem;
import uk.ac.rhul.cs2810.object.Order;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * A Controller class for the Basket scene.
 * 
 * @author Kevin Lemon, Marley Dey
 *
 */
public class BasketController {

  private static BasketController instance = new BasketController();
  private static MenuItemManager mim = MenuItemManager.getInstance();
  private static OrderManager om = OrderManager.getInstance();

  private Map<ItemMenuFrameContainer, Integer> basket = null;
  private ConfirmationChecker confirmationChecker = null;
  private Order basketOrder = null;

  private List<Order> activeOrders = new ArrayList<Order>();

  private boolean confirmationOrderCreated = false;
  private boolean isBeingConfirmed = false;

  @FXML
  private VBox basketVbox;

  @FXML
  private Text totalText;

  @FXML
  private Button confirmOrderButton;

  @FXML
  private Button returnToMenuButton;

  @FXML
  void initialize() {
    assert basketVbox != null : "fx:id=\"basketVbox\" was not injected: "
        + "check your FXML file 'Basket.fxml'.";

    updateBasket();
  }

  @FXML
  void attemptConfirmOrder(ActionEvent event) {

    // You cannot confirm an order that is already being confirmed.
    if (isBeingConfirmed) {
      if (!confirmationOrderCreated) {
        updateBasket();
        return;
      }

      Alert a = new Alert(AlertType.ERROR);
      a.setHeaderText("Your order is already in the process of being confirmed!");
      a.setContentText("Please be patiant, a waiter will come and confirm your order shortly...");

      a.show();
      return;
    }

    // You cannot confirm a basket order with an empty basket.
    if (basket.isEmpty()) {
      Alert a = new Alert(AlertType.ERROR);
      a.setHeaderText("Your order is empty!");
      a.setContentText("To confirm your order, first add items to your basket...");

      a.show();
      return;
    }

    // The order can be confirmed.
    confirmOrderButton.setStyle("-fx-background-color: #c4c4c4");
    returnToMenuButton.setStyle("-fx-background-color: #c4c4c4");

    isBeingConfirmed = true;

    updateBasket();
    createOrderConfirmation(TableNumberController.getInstance().getTableNumber());
  }

  /**
   * Creates the order from the basket that needs to be be confirmed. The method is called by the
   * table number selector menu.
   * 
   * @param tableNum The table number the order is associated with.
   */
  public void createOrderConfirmation(int tableNum) {
    // Inform user that the order is being confirmed.
    Alert informConfirmation = new Alert(AlertType.INFORMATION);
    informConfirmation.setHeaderText("Your order will be confirmed shortly!");
    informConfirmation.setContentText(
        "A waiter will be with you shortly to confirm your order and \noffer payment methods...");

    informConfirmation.show();

    // Create map of MenuItems and quantity of items for the order manager.
    Map<MenuItem, Integer> orderItems = new HashMap<MenuItem, Integer>();

    for (ItemMenuFrameContainer itemContainer : basket.keySet()) {
      MenuItem item = mim.getMenuItemsByID(itemContainer.getItemId());
      int quantity = basket.get(itemContainer);

      orderItems.put(item, quantity);

    }

    // Create an order from the basket - this is the order that needs confirming
    basketOrder = OrderManager.getInstance().createOrder(orderItems, tableNum);
    confirmationOrderCreated = true;

    // Check there isn't a confirmation checker already active and running.
    if (confirmationChecker != null) {
      confirmationChecker.exit();
      confirmationChecker = null;
    }

    // Create a new ConfirmationChecker that will repeatedly check if the order has been confirmed.
    confirmationChecker = new ConfirmationChecker();

    // Check that the thread isn't already active for some reason
    if (confirmationChecker.isAlive()) {
      System.out.println(
          "There is an order already being checked for! \nPlease restart the application...");
      return;
    }

    // Start checking of the order has been confirmed
    confirmationChecker.start();
  }

  /**
   * Called when the waiter confirmation thread discovers the order is confirmed.
   */
  private void orderConfirmed() {
    isBeingConfirmed = false;
    confirmationOrderCreated = false;

    // Order is confirmed as so is active
    activeOrders.add(basketOrder);

    // Alert the user that the order has been confirmed
    Alert informConfirmation = new Alert(AlertType.INFORMATION);
    informConfirmation.setHeaderText("Your order has been confirmed!");
    informConfirmation.setContentText("Your food has been sent to the kitchen to be prepared...");

    informConfirmation.show();

    // Send the user back to menu
    try {
      MenuView.showMenu();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Reset the basket for any potential future orders
    basket = new HashMap<ItemMenuFrameContainer, Integer>();

    // Update basket to show the active orders
    updateBasket();
  }

  /**
   * Called when the order confirmation thread discoveres that the order has been cancelled by a
   * waiter.
   */
  private void orderCancelled() {
    isBeingConfirmed = false;
    confirmationOrderCreated = false;

    // Alert the user that the order has been confirmed
    Alert informCancelation = new Alert(AlertType.WARNING);
    informCancelation.setHeaderText("Your order has been cancelled!");
    informCancelation.setContentText("A waiter has cancelled your order...");

    informCancelation.show();

    // Send the user back to menu
    try {
      MenuView.showMenu();
    } catch (IOException e) {
      e.printStackTrace();
    }

    // Reset the basket for any potential future orders
    basket = new HashMap<ItemMenuFrameContainer, Integer>();

    // Update basket to show removed order
    updateBasket();

  }

  /*
   * This Thread will check if the order that the user has sent off to the waiters has been
   * confirmed. This thread stops when the order has been confirmed. It has a bigger delay becasue
   * it is not the highest priority.
   * 
   * @author Marley
   */
  private class ConfirmationChecker extends Thread {

    // Exit condition
    private boolean exit = false;
    private OrderManager om = OrderManager.getInstance();

    public void run() {
      while (!exit) { //Exit condition

        Thread.yield(); // Yield to more important threads.

        if (basketOrder == null) {
          return;
        }

        Order order = om.getOrder(basketOrder.getOrderId());

        if (order == null) {
          // This allows threads to update FX applications
          Platform.runLater(new Runnable() {
            @Override
            public void run() {
              // Update application that the order has been cancelled
              orderCancelled();
            }
          });

          exit();
          return;
        }

        // If the order has not been confirmed then the thread should wait 5 seconds...
        if (om.getOrder(basketOrder.getOrderId()).getOrderStatus() != OrderStatus.CONFIRMED) {
          try {
            Thread.sleep(5000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          continue;
        }

        // This allows threads to update FX applications
        Platform.runLater(new Runnable() {
          @Override
          public void run() {
            // Update application that the order has been confirmed
            orderConfirmed();
          }
        });

        exit();
        return;
      }
    }

    //Causes the thread to stop and exit.
    public void exit() {
      exit = true;
    }
  }

  /**
   * Inserts any active orders of the customer into the baskets Vbox, to appear on the top of the
   * basket.
   */
  private void insertActiveOrders() {
    if (activeOrders.isEmpty()) {
      return;
    }

    basketVbox.getChildren().add(new Label("Your active orders! (Refresh to update)"));

    for (Order activeOrder : activeOrders) {
      ToolBar toolBar = new ToolBar();
      toolBar.setPrefHeight(27);
      toolBar.setPrefWidth(400);

      // Get the live status of the order
      OrderStatus updatedStatus = om.getOrder(activeOrder.getOrderId()).getOrderStatus();

      Label orderLabel = new Label("Order: " + activeOrder.getOrderId());
      Label orderStatusLabel = new Label("Currently: " + updatedStatus.toString());
      toolBar.getItems().addAll(orderLabel, new Separator(), orderStatusLabel);

      basketVbox.getChildren().add(toolBar);
    }
  }

  /*
   * This will update the bucket menu with items that the user has added to their basket. These
   * items can be removed and represent the basket.
   */
  private void updateBasket() {
    basketVbox.getChildren().clear();

    insertActiveOrders();

    if (!basket.isEmpty()) {
      basketVbox.getChildren().add(new Label("Your basket"));
    }

    for (ItemMenuFrameContainer itemContainer : basket.keySet()) {

      // Define the remove button to remove item from basket.
      Button removeButton = new Button("X");
      removeButton.setPrefWidth(25);
      removeButton.setStyle("-fx-background-color: " + (isBeingConfirmed ? "#c4c4c4" : "#e66e6e"));

      // User cannot remove item from basket if the order is being confirmed
      removeButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          if (!isBeingConfirmed) {
            removeItemFromBasket(itemContainer);
          }
        }
      });

      BorderPane borderPane = new BorderPane();
      borderPane.setPrefHeight(27);
      borderPane.setPrefWidth(350);

      BorderPane quantitySubcostPane = new BorderPane();
      quantitySubcostPane.setPrefWidth(100);

      MenuItem item = mim.getMenuItemsByID(itemContainer.getItemId());
      int quantity = basket.get(itemContainer);

      Text quantityText = new Text("Quantity: " + quantity);
      // To display sub-total in 2 decimal places.
      Text subcostText = new Text(" £ " + (Math.round(item.getCost() * quantity * 100.0)) / 100.0);

      quantitySubcostPane.setLeft(quantityText);
      quantitySubcostPane.setRight(subcostText);


      Text displayNameText = new Text(item.getName());

      borderPane.setRight(quantitySubcostPane);
      borderPane.setLeft(displayNameText);


      // The item displayed is a tool bar in JavaFX
      ToolBar toolBar = new ToolBar();
      toolBar.getItems().addAll(removeButton, new Separator(), borderPane);

      // Add the created item to the VBox in the basket UI.
      basketVbox.getChildren().add(toolBar);
    }

    // Sets and calculate total cost of basket.
    totalText.setText("Total: £" + calcTotal());
    totalText.setStyle("-fx-text-fill: white");

  }

  /**
   * The public constructor of the basket controller that creates a new basket map to hold all
   * items.
   */
  public BasketController() {
    basket = new HashMap<ItemMenuFrameContainer, Integer>();
  }

  /**
   * Adds an item to the basket with its quantity, this adds to the baskets records of items and
   * their quantities. This will also create the visual representation of the item in the basket
   * menu.
   * 
   * @param itemContainer Container that holds information on the item and the quantity of the item.
   */
  public void addItemToBasket(ItemMenuFrameContainer itemContainer) {
    if (basket == null) {
      System.out.println("Basket is null!");
      return;
    }

    // Gets the previous quantity to add on to the new quantity.
    int heldQuantity = 0;
    if (basket.containsKey(itemContainer)) {
      heldQuantity = basket.get(itemContainer);
    }

    basket.put(itemContainer, (heldQuantity + itemContainer.getQuantity()));
  }


  /**
   * This removes the item from the basket. This will remove the item from the basket map and update
   * the UI to not display that item anymore.
   * 
   * @param itemContainer The container of the item with its quantity.
   */
  public void removeItemFromBasket(ItemMenuFrameContainer itemContainer) {
    basket.remove(itemContainer);

    updateBasket();
  }

  /**
   * Calculates the total of all the items in the basket.
   * 
   * @return total of costs multiplied by quantity.
   */
  private double calcTotal() {
    if (basket == null) {
      return -1;
    }
    double total = 0;

    for (ItemMenuFrameContainer basketItemContainer : basket.keySet()) {
      int quantity = basket.get(basketItemContainer);
      MenuItem item = mim.getMenuItemsByID(basketItemContainer.getItemId());

      // this is to display the total in 2 decimal places.
      total += item.getCost() * quantity;
      total = Math.round(total * 100);
      total = total / 100;
    }
    return total;
  }

  /**
   * This will open the menu UI.
   * 
   * @param event The Action event that triggered the menu to be opened.
   * @throws IOException If the menu could not be loaded.tabl
   */
  public void goToMenu(ActionEvent event) throws IOException {
    // Cannot go to menu page when waiting to get basket confirmed
    if (isBeingConfirmed) {
      return;
    }
    MenuView.showMenu();
  }

  /**
   * This will open the Login page for the waiters and kitchen staff.
   * 
   * @param event The action event that triggered the login page to be opened.
   * @throws IOException If the menu could not be loaded.
   */
  @FXML // This event handler changes scene to Login
  public void goToLogin(ActionEvent event) throws IOException {
    DisplayUtil.createStage("Login.fxml", 420, 800, "application.css", null).show();
  }

  /** Returns the singleton controller instance. */
  public static BasketController getInstance() {
    return instance;
  }

  /**
   * This shows the basket window as the parent scene.
   * 
   * @throws IOException If the stage could not be shown.
   */
  public static void showBasket() throws IOException {
    DisplayUtil
        .createStage("Basket.fxml", 420, 800, "application.css", BasketController.getInstance())
        .show();
  }

}
