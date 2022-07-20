package uk.ac.rhul.cs2810.gui;

import javafx.scene.control.Button;
import uk.ac.rhul.cs2810.database.MenuItemManager;

/**
 * Container for holding attributes in the Waiters GUI where the availability of item buttons needs
 * association with the item itself.
 * 
 * @author Marley Dey
 *
 */
public class ItemStockFrameContainer {

  private static MenuItemManager mim = MenuItemManager.getInstance();

  private int itemId;
  private Button availableButton;

  /**
   * The constructor that assigns the items id to the button that represents if it is available.
   * 
   * @param itemId The ID of the item tat may or may not be available.
   * @param availableButton The button that represents if the item is available or not.
   */
  public ItemStockFrameContainer(int itemId, Button availableButton) {
    this.itemId = itemId;
    this.availableButton = availableButton;

  }

  /** Returns the Id of the item. */
  public int getItemId() {
    return itemId;
  }

  /** This switches the availability, true to false or false to true. */
  public void switchAvailability() {
    mim.setItemAvailability(itemId, !mim.isItemAvailable(itemId));
  }

  /**
   * This will return the button that represents whether the item is available or not. The button
   * will have different properties depending on its availability.
   * 
   * @return The button object.
   */
  public Button getAvailableButton() {
    boolean available = mim.isItemAvailable(itemId);
    availableButton.setPrefWidth(140);

    if (available) {
      availableButton.setText("Available");
      availableButton.setStyle("-fx-background-color: #00ff00");
    } else {
      availableButton.setText("Unavailable");
      availableButton.setStyle("-fx-background-color: #ff0000");
    }

    return availableButton;
  }

}
