package uk.ac.rhul.cs2810;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EnumSet;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2810.database.MenuItemManager;
import uk.ac.rhul.cs2810.enums.Allergen;
import uk.ac.rhul.cs2810.enums.Category;
import uk.ac.rhul.cs2810.enums.ItemType;
import uk.ac.rhul.cs2810.object.MenuItem;
import uk.ac.rhul.cs2810.util.DatabaseManager;

public class MenuItemManagerTest {

  private static MenuItemManager mim = null;

  @BeforeAll
  static void setup() {
    mim = MenuItemManager.getInstance();
  }

  // Test that the menu item manager can only be assess as a single instance
  @Test
  void testSingletonInstance() {
    assertNotNull(mim, "The instance of the MenuItemManager should not be NULL");
  }

  // Test that the menu table is created if it doesnt exist
  @Test
  void testMenuTableCreation() {
    assertDoesNotThrow(() -> {
      mim.createMenuTable();
    }, "This should create the menu table without throwing any exceptions");
  }

  // Test that you can create a new MenuItem and it is inserted into the database correctly.
  @Test
  void testAddingNewMenuItem() throws Exception {
    assertDoesNotThrow(() -> {
      assertNotNull(mim.createNewMenuItem("Marley's Fish & Chips", "Amazing, fresh batter.", 12,
          Category.MAIN, ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.EGG, Allergen.MILK),
          1, "*", "N/A"));
      assertNotNull(mim.createNewMenuItem("Marley's Fish & Chips 2", "Amazing, fresh batter.", 12,
          Category.MAIN, ItemType.REGULAR, EnumSet.of(Allergen.FISH), 1, "*", "N/A"));
      assertNotNull(mim.createNewMenuItem("Marley's Fish & Chips 3", "Amazing, fresh batter.", 12,
          Category.MAIN, ItemType.REGULAR, null, 1, "*", "N/A"));
    }, "Adding a new menu item to the database should not throw any exceptions");

    int id = DatabaseManager.getInstance().getNextAutoIncrement("menu") - 1;

