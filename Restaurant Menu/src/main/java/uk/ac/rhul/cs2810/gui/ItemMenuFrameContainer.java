package uk.ac.rhul.cs2810.gui;

import javafx.scene.text.Text;
import uk.ac.rhul.cs2810.database.MenuItemManager;

/**
 * Container for menu items to store attributes that need to be editied and gets association between
 * objects and the item.
 * 
 * @author Marley Dey
 *
 */
public class ItemMenuFrameContainer {

  private int itemId;
  private int quantity;
  private Text title;
  private Text quantityText;

  private static MenuItemManager mim = MenuItemManager.getInstance();
  private static BasketController basketController = BasketController.getInstance();

  /**
   * This constructor holds all the relevant objects to create an interactive experience with the
   * menu.
   * 
   * @param itemId The Id of item the container is representing.
   * @param quantity The quantity of the item in the menu.
   * @param title The title object of the item in the menu to change on availability.
   * @param quantityText The text object of the quantity so it can be changed on increment or
   *        decrement.
   */
  public ItemMenuFrameContainer(int itemId, int quantity, Text title, Text quantityText) {
    this.itemId = itemId;
    this.quantity = quantity;
    this.title = title;
    this.quantityText = quantityText;
  }

  /** Returns the item ID of the item this container represents. */
  public int getItemId() {
    return itemId;
  }

  /**
   * This will increment the quantity of the item in the menu and update the quantity text box to
   * the quantity represented. It also does not allow incrementation if the item has become
   * unavailable.
   */
  public void incrementQuantity() {
    if (!mim.isItemAvailable(itemId)) {

      // On attempt to add item that is not available...
      quantity = 0;
      quantityText.setText("0");
      title.setStrikethrough(true);
      return;
    }

    // The item is available to add to basket...
    title.setStrikethrough(false);
    quantityText.setText("" + ++quantity);
  }

  /**
   * This will decrement the quantity of the item in the menu and update the quantity text to the
   * quantity represented. This will not allows actions if the item has become unavailable. And will
   * also not allow negative quantity.
   */
  public void decrementQuantity() {
    if (quantity <= 0) {
      return;
    }

    if (!mim.isItemAvailable(itemId)) {

      // On attempt to add item that is not available...
      quantity = 0;
      quantityText.setText("0");
      title.setStrikethrough(true);
      return;
    }

    // The item is available to add to basket...
    title.setStrikethrough(false);
    quantityText.setText("" + --quantity);
  }

  /** Gets the Quantity of the item the customer wants. */
  public int getQuantity() {
    return quantity;
  }

  /**
   * This will add the item the container represents to the basket controller.
   */
  public void addToBasket() {

    // Don't add item to basket if quantity is empty.
    if (quantity <= 0) {
      return;
    }

    basketController.addItemToBasket(this);

    quantity = 0;
    quantityText.setText("" + quantity);
  }
}
