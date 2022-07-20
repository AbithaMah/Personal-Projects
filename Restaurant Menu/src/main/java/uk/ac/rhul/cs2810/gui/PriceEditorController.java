package uk.ac.rhul.cs2810.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import uk.ac.rhul.cs2810.database.MenuItemManager;
import uk.ac.rhul.cs2810.object.MenuItem;

/**
 * The controller class for the Price editing scene.
 * 
 * @author Marley Dey
 *
 */
public class PriceEditorController {

  private int itemId;
  private MenuItemManager mim = MenuItemManager.getInstance();

  /**
   * Constructor for assigning the item id to the controller.
   */
  public PriceEditorController(int itemId) {
    this.itemId = itemId;
  }

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private TextField priceTextFeild;

  @FXML
  private Button setPriceButton;

  @FXML
  private TextField profitMarginTextFeild;

  @FXML
  private Button setMarginButton;

  @FXML
  private Text profitMarginPercentage;

  @FXML
  private Button closeButton;

  /** Returns the stage of the scene. */
  public Stage getStage() {
    return (Stage) closeButton.getScene().getWindow();
  }

  /** Closes the window. */
  public void close() {
    getStage().close();
  }

  /*
   * This updates the feilds in the scene when the price or margin is updated to show the new
   * relevant calculated info.
   */
  private void updatePriceTextFeilds() {
    MenuItem item = mim.getMenuItemsByID(itemId);

    double price = item.getCost();
    double profitMargin = item.getProfitMargin();
    double marginPercentage = (price / profitMargin) * 100;

    priceTextFeild.setText("£" + price);
    profitMarginTextFeild.setText("£" + profitMargin);
    profitMarginPercentage
        .setText("Profit Margin: " + (Math.round(marginPercentage * 100.0) / 100.0) + "%");
  }

  @FXML
  void closeWindow(ActionEvent event) {
    close();
  }

  @FXML
  void setMarginPressed(ActionEvent event) {
    mim.setItemProfitMargin(itemId,
        Double.parseDouble(profitMarginTextFeild.getText().replaceFirst("£", "")));

    updatePriceTextFeilds();
  }

  @FXML
  void setPricePressed(ActionEvent event) {
    mim.setItemCost(itemId, Double.parseDouble(priceTextFeild.getText().replaceFirst("£", "")));

    updatePriceTextFeilds();
  }

  @FXML
  void initialize() {
    assert priceTextFeild != null : "fx:id=\"priceTextFeild\" was not injected: "
        + "check your FXML file 'PriceEditor.fxml'.";
    assert setPriceButton != null : "fx:id=\"setPriceButton\" was not injected: "
        + "check your FXML file 'PriceEditor.fxml'.";
    assert profitMarginTextFeild != null : "fx:id=\"profitMarginTextFeild\" was not injected: "
        + "check your FXML file 'PriceEditor.fxml'.";
    assert setMarginButton != null : "fx:id=\"setMarginButton\" was not injected: "
        + "check your FXML file 'PriceEditor.fxml'.";
    assert profitMarginPercentage != null : "fx:id=\"profitMarginPercentage\" was not injected: "
        + "check your FXML file 'PriceEditor.fxml'.";
    assert closeButton != null : "fx:id=\"closeButton\" was not injected: "
        + "check your FXML file 'PriceEditor.fxml'.";

    updatePriceTextFeilds();
  }
}
