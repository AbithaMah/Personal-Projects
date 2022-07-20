package uk.ac.rhul.cs2810.util;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import uk.ac.rhul.cs2810.object.TableItem;

/**
 * Handles the creation of the order history document that helps 
 * managers of the restaurant check the
 * quantity of items that needs to be stocked up.
 * 
 * @author Abitha M
 *
 */
public class OrderHistory {

  private List<TableItem> itemTable = new ArrayList<TableItem>();
  private List<String> queue = new ArrayList<String>();

  private String orders = "";

  /**
   * Adds an order to the order history queue.
   * 
   * @param order the order to add to the queue.
   */
  public void addOrder(String order) {
    queue.add(order);
  }

  /**
   * Creates the file that will contain all the order history details.
   */
  public void createOrderFiles() {
    try {
      orders += "LIST OF ALL ORDERED ITEMS AND THEIR RESPECTIVE REVENUE\n\n";
      this.digestableString();

      for (int i = 0; i < itemTable.size(); i++) {
        orders += itemTable.get(i).toString();
        orders += "\n\n";
      }
      orders += "\n\n\n---------FULL LIST OF ORDERS---------\n\n";

      for (int i = 0; i < queue.size(); i++) {
        orders += "------Order number: " + i + "-----------\n";
        orders += queue.get(i);
        orders += "\n\n";
      }
      


      URL path = OrderHistory.class.getResource("OrdersList.txt");


      FileWriter writer =
          new FileWriter(path.getFile());
      
      writer.write(orders);
      orders = "";
      writer.close();
    } catch (IOException e) {
      System.out.print("file not found");
    }
  }
  
  
  /**
   * This method extracts the data from the string and creates a respective TableItem.
   * 
   */
  public void digestableString() {
    for (int i = 0; i < queue.size(); i++) {
      for (int j = 0; j < queue.get(i).length(); j++) {
        if (queue.get(i).charAt(j) == ']') {

          String tempItem = "";
          Double tempTotal;
          j++;
          
          int tempAmount = Character.getNumericValue(queue.get(i).charAt(j - 1));

          while (queue.get(i).charAt(j) != '(') {
            tempItem += queue.get(i).charAt(j);
            j++;
          }
          tempTotal = Double.parseDouble(queue.get(i).substring(j + 2, j + 6));
          this.addTable(tempItem, tempAmount, tempTotal);
        }
      }
    }
  }

  /**
   * Adds a table item to the table.
   * 
   * @param item name of the item
   * @param amount quantity of the item
   * @param price the cost of the item
   */
  public void addTable(String item, int amount, Double price) {

    boolean newItem = true;

    for (int i = 0; i < itemTable.size(); i++) {
      if (item.equals(itemTable.get(i).getItem())) {
        itemTable.get(i).addAmount(amount);
        newItem = false;
      }
    }
    if (newItem) {
      itemTable.add(new TableItem(item, amount, price));
    }
  }


}
