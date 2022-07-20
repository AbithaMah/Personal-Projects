package uk.ac.rhul.cs2810.gui;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import uk.ac.rhul.cs2810.object.MenuItem;
import uk.ac.rhul.cs2810.object.Order;

/**
 * The controller class for the menu details scene.
 * 
 * @author Marley Dey, Kevin Lemon
 *
 */
public class OrderDetailsController {

  private Order order;

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private TextField orderIdTextField;

  @FXML
  private TextField orderTotalTextField;

  @FXML
  private VBox orderItemsvBox;

  @FXML
  private TextField orderStatusTextField;

  @FXML
  private Button closeButton;

  @FXML
  private TextField orderTableTextField;

  private static DecimalFormat df2 = new DecimalFormat("#.##");

  @FXML
  void closeWindow(ActionEvent event) {
    close();
  }

  /**
   * Constructor for assigning the order that this scene represents.
   * 
   * @param order the order that this window will show the details of.
   */
  public OrderDetailsController(Order order) {
    this.order = order;
  }


  @FXML
  void initialize() {
    assert orderIdTextField != null : "fx:id=\"orderIdTextField\" was not injected: "
        + "check your FXML file 'OrderDetails.fxml'.";
    assert orderTotalTextField != null : "fx:id=\"orderTotalTextField\" was not injected: "
        + "check your FXML file 'OrderDetails.fxml'.";
    assert orderItemsvBox != null : "fx:id=\"orderItemsvBox\" was not injected: "
        + "check your FXML file 'OrderDetails.fxml'.";
    assert orderStatusTextField != null : "fx:id=\"orderStatusTextField\" was not injected: "
        + "check your FXML file 'OrderDetails.fxml'.";
    assert closeButton != null : "fx:id=\"closeButton\" was not injected: "
        + "check your FXML file 'OrderDetails.fxml'.";

    if (order == null) {
      return;
    }

    orderIdTextField.setText("" + order.getOrderId());
    orderStatusTextField.setText("" + order.getOrderStatus().name());
    orderTotalTextField.setText("" + df2.format(order.getTotalBill()));
    orderTableTextField.setText("" + order.getTableNum());

    // Add all the items of the items to the textbox.
    initAddOrderItems();
  }

  /*
   * Lists through all the items in the order and creates a box for displaying the name, quantity
   * and cost of the items.
   */
  private void initAddOrderItems() {
    Map<MenuItem, Integer> items = order.getOrderedItems();

    if (items == null) {
      return;
    }

    //Iterate through all items in the order.
    for (MenuItem item : items.keySet()) {
      if (item == null) {
        continue;
      }

      //The Text nodes will be containined in border pane node.
      BorderPane borderPane = new BorderPane();
      borderPane.setPrefHeight(27);
      borderPane.setPrefWidth(350);

      BorderPane quantitySubcostPane = new BorderPane();
      quantitySubcostPane.setPrefWidth(100);

      int quantity = items.get(item);
      String totalDouble = df2.format(item.getCost() * quantity);

      quantitySubcostPane.setLeft(new Text("Quantity: " + quantity + " "));
      quantitySubcostPane.setRight(new Text("£" + totalDouble));

      Text displayNameText = new Text(item.getName());

      borderPane.setRight(quantitySubcostPane);
      borderPane.setLeft(displayNameText);

      // Add the border pane to the order Items vertical box.
      orderItemsvBox.getChildren().add(borderPane);
    }
  }

  /**
   * Closes the order details scene.
   */
  public void close() {
    ((Stage) closeButton.getScene().getWindow()).close();
  }
}
