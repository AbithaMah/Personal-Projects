package uk.ac.rhul.cs2810.gui;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;
import javax.imageio.ImageIO;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import uk.ac.rhul.cs2810.enums.Allergen;
import uk.ac.rhul.cs2810.object.MenuItem;

/**
 * This is the controller class for the MenuItemDetail javaFx menu. When that scene is created it
 * will create this class to process and handle its behaviour and interactions.
 * 
 * @author Marley Dey
 *
 */
public class MenuItemDetailsController {

  private MenuItem item = null;

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private ImageView itemImage;

  @FXML
  private TextArea detailsTextFeild;

  @FXML
  private Button closeButton;

  @FXML
  void closeWindow(ActionEvent event) {
    close();
  }

  @FXML
  void initialize() {
    assert detailsTextFeild != null : "fx:id=\"detailsTextFeild\" was not injected: "
        + "check your FXML file 'MenuItemDetails.fxml'.";
    assert closeButton != null : "fx:id=\"closeButton\" was not injected: "
        + "check your FXML file 'MenuItemDetails.fxml'.";


    if (item == null) {
      return;
    }

    // Builders the detail string to put into the detailsTextFeild.
    StringBuilder detailsBuilder = new StringBuilder();
    detailsBuilder.append("Find more details about " + item.getName() + " here!\n");
    detailsBuilder.append(item.getDescription() + "\n\n");
    detailsBuilder.append("Calories: " + item.getCalories() + "\n");
    detailsBuilder.append("Cost: �" + item.getCost() + "\n");
    detailsBuilder.append("Popularity (out of 5): " + item.getpopularity() + "\n");
    detailsBuilder.append("Chilli Level: " + item.getchilli() + "\n");

    // Add list of allergens if the item has them.
    if (item.getAllergens() != null) {
      detailsBuilder.append("Allergens:\n");

      for (Allergen a : item.getAllergens()) {
        detailsBuilder.append(" - " + a.toString() + "\n");
      }
    }

    detailsTextFeild.setText(detailsBuilder.toString());
    updateItemImage(); // Call the method to receive the image of the item
  }

  /**
   * Constructor of the controller, gives the menu item that this detail meni should represent the
   * details of.
   * 
   * @param item the menu item to represent in this menu.
   */
  public MenuItemDetailsController(MenuItem item) {
    this.item = item;
  }

  /** Returns the stage of this details window. */
  public Stage getStage() {
    return (Stage) closeButton.getScene().getWindow();
  }

  /** Closes the details window. */
  public void close() {
    getStage().close();
  }

  /*
   * Updates the items image.
   */
  private void updateItemImage() {
    String imageUrl = "http://51.195.137.215/itemImages/" + item.getMenuItemID() + ".jpg";
    // Check that the item has a valid image.
    if (!validImageUrl(imageUrl)) {
      // Item doesn't have valid image
      imageUrl = "http://51.195.137.215/itemImages/default.jpg";
    }

    itemImage.setImage(new Image(imageUrl, 250, 250, false, false));
  }

  /**
   * Checks whether a URL to an image is valid or not. * * @param url path to the image. * @return
   * whether the URL is valid for an image.
   */
  public static boolean validImageUrl(String url) {
    try {
      BufferedImage image = ImageIO.read(new URL(url));
      return image != null;
    } catch (MalformedURLException e) {
      return false;
    } catch (IOException e) {
      return false;
    }
  }

}
