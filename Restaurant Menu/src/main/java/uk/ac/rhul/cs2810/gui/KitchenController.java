package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import uk.ac.rhul.cs2810.database.OrderManager;
import uk.ac.rhul.cs2810.enums.OrderStatus;
import uk.ac.rhul.cs2810.object.MenuItem;
import uk.ac.rhul.cs2810.object.Order;
import uk.ac.rhul.cs2810.util.DisplayUtil;
import uk.ac.rhul.cs2810.util.OrderHistory;

/**
 * Controller class used to control the kitchen UI. Handling orders needing to be prepared and
 * delivered to the customers.
 * 
 * @author Abitha, Marley Dey
 *
 */
public class KitchenController {

  private static KitchenController instance;

  private GridPane ordersGrid;

  private static NewOrderListenerThread noListenerThread = null;
  private static ClockThread clockThread = null;

  private static Map<Integer, LabelTimerThread> idTimerLabels =
      new HashMap<Integer, LabelTimerThread>();

  private int column = 0;
  private int row = 1;

  @FXML
  private Button orderHistoryButton;

  private OrderHistory orderHistory = new OrderHistory();

  @FXML
  private Label clockLabel;

  @FXML
  private ScrollPane ordersGridScrollpane;

  static void returnToLogin() {
    stopLabelTimers();
    stopNewOrdersListener();
    stopClockThread();
    try {
      LoginController.showLogin();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /*
   * This stops all the threads that update the labels that represent the timer of the order.
   */
  private static void stopLabelTimers() {
    if (idTimerLabels == null) {
      return;
    }
    for (int id : idTimerLabels.keySet()) {
      LabelTimerThread thread = idTimerLabels.get(id);
      thread.exit();
    }
    idTimerLabels.clear();
  }

  /*
   * Removes the node that represents the order from the orders grid - and stops the thread of the
   * timer label.
   */
  private void removeOrderBoxNode(Order order, VBox vboxNode) {
    // Stop updating the label for the order about to be removed
    LabelTimerThread labelTimerThread = idTimerLabels.get(order.getOrderId());
    if (labelTimerThread != null) {
      labelTimerThread.exit();
      idTimerLabels.remove(order.getOrderId());
    }

    // Remove the node from the orders grid pane.
    int nodeIndex = ordersGrid.getChildren().indexOf(vboxNode);
    int nodeColumn = GridPane.getColumnIndex(vboxNode);
    int nodeRow = GridPane.getRowIndex(vboxNode);

    ordersGrid.getChildren().remove(nodeIndex);

    // Shift all the nodes when an order is removed.
    shiftNodes(nodeColumn, nodeRow, ordersGrid.getRowCount());

  }

  /*
   * Gets all the nodes at the row and column location in the ordersGrid.
   */
  private Node getNodeAt(int column, int row) {
    for (Node node : ordersGrid.getChildren()) {
      if (GridPane.getColumnIndex(node) != column) {
        continue;
      }
      if (GridPane.getRowIndex(node) != row) {
        continue;
      }
      return node;
    }
    return null;

  }

  /**
   * Shifts all the nodes closer to the removed node.
   * 
   * @param startColumn The column of the removed (prepared) node
   * @param startRow The row of the removed (prepared) node
   * @param maxRows The number of rows in the order grid
   */
  private void shiftNodes(int startColumn, int startRow, int maxRows) {
    int prevColumn = startColumn;
    int prevRow = startRow;

    // Iterate through the rows and columns of the orders grid
    for (int r = startRow; r <= maxRows; r++) {
      for (int c = 1; c <= 3; c++) {
        // Get the node to shift
        Node node = getNodeAt(c, r);

        if (c <= startColumn && r == startRow) {
          continue;
        }

        if (node == null) {
          continue;
        }

        // Shift the order to the location of the previous order
        GridPane.setConstraints(node, prevColumn, prevRow);
        this.column = prevColumn;
        this.row = prevRow;

        prevColumn = c;
        prevRow = r;
      }
    }
  }

  @FXML
  void createHistory(ActionEvent event) {
    orderHistory.createOrderFiles();
    Alert informCreated = new Alert(AlertType.INFORMATION);
    informCreated.setHeaderText("The order history has been created");
    informCreated.setContentText("Consult the OrderLists.txt file for the details.");

    informCreated.show();

  }

  /**
   * Creates the order vBox node of the order.
   * 
   * @param order the order the node will represent
   * @return The created Node
   */
  private void insertNewOrderBoxNode(Order order) {
    // The Vbox that all order components will be contained in.
    VBox orderVbox = new VBox();
    orderVbox.setPrefWidth(350);
    orderVbox.setId("order-box");
    orderVbox.setPadding(new Insets(20));

    // The label that will increment when the order is displayed
    Label timerLabel = new Label(getTimerLabelText(order.getTimePlaced()));
    timerLabel.setAlignment(Pos.CENTER);
    timerLabel.setId("timer-label");
    timerLabel.setPrefWidth(350);

    LabelTimerThread ordertimer = new LabelTimerThread(timerLabel, order.getTimePlaced());
    ordertimer.start();

    idTimerLabels.put(order.getOrderId(), ordertimer);

    // Label to give info on the table no and order id
    Label orderDetailsLabel =
        new Label("[Table " + order.getTableNum() + "] ID = " + order.getOrderId());
    orderDetailsLabel.setPadding(new Insets(0, 0, 20, 0));
    orderDetailsLabel.setId("order-details-label");
    orderDetailsLabel.setAlignment(Pos.CENTER);
    orderDetailsLabel.setPrefWidth(350);

    // Label of all the items on the order
    Label itemsLabel = createItemsLabel(order);
    itemsLabel.setPadding(new Insets(20, 0, 0, 0));
    itemsLabel.setId("items-label");
    itemsLabel.setPrefWidth(330);

    // The button that the staff press when the order is prepared
    Button preparedButton = new Button("PREPARED");
    // preparedButton.setPadding(new Insets(0, 25, 0, 25));
    preparedButton.setId("prepared-button");
    preparedButton.setAlignment(Pos.CENTER);
    preparedButton.setPrefWidth(300);

    // Button when the kitchen staff have prepared an order.
    preparedButton.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent e) {
        order.updateStatus(OrderStatus.PREPARED);
        removeOrderBoxNode(order, orderVbox);

        // Alert the kitchen that the order has been prepared
        Alert informPrepared = new Alert(AlertType.INFORMATION);
        informPrepared.setHeaderText("Order [" + order.getOrderId() + "] prepared!");
        informPrepared.setContentText("Waiters will be informed that the order is prepared...");

        informPrepared.show();
      }
    });

