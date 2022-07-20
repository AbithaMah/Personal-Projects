package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import uk.ac.rhul.cs2810.database.MenuItemManager;
import uk.ac.rhul.cs2810.enums.Allergen;
import uk.ac.rhul.cs2810.enums.Category;
import uk.ac.rhul.cs2810.enums.ItemType;
import uk.ac.rhul.cs2810.object.MenuItem;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * Controller class for the Menu JavaFX GUI. The fxml file uses this as a controller class to get
 * the behaviour of the menu. This will populate the menu with items from the DB.
 * 
 * @author Kevin Lemon, Marley Dey, Dora Rozsavolgyi, Chandni Joshi
 *
 */
public class MenuView {

  private List<ItemMenuFrameContainer> itemFrameContainers = null;
  private MenuItemDetailsController detailsController = null;
  private static MenuItemManager mim = MenuItemManager.getInstance();
  private AllergenFilteringController allergenController = null;

  @FXML
  private VBox menuVbox;
  @FXML
  private ChoiceBox<String> filterBox;

  @FXML // This method is called by the FXMLLoader when initialisation is complete
  private void initialize() {
    assert menuVbox != null : "fx:id=\"menuVbox\" was not injected: "
        + "check your FXML file 'DynamicMenu.fxml'.";

    displayItemsByCategory();

    // Add filter choices to the filter choice box in the menu UI.
    filterBox.getItems().add("Category");
    filterBox.getItems().add("Type");
    filterBox.getItems().add("Allergens");
    filterBox.getItems().add("Calories");
    filterBox.getItems().add("Cost");
    filterBox.getItems().add("Popularity");
    filterBox.getItems().add("Chilli Level");

    // Set default filter to Category
    filterBox.setValue("Category");

    // Sets the events for each filter choice selection
    filterBox.setOnAction(event -> {
      String filter = filterBox.getValue();

      switch (filter) {
        case "Category":
          displayItemsByCategory();
          break;
        case "Type":
          displayItemsByType();
          break;
        case "Allergens":
          displayItemsByAllergens();
          break;
        case "Calories":
          displayItemsByCalories();
          break;
        case "Cost":
          displayItemsByCost();
          break;
        case "Popularity":
          displayItemsByPopularity();
          break;
        case "Chilli Level":
          displayItemsByChilli();
          break;
        default:
          displayItemsByCategory();
          break;
      }
    });
  }

  /*
   * This will insert all the items into the menu from the DB by their category. [STARTER, MAIN,
   * DESSERT and DRINK]
   */
  private void displayItemsByCategory() {
    menuVbox.getChildren().clear();

    for (Category category : new Category[] {Category.STARTER, Category.MAIN, Category.DESSERT,
        Category.DRINK}) {
      List<MenuItem> items = mim.getMenuItemsByCategory(category);

      // Do not display or attempt to add items of an empty list
      if (items.size() != 0) {
        menuVbox.getChildren().add(new Label(category.toString() + "s"));
        insertItems(items);
      }
    }
  }

  /*
   * This will insert all the items into the menu from the DB by their types. [REGULAR, VEGETARIAN
   * and VEGAN]
   */
  private void displayItemsByType() {
    menuVbox.getChildren().clear();

    for (ItemType type : new ItemType[] {ItemType.REGULAR, ItemType.VEGETARIAN, ItemType.VEGAN}) {
      List<MenuItem> items = mim.getMenuItemsByType(type);

      // Do not display or attempt to add items of an empty list
      if (items.size() != 0) {
        String typeName = type.name().substring(0, 1) + type.name().substring(1).toLowerCase();
        menuVbox.getChildren().add(new Label(typeName + " option(s):"));
        insertItems(items);
      }
    }

  }

