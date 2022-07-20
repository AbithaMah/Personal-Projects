package uk.ac.rhul.cs2810.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import uk.ac.rhul.cs2810.enums.Allergen;
import uk.ac.rhul.cs2810.enums.Category;
import uk.ac.rhul.cs2810.enums.ItemType;
import uk.ac.rhul.cs2810.object.MenuItem;
import uk.ac.rhul.cs2810.util.DatabaseManager;

/**
 * This is the Manager class for the MenuItem object. This acts as the factory for creating and
 * handling anything to do with the MenuItem object that requires interaction with the database.
 *
 * @author Marley Dey, Chandni Joshi
 *
 */
public class MenuItemManager {

  private static MenuItemManager instance = new MenuItemManager();
  private static String MENU_TABLE_NAME = "menu";

  private static DatabaseManager dm = DatabaseManager.getInstance();

  // Ignore - needed for singleton instance purposes
  private MenuItemManager() {

  }

  /**
   * This creates and adds a new instance of a MenuItem to the database and returns the MenuItem
   * object instance that is newly created. This allows for the menu items to be updated on
   * different devices but still means that every gets the same menu items. As they can be added,
   * removed and edited remotely.
   *
   * @param name The name of the item.
   * @param description A description of the item that appears with it.
   * @param calories The calorie count of the item.
   * @param category The category of the item.
   * @param type The type that the item is.
   * @param allergens The allergens, if any, that are present in the item.
   * @param cost The cost of the item displayed on the menu
   * @param popularity the popularity of the item on the menu valued by stars
   * @param chilli the level of chilli in the item
   * @return the new instance of the Menu Item.
   */
  public MenuItem createNewMenuItem(String name, String description, int calories,
      Category category, ItemType type, EnumSet<Allergen> allergens, double cost, String popularity,
      String chilli) {
    // Check that the orders table exists, it if does not, then create it before
    // inserting order
    if (!dm.tableExists(MENU_TABLE_NAME)) {
      createMenuTable();
    }

    int nextIdValue = dm.getNextAutoIncrement(MENU_TABLE_NAME);

    // Insert item into the database
    dm.execute(dm.createPreparedStatement("INSERT INTO `" + MENU_TABLE_NAME
        + "` (`id`, `name`, `description`, `calories`, `category`, `type`, `allergens`, `cost`, "
        + "`available`, `profitMargin`) VALUES (?,?,?,?,?,?,?,?,?,?)", nextIdValue, name,
        description, calories, category.name(), type.name(), serialiseAllergens(allergens), cost,
        false, cost));

    System.out.println(
        "Menu Item [" + nextIdValue + "] has been created and inserted into the database!");
    return new MenuItem(nextIdValue, name, description, calories, category, type, allergens, cost,
        false, popularity, chilli, cost);
  }