    orderVbox.getChildren().addAll(timerLabel, orderDetailsLabel, preparedButton, itemsLabel);

    // Adjust row and column values
    if (column > 2) {
      column = 1;
      row++;
    } else {
      column++;
    }

    // Add order to the orders grid
    ordersGrid.add(orderVbox, column, row);
  }

  /*
   * Creates the label node that has all the orders items in it for the orders vBox.
   */
  private Label createItemsLabel(Order order) {
    StringBuilder sb = new StringBuilder();

    Map<MenuItem, Integer> itemQuanityPairs = order.getOrderedItems();

    if (itemQuanityPairs == null) {
      return new Label("No items found!");
    }

    // Iterate through all items in the order
    for (MenuItem item : itemQuanityPairs.keySet()) {
      int quantity = itemQuanityPairs.get(item);

      sb.append("[x" + quantity + "]\t" + item.getName() + "\n");
    }

    orderHistory.addOrder(sb.toString());

    return new Label(sb.toString());
  }

  @FXML
  void initialize() {
    ordersGridScrollpane.setId("order-scroll-pane");

    // Sets up the grid pane for the orders nodes.
    ordersGrid = new GridPane();
    ordersGrid.setId("orders-grid");
    ordersGrid.setPrefWidth(1000);
    ordersGrid.setHgap(20);
    ordersGrid.setVgap(20);

    ordersGridScrollpane.setContent(ordersGrid);

    startNewOrdersListener();
    startClockThread();
  }

  /**
   * Start listening for the new orders.
   */
  private void startNewOrdersListener() {
    if (noListenerThread == null) {
      noListenerThread = new NewOrderListenerThread();
    }

    if (noListenerThread.isAlive()) {
      noListenerThread.exit();
    }

    noListenerThread.start();
  }

  /**
   * Stop listening for the new orders.
   */
  private static void stopNewOrdersListener() {
    if (noListenerThread == null) {
      return;
    }

    if (!noListenerThread.isAlive()) {
      return;
    }

    noListenerThread.exit();
    noListenerThread = null;
  }

  /**
   * Start listening for the new orders.
   */
  private void startClockThread() {
    if (clockThread == null) {
      clockThread = new ClockThread();
    }

    if (clockThread.isAlive()) {
      clockThread.exit();
    }

    clockThread.start();
  }

  /**
   * Stop listening for the new orders.
   */
  private static void stopClockThread() {
    if (clockThread == null) {
      return;
    }

    if (!clockThread.isAlive()) {
      return;
    }

    clockThread.exit();
    clockThread = null;
  }

  /**
   * Uses Singleton design pattern.
   * 
   * @return instance.
   */
  public static KitchenController getInstance() {
    return instance;
  }

  /**
   * Displays Kitchen User Interface in size width: 1000 and height 1000.
   * 
   * @throws IOException occurs if IO operation fails.
   */
  public static void showKitchen() throws IOException {
    Stage stage = DisplayUtil.createStage("Kitchen.fxml", 1000, 1000, "Kitchen.css", instance);
    Scene scene = stage.getScene();

    scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
      @Override
      public void handle(KeyEvent event) {
        if (event.getCode() == KeyCode.E) {
          returnToLogin();
        }
      }
    });

    stage.setScene(scene);
    stage.show();
  }

  private String getTimerLabelText(long placedTime) {
    SimpleDateFormat timeFormat = new SimpleDateFormat("mm:ss");
    SimpleDateFormat extendedTimeFormat = new SimpleDateFormat("HH:mm:ss");

    Date differenceDate = new Date((new Date()).getTime() - placedTime);
    return
    // Only show hours if the order is over an hour.
    differenceDate.getTime() >= 3600000 ? extendedTimeFormat.format(differenceDate)
        : timeFormat.format(differenceDate);
  }

  /**
   * The thread that controls the label that displays the time that the order has been in the kichen
   * display.
   * 
   * @author Marley Dey
   *
   */
  public class LabelTimerThread extends Thread {
    private Label label;
    private long placedTime;

    public LabelTimerThread(Label label, long placedTime) {
      this.label = label;
      this.placedTime = placedTime;
    }

    // Exit condition for the thread
    private boolean exit = false;

    /**
     * Run method by the thread that - will update the label to the time that is has been since the
     * order came through to the kitchen.
     */
    public void run() {
      while (!exit) {
        Thread.yield(); // Yield to other more important threads

        // This allows threads to update FX applications
        Platform.runLater(new Runnable() {
          @Override
          public void run() {
            label.setText(getTimerLabelText(placedTime));
          }
        });

        try {
          // The 1 second delay between updating the stopwatch
          Thread.sleep(1000);
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

  /**
   * The listener thread that will listen for new orders to be added to the kitchen interface.
   * 
   * @author Marley Dey
   *
   */
  public class NewOrderListenerThread extends Thread {

    private OrderManager om = OrderManager.getInstance();

    // Exit condition for the thread
    private boolean exit = false;

    /**
     * Run method by the thread that - will update the label to the time that is has been since the
     * order came through to the kitchen.
     */
    public void run() {
      while (!exit) {

        Platform.runLater(new Runnable() {
          @Override
          public void run() {
            ordersGrid.getChildren().clear();

            column = 0;
            row = 1;

            for (Order order : om.getAllOrdersByStatus(OrderStatus.CONFIRMED)) {
              insertNewOrderBoxNode(order);
            }
          }
        });

        Thread.yield(); // Yield to other more important threads;
        try {
          Thread.sleep(6000);
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

  public class ClockThread extends Thread {

    private SimpleDateFormat timeFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

    // Exit condition for the thread
    private boolean exit = false;

    /**
     * Run method by the thread that - will update the label to the time that is has been since the
     * order came through to the kitchen.
     */
    public void run() {
      while (!exit) {
        Thread.yield(); // Yield to other more important threads;

        // This allows threads to update FX applications
        Platform.runLater(new Runnable() {
          @Override
          public void run() {
            clockLabel.setText(timeFormat.format(new Date()));
          }
        });

        try {
          Thread.sleep(1000);
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
}