    // Restore original state of table
    for (int i = id; i > id - 3; i--) {
      mim.deleteMenuItem(i);
    }
  }

  // Test is an item is in the menu table.
  @Test
  void testItemAppearsInTable() throws Exception {
    mim.createNewMenuItem("Marley's Fish & Chips", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.EGG, Allergen.MILK), 1, "*", "N/A");

    int id = DatabaseManager.getInstance().getNextAutoIncrement("menu") - 1;
    assertTrue(mim.menuItemExists(id), "The newly created item should exist in the database.");

    // Restore original state of table
    mim.deleteMenuItem(id);
  }

  // Test that you can delete an item from the items table.
  @Test
  void testDeletingItems() throws Exception {
    mim.createNewMenuItem("Marley's Fish & Chips", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.EGG, Allergen.MILK), 1, "*", "N/A");

    int id = DatabaseManager.getInstance().getNextAutoIncrement("menu") - 1;

    assertDoesNotThrow(() -> {
      mim.deleteMenuItem(id);

    });

    assertFalse(mim.menuItemExists(id), "The newly deleted item should exist in the database.");

  }

  // Test getting item that contains a specific allergen
  @Test
  void testGettingSpecificAllergen() throws Exception {
    mim.createNewMenuItem("Marley's Fish & Chips", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.EGG, Allergen.MILK), 1, "*", "N/A");
    mim.createNewMenuItem("Marley's Fish & Chips 2", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.MILK), 1, "*", "N/A");
    mim.createNewMenuItem("Marley's Fish & Chips 3", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.EGG), 1, "*", "N/A");

    List<MenuItem> items = null;

    assertNotNull(items = mim.getMenuItemsContainsAllergen(Allergen.MILK));

    for (MenuItem mi : items) {
      System.out
          .println("ID of items with milk ID = " + mi.getMenuItemID() + " Name = " + mi.getName());
    }

    int id = DatabaseManager.getInstance().getNextAutoIncrement("menu") - 1;

    // Restore original state of table
    for (int i = id; i > id - 3; i--) {
      mim.deleteMenuItem(i);
    }
  }

  // Test getting item that contains a specific type
  @Test
  void testGettingSpecificType() throws Exception {
    mim.createNewMenuItem("Marley's Fish & Chips", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.EGG, Allergen.MILK), 1, "*", "N/A");
    mim.createNewMenuItem("Marley's Fish & Chips 2", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.VEGAN, EnumSet.of(Allergen.FISH, Allergen.MILK), 1, "*", "N/A");
    mim.createNewMenuItem("Marley's Fish & Chips 3", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.VEGETARIAN, EnumSet.of(Allergen.FISH, Allergen.EGG), 1, "*", "N/A");

    List<MenuItem> items = null;

    assertNotNull(items = mim.getMenuItemsByType(ItemType.VEGAN));

    for (MenuItem mi : items) {
      System.out.println(
          "ID of item that is VEGAN ID = " + mi.getMenuItemID() + " Name = " + mi.getName());
    }

    int id = DatabaseManager.getInstance().getNextAutoIncrement("menu") - 1;

    // Restore original state of table
    for (int i = id; i > id - 3; i--) {
      mim.deleteMenuItem(i);
    }

  }

  // Test getting available items from the menu database.
  @Test
  void testGettingAvailableItems() throws Exception {
    mim.createNewMenuItem("Marley's Fish & Chips", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.EGG, Allergen.MILK), 1, "*", "N/A");
    mim.createNewMenuItem("Marley's Fish & Chips 2", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.VEGAN, EnumSet.of(Allergen.FISH, Allergen.MILK), 1, "*", "N/A");
    mim.createNewMenuItem("Marley's Fish & Chips 3", "Amazing, fresh batter.", 12, Category.MAIN,
        ItemType.VEGETARIAN, EnumSet.of(Allergen.FISH, Allergen.EGG), 1, "*", "N/A");

    List<MenuItem> items = null;

    assertNotNull(items = mim.getMenuItemsByAvailability(true));

    for (MenuItem mi : items) {
      System.out.println(
          "ID of item that is VEGAN ID = " + mi.getMenuItemID() + " Name = " + mi.getName());
    }

    int id = DatabaseManager.getInstance().getNextAutoIncrement("menu") - 1;

    // Restore original state of table
    for (int i = id; i > id - 3; i--) {
      mim.deleteMenuItem(i);
    }

  }

  @Test
  void testSettingAndGettingAvailability() throws Exception {
    MenuItem i1 = mim.createNewMenuItem("Marley's Fish & Chips", "Amazing, fresh batter.", 12,

        Category.MAIN, ItemType.REGULAR, EnumSet.of(Allergen.FISH, Allergen.EGG, Allergen.MILK), 1,
        "*", "N/A");
    MenuItem i2 = mim.createNewMenuItem("Marley's Fish & Chips 2", "Amazing, fresh batter.", 12,
        Category.MAIN, ItemType.VEGAN, EnumSet.of(Allergen.FISH, Allergen.MILK), 1, "*", "N/A");


    assertDoesNotThrow(() -> {
      mim.setItemAvailability(i2.getMenuItemID(), true);
    }, "Setting an items availability should not throw an exception!");

    assertFalse(mim.isItemAvailable(i1.getMenuItemID()),
        "The item i1 should have a false " + "availability!");
    assertTrue(mim.isItemAvailable(i2), "Item 2 (i2) should have a true availability!");

    assertTrue(mim.getMenuItemsByAvailability(true).size() >= 2,
        "Only two of the three items should be availiable!");

    int id = DatabaseManager.getInstance().getNextAutoIncrement("menu") - 1;

    // Restore original state of table
    for (int i = id; i > id - 3; i--) {
      mim.deleteMenuItem(i);
    }
  }


}