  /**
   * This can check the menu database for a specific item from its item identification number.
   *
   * @param itemId This is the items unique identification number.
   * @return Whether the item was found in the datatebase table.
   */
  public boolean menuItemExists(int itemId) {
    ResultSet rs = dm.query(
        dm.createPreparedStatement("SELECT * FROM `" + MENU_TABLE_NAME + "` WHERE `id`=?", itemId));
    try {
      boolean exists = false;

      // If result row exists then the menu item exists.
      exists = rs.next();
      rs.getStatement().close();

      return exists;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  /**
   * This can check the menu database for a specific item from its item name.
   *
   * @param name This is the items name that appears in the menu table..
   * @return Whether the item was found in the database table.
   */
  public boolean menuItemExists(String name) {
    ResultSet rs = dm.query(
        dm.createPreparedStatement("SELECT * FROM `" + MENU_TABLE_NAME + "` WHERE `name`=?", name));
    try {
      boolean exists = false;

      exists = rs.next();
      rs.getStatement().close();

      return exists;
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return false;
  }

  /**
   * This will delete and remove an menu item from the database menu item table identified by its
   * unique identification number.
   *
   * @param itemId The identification number of the item, unique to itself.
   * @throws Exception Thrown when the order was not found in the table.
   */
  public void deleteMenuItem(int itemId) throws Exception {
    if (!menuItemExists(itemId)) {
      throw new Exception("The [Menu Item Id=" + itemId + "] does not exist!");
    }

    dm.execute(
        dm.createPreparedStatement("DELETE FROM `" + MENU_TABLE_NAME + "` WHERE id=?", itemId));
  }

  /**
   * This gets all the menu items that are present in the menu table in the database. Regardless of
   * any attributes.
   *
   * @return List of menu items composed from the menu table.
   */
  public List<MenuItem> getAllMenuItems() {
    return getAllMenuItemsWhere("1", "id ASC");
  }

  /**
   * This will get a menu item object from the database identified by its unique identification
   * number.
   *
   * @param itemId The identification number of the item.
   * @return The MenuItem object with the specified id number.
   */
  public MenuItem getMenuItemsByID(int itemId) {
    List<MenuItem> items = getAllMenuItemsWhere("id='" + itemId + "'", "id ASC");
    if (items.size() <= 0) {
      return null;
    }
    return items.get(0);
  }

  /**
   * This gets all the menu items from the menu table in the database, and sorts them so only the
   * items with matching allergen's are in the list.
   *
   * @param allergen An allergen that the item may have.
   * @return List of menu items that all contain this allergen.
   */
  public List<MenuItem> getMenuItemsContainsAllergen(Allergen allergen) {
    return getAllMenuItemsWhere("allergens LIKE '%" + allergen.name() + "%'", "id ASC");
  }

  /**
   * This gets all the menu items from the menu table in the database, and sorts them so only the
   * items with matching categories are in the list.
   *
   * @param category The category of item.
   * @return List of menu items that are all the same category.
   */
  public List<MenuItem> getMenuItemsByCategory(Category category) {
    return getAllMenuItemsWhere("category='" + category.name() + "'", "id ASC");
  }

  /**
   * This gets all the menu items from the menu table in the database, and sorts them so only the
   * items with matching types are in the list.
   *
   * @param type The type of item.
   * @return List of menu items that are all the same type.
   */
  public List<MenuItem> getMenuItemsByType(ItemType type) {
    return getAllMenuItemsWhere("type='" + type.name() + "'", "id ASC");
  }

  /**
   * This gets all the menu items from the menu table in the database, and sorts them so only the
   * items with matching availability are in the list.
   *
   * @param isAvailable Whether to get the items that are available or not.
   * @return List of menu items that are available or not.
   */
  public List<MenuItem> getMenuItemsByAvailability(boolean isAvailable) {
    return getAllMenuItemsWhere("available='" + isAvailable + "'", "id ASC");
  }

  /**
   * This gets all the menu items from the menu table in the database and sorts them by the values
   * of calories.
   *
   * @return List of menu items that ascending by their calories.
   */
  public List<MenuItem> getMenuItemByCalories() {
    return getAllMenuItemsWhere("1", "calories DESC");
  }

  /**
   * This gets the menu items from databases table and puts them from most expensive to least.
   *
   * @return List of menu items that ascending by their cost/price.
   */
  public List<MenuItem> getMenuItemByCost() {
    return getAllMenuItemsWhere("1", "cost DESC");
  }

  /**
   * gets information from database.
   *
   * @return popularity level.
   */
  public List<MenuItem> getMenuItemByPopularity() {
    return getAllMenuItemsWhere("1", "popularity DESC");
  }

  /**
   * this gets the list from database. There are 3 constructors: MILD, MEDIUM, SPICY.
   *
   * @return spice intensity.
   */
  public List<MenuItem> getMenuItemByChilli() {
    return getAllMenuItemsWhere("1", "chilli DESC");
  }

  /**
   * This will set an items availability in the items menu database, changeable by the waiters when
   * items become in/out of stock.
   *
   * @param item The menu item to set availability.
   * @param isAvailable Whether the item is available to be ordered or not.
   */
  public void setItemAvailability(MenuItem item, boolean isAvailable) {
    dm.execute(dm.createPreparedStatement("UPDATE `menu` SET available=? WHERE id= ?", isAvailable,
        item.getMenuItemID()));
  }

  /**
   * This will set an items availability in the items menu database, changeable by the waiters when
   * items become in/out of stock.
   *
   * @param itemId The identification number of the menu item to set availability.
   * @param isAvailable Whether the item is available to be ordered or not.
   */
  public void setItemAvailability(int itemId, boolean isAvailable) {
    dm.execute(dm.createPreparedStatement("UPDATE `menu` SET available=? WHERE id= ?", isAvailable,
        itemId));
  }

  /**
   * This will set an items cost in the items menu database, changeable by the manager to adjust
   * profits.
   *
   * @param itemId The identification number of the menu item to set its cost.
   * @param cost The new cost of the item.
   */
  public void setItemCost(int itemId, double cost) {
    dm.execute(dm.createPreparedStatement("UPDATE `menu` SET cost=? WHERE id= ?", cost, itemId));
  }

  /**
   * This will set an items profit margin in the items menu database, changeable by the manager to
   * adjust profits.
   *
   * @param itemId The identification number of the menu item to set its cost.
   * @param profitMargin The new profit margin of the item.
   */
  public void setItemProfitMargin(int itemId, double profitMargin) {
    dm.execute(dm.createPreparedStatement("UPDATE `menu` SET profitMargin=? WHERE id= ?",
        profitMargin, itemId));
  }

  /**
   * This returns whether an item is marked as available in the menu item database. This changes due
   * to stock in the kitchen.
   *
   * @param item The menu item to get ID from.
   * @return Whether the item is available.
   */
  public boolean isItemAvailable(MenuItem item) {
    return isItemAvailable(item.getMenuItemID());
  }

  /**
   * This returns whether an item is marked as available in the menu item database. This changes due
   * to stock in the kitchen.
   *
   * @param itemId The identification number of the menu item.
   * @return Whether the item is available.
   */
  public boolean isItemAvailable(int itemId) {
    MenuItem item = getAllMenuItemsWhere("id='" + itemId + "'", "id ASC").get(0);
    if (item == null) {
      return false;
    }

    return item.isAvailable();
  }

  /*
   * Gets all the items in the menu table where a condition applies. This method prevents
   * unnecessary duplication of code.
   */
  private List<MenuItem> getAllMenuItemsWhere(String where, String orderBy) {
    List<MenuItem> menuItems = new ArrayList<MenuItem>();

    ResultSet rs = dm.query(dm.createPreparedStatement(
        "SELECT * FROM `" + MENU_TABLE_NAME + "` WHERE " + where + " ORDER BY " + orderBy));

    // Something went wrong with the database
    if (rs == null) {
      return null;
    }

    try {

      // Iterate through all of the rows in the result set
      while (rs.next()) {
        int itemId = rs.getInt("id");
        int calories = rs.getInt("calories");
        String name = rs.getString("name");
        String description = rs.getString("description");
        Category category = Category.valueOf(rs.getString("category"));
        ItemType itemType = ItemType.valueOf(rs.getString("type"));
        EnumSet<Allergen> allergens = deserialiseAllergens(rs.getString("allergens"));
        double cost = rs.getDouble("cost");
        boolean available = rs.getBoolean("available");
        String popularity = rs.getString("popularity");
        String chilli = rs.getString("chilli");
        double profitMargin = rs.getDouble("profitMargin");

        menuItems.add(new MenuItem(itemId, name, description, calories, category, itemType,
            allergens, cost, available, popularity, chilli, profitMargin));
      }

      rs.getStatement().close();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return menuItems;
  }


  /**
   * Creates the item menu table with the specified attributes and primary key. This is used for the
   * first initialisation in a new system with no pre-made tables.
   **/

  public void createMenuTable() {
    if (dm.tableExists(MENU_TABLE_NAME)) {
      return;
    }
    // The table does not exist so it needs to be created.
    dm.execute(dm.createPreparedStatement("CREATE TABLE " + MENU_TABLE_NAME
        + "(id integer AUTO_INCREMENT," + "name varchar(64), description text, calories integer,"
        + "category VARCHAR(16), type varchar(16), allergens varchar(128), cost double,"
        + "available tinyint(1), PRIMARY KEY(id));"));

    System.out.println("Created " + MENU_TABLE_NAME + " table!");
  }

  /**
   * This will convert allergens in the menu item to a string that can be stored in the database,
   * and can be parsed back into a list of allergens from the string.
   *
   * @param allergens The allergens to be serialised
   * @return The serialised string format of the allergens enum set
   */
  private String serialiseAllergens(EnumSet<Allergen> allergens) {
    if (allergens == null) {
      return "";
    }
    StringBuilder sb = new StringBuilder();
    Allergen[] a = new Allergen[allergens.size()];
    allergens.toArray(a);

    for (int i = 0; i < allergens.size(); i++) {
      if (i == allergens.size() - 1) { // Last element in array
        sb.append(a[i].name());
        continue;
      }
      sb.append(a[i].name() + ";");
    }
    return sb.toString();
  }

  /**
   * This will convert the serialised string format of the allergens enum set used by the database
   * back into a enum set of allergen enums.
   *
   * @param allergenString The formated string of allergens.
   * @return A list of allergen enums.
   */
  private EnumSet<Allergen> deserialiseAllergens(String allergenString) {
    if (allergenString == null || allergenString.isEmpty()) {
      return null;
    }
    String[] splitAllergenString = allergenString.split(";");

    List<Allergen> allergensList = new ArrayList<Allergen>();
    for (String a : splitAllergenString) {
      allergensList.add(Allergen.valueOf(a));
    }

    return EnumSet.copyOf(allergensList);

  }

  /** Returns the singleton instance of the MenuItemManager. */
  public static MenuItemManager getInstance() {
    return instance;
  }

}
