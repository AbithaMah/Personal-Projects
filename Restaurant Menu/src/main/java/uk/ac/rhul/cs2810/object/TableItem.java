package uk.ac.rhul.cs2810.object;

/**
 * Class for containing the information of table items.
 * 
 * @author Abitha M
 *
 */
public class TableItem {

  private String item;
  private int amount;
  private double price;

  /**
   * Constructor of the TableItem class.
   * 
   * @param item name of item
   * @param amount quantity of item
   * @param price the cost of the item.
   */
  public TableItem(String item, int amount, double price) {
    this.item = item;
    this.amount = amount;
    this.price = price;
  }

  /**
   * Set the item name of the item.
   * 
   * @param newItem name of item.
   */
  public void setItem(String newItem) {
    this.item = newItem;

  }

  /**
   * Set the amount of items.
   * 
   * @param newAmount the quantity of items.
   */
  public void setAmount(int newAmount) {
    this.amount = newAmount;

  }

  /**
   * Set the price of the item(s).
   * 
   * @param newPrice cost of item(s).
   */
  public void setPrice(Double newPrice) {
    this.price = newPrice;

  }

  /** Returns title of item. */
  public String getItem() {
    return this.item;
  }

  /** Returns quantity of item(s). */
  public int getAmount() {
    return this.amount;
  }

  /** Returns cost of item(s). */
  public Double getPrice() {
    return this.price;
  }

  /**
   * Adds an amount on top of the amount of item(s) already.
   * @param newAmount amount to be added ontop of current quantity.
   */
  public void addAmount(int newAmount) {
    this.amount += newAmount;
  }

  @Override
  public String toString() {
    Long total = Math.round(price * amount * 100) / 100;
    return "Amount bought: " + "Item: " + String.valueOf(amount) + item + "  total revenue: £"
        + String.valueOf(total);
  }



}
