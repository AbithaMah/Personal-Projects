package uk.ac.rhul.cs2810.gui;

import java.time.LocalDate;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;

/**
 * A class for creating an object to be entered into the revenue table.
 * 
 * @author danielrogerson
 *
 */

public class RevenueTable {

  private SimpleIntegerProperty id;
  public ObjectProperty<LocalDate> date;
  private SimpleIntegerProperty numberOfOrders;
  private SimpleFloatProperty totalRevenue;

  /**
   * Constructor for the Revenue Table.
   * 
   * @param id is the revenue table ID.
   * @param date is the date revenue entry's date.
   * @param numberOfOrders is the number of orders.
   * @param totalRevenue is the total revenue.
   */

  public RevenueTable(int id, LocalDate date, int numberOfOrders, float totalRevenue) {
    this.id = new SimpleIntegerProperty(id);
    this.date = new SimpleObjectProperty<>(date);
    this.numberOfOrders = new SimpleIntegerProperty(numberOfOrders);
    this.totalRevenue = new SimpleFloatProperty(totalRevenue);
  }

  /**
   * A getter for the ID.
   * 
   * @return the ID.
   */

  public int getID() {
    return id.get();
  }

  /**
   * A setter for the ID.
   * 
   * @param id the revenue ID.
   */

  public void setID(int id) {
    this.id.set(id);
  }

  /**
   * A getter for the date.
   * 
   * @return the date.
   */

  public LocalDate getDate() {
    return date.get();
  }

  /**
   * A setter for the date.
   * 
   * @param date the date.
   */

  public void setDate(LocalDate date) {
    this.date = new SimpleObjectProperty<>(date);
  }

  /**
   * A getter for the number of orders.
   * 
   * @return the number of orders.
   */

  public int getNumber_of_orders() {
    return numberOfOrders.get();
  }

  /**
   * A setter for the number of orders.
   * 
   * @param numberOfOrders is the number of orders.
   */

  public void setNumber_of_orders(int numberOfOrders) {
    this.numberOfOrders.set(numberOfOrders);
  }

  /**
   * A getter for the total revenue.
   * 
   * @return the total revenue.
   */

  public float getTotal_revenue() {
    return totalRevenue.get();
  }

  /**
   * A setter for the total revenue.
   * 
   * @param totalRevenue the total revenue.
   */

  public void setTotal_revenue(float totalRevenue) {
    this.totalRevenue.set(totalRevenue);
  }

  /**
   * The property value of the ID for use in the tablecolumn.
   * 
   * @return the integerProperty value of ID.
   */

  public IntegerProperty idProperty() {
    return id;
  }

  /**
   * The property value of the date for use in the tablecolumn.
   * 
   * @return the ObjectProperty value of date.
   */

  public ObjectProperty<LocalDate> dateProperty() {
    return date;
  }

  /**
   * The property value of the number of orders for use in the tablecolumn.
   * 
   * @return the integerProperty value of number of orders.
   */

  public IntegerProperty number_of_ordersProperty() {
    return numberOfOrders;
  }

  /**
   * The property value of the total revenue for use in the tablecolumn.
   * 
   * @return the FloatProperty value of total revenue.
   */

  public FloatProperty total_revenueProperty() {
    return totalRevenue;
  }


}
