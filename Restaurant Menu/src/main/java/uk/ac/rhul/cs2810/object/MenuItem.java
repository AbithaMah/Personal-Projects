package uk.ac.rhul.cs2810.object;

import java.util.EnumSet;
import uk.ac.rhul.cs2810.enums.Allergen;
import uk.ac.rhul.cs2810.enums.Category;
import uk.ac.rhul.cs2810.enums.ItemType;

/**
 * The class for holding all information about the items on the menu and that appear in the order
 * objects. These hold all the properties of the items. Which are defined by the MenuItemManager
 * which acts as a factory for creating instances of this class.
 *
 * @author Dori Rozsavolgyi, Marley Dey, Chandni Joshi
 *
 */
public class MenuItem {

  private int itemId;
  private int calories;
  private double cost;
  private String name;
  private String description;
  private Category category;
  private ItemType itemType;
  private EnumSet<Allergen> allergens;
  private boolean available;
  private String popularity;
  private String chilli;
  private double profitMargin;

  /**
   * Constructor for a MenuItem object. The allergens need to be passed in as an EnumSet (because
   * one object can only be assigned one enum value regularly), this can be done by doing e.g.
   * allergens = EnumSet.of(Allergen.EGG, Allergen.MILK)
   *
   * @param name is the name of the item
   * @param description is a brief description of the item
   * @param calories is integer value of the calorie count of the item
   * @param category is whether an item is a starter,main,dessert or a drink
   * @param type is whether an item is vegetarian, vegan or regular
   * @param allergens is an EnumSet of Allergen of the allergens contained in the item, read method
   *        description to understand how to implement
   * @param cost The cost of the item displayed on the menu
   * @param available whether the item is in stock
   * @param popularity the popularity of the item on the menu valued by stars
   * @param chilli the level of chilli in the item
   * @param profitMargin the profit margin of the item
   */
  public MenuItem(int itemId, String name, String description, int calories, Category category,
      ItemType type, EnumSet<Allergen> allergens, double cost, boolean available, String popularity,
      String chilli, double profitMargin) {
    this.itemId = itemId;
    this.name = name;
    this.description = description;
    this.calories = calories;
    this.category = category;
    this.itemType = type;
    this.allergens = allergens;
    this.cost = cost;
    this.available = available;
    this.popularity = popularity;
    this.chilli = chilli;
    this.profitMargin = profitMargin;
  }

  /**
   * Getter method for item names.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Getter method for item descriptions.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Getter method for item calories count.
   *
   * @return the calories
   */
  public int getCalories() {
    return calories;
  }

  /** Returns the cost of the item. */
  public double getCost() {
    return cost;
  }

  public double getProfitMargin() {
    return profitMargin;
  }


  /** Returns the popularity level. **/
  public String getpopularity() {
    return popularity;
  }

  /** Returns chilli intensity. **/
  public String getchilli() {
    return chilli;
  }

  /**
   * Getter method for item category.
   *
   * @return the category
   */
  public Category getCategory() {
    return category;
  }

  /**
   * Getter method for item types.
   *
   * @return the itemType
   */
  public ItemType getType() {
    return itemType;
  }

  /**
   * Getter method for item allergens.
   *
   * @return the allergens
   */
  public EnumSet<Allergen> getAllergens() {
    return allergens;
  }

  /** Returns the items Identification number. */
  public int getMenuItemID() {
    return itemId;
  }

  /**
   * Setter method for item names.
   *
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Setter method for item descriptions.
   *
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Setter method for item calorie count.
   *
   * @param calories the calories to set
   */
  public void setCalories(int calories) {
    this.calories = calories;
  }

  /**
   * Setter method for Popularity.
   *
   * @param popularity to set
   */
  public void setpopularity(String popularity) {
    this.popularity = popularity;
  }

  /**
   * Setter method for chilli.
   * 
   * @param chilli to set.
   */
  public void setchilli(String chilli) {
    this.chilli = chilli;
  }

  /**
   * Setter method for item category.
   *
   * @param category the category to set
   */
  public void setCategory(Category category) {
    this.category = category;
  }

  /**
   * Setter method for item type.
   *
   * @param itemType the itemType to set
   */
  public void setType(ItemType itemType) {
    this.itemType = itemType;
  }

  /**
   * Setter method for item allergens.
   *
   * @param allergens the allergens to set
   */
  public void setAllergens(EnumSet<Allergen> allergens) {
    this.allergens = allergens;
  }

  /** Returns if the item is available. */
  public boolean isAvailable() {
    return available;
  }

  @Override
  public int hashCode() {
    return itemId + name.hashCode() + description.hashCode();
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof MenuItem)) {
      return false;
    }
    MenuItem otherItem = (MenuItem) other;
    if (otherItem.getMenuItemID() != this.getMenuItemID()) {
      return false;
    }
    return true;
  }

}