  /**
   * This method displays the allergen filtering window.
   */
  private void displayItemsByAllergens() {
    if (allergenController == null) {
      allergenController = new AllergenFilteringController(this);
    }
    try {
      // Load the allergen filtering menu
      DisplayUtil.createAdditionalStage("AllergenFiltering.fxml", 400, 300, "application.css",
          allergenController).show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * This method creates a list for each instance of an allergen selected and removes every item
   * that contains the specified allergen(s), displaying the new list.
   */
  public void insertAllergenItems() {
    List<MenuItem> items = mim.getAllMenuItems();
    menuVbox.getChildren().clear();

    if (allergenController.isEggChecked()) {
      List<MenuItem> eggItems = mim.getMenuItemsContainsAllergen(Allergen.EGG);
      items.removeAll(eggItems);
    }

    if (allergenController.isMilkChecked()) {
      List<MenuItem> milkItems = mim.getMenuItemsContainsAllergen(Allergen.MILK);
      items.removeAll(milkItems);
    }

    if (allergenController.isFishChecked()) {
      List<MenuItem> fishItems = mim.getMenuItemsContainsAllergen(Allergen.FISH);
      items.removeAll(fishItems);
    }

    if (allergenController.isNutsChecked()) {
      List<MenuItem> nutsItems = mim.getMenuItemsContainsAllergen(Allergen.NUTS);
      items.removeAll(nutsItems);
    }

    if (allergenController.isWheatChecked()) {
      List<MenuItem> wheatItems = mim.getMenuItemsContainsAllergen(Allergen.WHEAT);
      items.removeAll(wheatItems);
    }

    if (allergenController.isSoyChecked()) {
      List<MenuItem> soyItems = mim.getMenuItemsContainsAllergen(Allergen.SOY);
      items.removeAll(soyItems);
    }
    insertItems(items);
  }

  /**
   * This will insert all the items into the menu from the DB by their calories. From Most to least.
   */
  private void displayItemsByCalories() {
    menuVbox.getChildren().clear();

    menuVbox.getChildren().add(new Label("Most calories"));
    insertItems(mim.getMenuItemByCalories());
    menuVbox.getChildren().add(new Label("Least calories"));
  }

  /**
   * This will print items from most expensive to least expensive based on Price.
   */
  private void displayItemsByCost() {
    menuVbox.getChildren().clear();
    menuVbox.getChildren().add(new Label("Most Expensive: "));
    insertItems(mim.getMenuItemByCost());
    menuVbox.getChildren().add(new Label("Least Expensive: "));

  }

  /**
   * This will print items from most popular to least. This depends on how many asteriks each item
   * gets out of 5. This will print items from most popular to least.
   * 
   */
  private void displayItemsByPopularity() {
    menuVbox.getChildren().clear();
    menuVbox.getChildren().add(new Label("Most Popular: "));
    insertItems(mim.getMenuItemByPopularity());
    menuVbox.getChildren().add(new Label("Least Popular: "));
  }

  /**
   * to display chilli from most spicy to least spicy.
   */
  private void displayItemsByChilli() {
    menuVbox.getChildren().clear();
    menuVbox.getChildren().add(new Label("Most Spicy: "));
    insertItems(mim.getMenuItemByChilli());
    menuVbox.getChildren().add(new Label("Least Spicy: "));

  }

  /**
   * The constructor for creating the itemFrameContainers needed to get the quantity of orders for
   * the basket and order processing.
   */
  public MenuView() {
    itemFrameContainers = new ArrayList<ItemMenuFrameContainer>();
  }

  /**
   * This will insert all the items into the V box of the MenuUI by its categories. It creates the
   * button-box and inserts all the details needed. It also assigns the button click events.
   * 
   * @param category Category to add the items by.
   */
  private void insertItems(List<MenuItem> items) {

    if (items == null) {
      menuVbox.getChildren().add(new Label("No items could be found!"));
      return;
    }

    for (MenuItem item : items) {

      // Title of item with basic font style
      Text title = new Text(200, 60, item.getName()
          + (item.getType() != ItemType.REGULAR ? " (" + item.getType().toString() + ")" : ""));
      title.setId("menuItemAvailable");
      title.setWrappingWidth(190);

      // Strike through the title text if the item is unavailable
      if (!item.isAvailable()) {
        title.setStrikethrough(true);
        title.setId("menuItemNotAvailable");
      }

      // The tool-bar for plus, minus buttons with quantity
      Button minusButton = new Button("-");
      Button plusButton = new Button("+");
      Text quantity = new Text("" + 0);

      Button addButton = new Button("Add");

      // Event Handling below

      // This container holds the quantity and some UI components associated with the
      // menu item ID
      ItemMenuFrameContainer container =
          new ItemMenuFrameContainer(item.getMenuItemID(), 0, title, quantity);

      // Sets the actions for when the plusButton is pressed
      plusButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          container.incrementQuantity();
        }
      });

      // Sets the actions for when the minusButton is pressed
      minusButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          container.decrementQuantity();
        }
      });

      // Sets the actions for when the add button is pressed
      addButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          container.addToBasket();
        }
      });

      // Creates and sets the click action (Opening the details mini window)
      Button detailsButton = new Button("Details");

      detailsButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          openDetailsMenu(item);
        }
      });

      // So far this is not needed - but will be needed for processing orders
      itemFrameContainers.add(container);

      ToolBar toolbar = new ToolBar();

      // Adds all the text and buttons to build up the ButtonBar
      toolbar.getItems().addAll(detailsButton, minusButton, quantity, plusButton, addButton);
      toolbar.setPrefWidth(175);
      toolbar.setId("toolbar");

      ButtonBar itemDisplayBar = new ButtonBar();
      itemDisplayBar.getButtons().addAll(title, toolbar);
      itemDisplayBar.setId("itemDisplay");

      // Add the ButtonBar to the menu's V box container.
      menuVbox.getChildren().add(itemDisplayBar);
    }
  }

  /**
   * This opens a small detail window that displays all the details of the item, including its
   * description, calories and cost. This will close any other details window box before opening
   * another.
   * 
   * @param details The details for the window box to display.
   */
  private void openDetailsMenu(MenuItem item) {

    // Close the previous details window before opening the next one.
    if (detailsController != null) {
      detailsController.close();
    }

    try {
      // Load the details menu
      DisplayUtil.createAdditionalStage("MenuItemDetails.fxml", 400, 500, "application.css",
          detailsController = new MenuItemDetailsController(item)).show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  // ------------------------------------------------------------------------------

  /**
   * This is an event handler that when the login button is pressed. The Login screen for staff is
   * presented.
   * 
   * @param event Event action properties.
   * @throws IOException If the fxml file could not be found or loaded
   */
  @FXML // This event handler changes scene to Login
  public void goToLogin(ActionEvent event) throws IOException {
    LoginController.showLogin();
  }

  /**
   * This is an event handler that when the basket button is pressed. The basket window will open
   * displaying item in their baskets.
   * 
   * @param event Event action properties
   * @throws IOException If the fxml file could not be found or loaded
   */
  @FXML // This event handler changes scene to Basket
  public void goToBasket(ActionEvent event) throws IOException {
    BasketController.showBasket();
  }

  /**
   * This will open the menu UI.
   * 
   * @throws IOException If the menu could not be loaded.
   */
  public static void showMenu() throws IOException {
    DisplayUtil.createStage("Menu.fxml", 420, 800, "application.css", null).show();
  }

  /**
   * This will open the call waiter menu that allows the customer to call a waiter if they need
   * assistance.
   * 
   * @param event the event this is called on (button press)
   * @throws IOException if the call waiter scene could not be loaded or found.
   */
  public void callWaiter(ActionEvent event) throws IOException {
    CallWaiterController.showCallWaiter();
  }

}
