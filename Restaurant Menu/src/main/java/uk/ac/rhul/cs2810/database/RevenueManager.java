package uk.ac.rhul.cs2810.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import uk.ac.rhul.cs2810.gui.ManagerController;
import uk.ac.rhul.cs2810.object.Order;
import uk.ac.rhul.cs2810.util.DatabaseManager;

/**
 * The manager class for all implementations of the revenue table.
 * 
 * @author danielrogerson
 *
 */

public class RevenueManager {

  private static RevenueManager instance = new RevenueManager();
  private ManagerController mc = ManagerController.getInstance();
  private DatabaseManager dm = DatabaseManager.getInstance();
  private OrderManager om = OrderManager.getInstance();

  private String revenueTableName = "revenue";

  /**
   * Creates the revenue table if it hasn't already been created.
   */

  public void createRevenueTable() {
    if (dm.tableExists(revenueTableName)) {
      return;
    }
    // The table does not exist so it needs to be created.
    dm.execute(dm.createPreparedStatement("CREATE TABLE " + revenueTableName
        + "(id integer AUTO_INCREMENT,"
        + "date Date, number_of_orders integer, total_revenue decimal(8,2), PRIMARY KEY(id));"));

    System.out.println("Created revenue table!");

  }

  /**
   * Creates the singleton design pattern.
   */

  public RevenueManager() {

  }

  /**
   * Creates an object to push into the revenue table in the database.
   */

  public void pushToRev() {
    if (!dm.tableExists(revenueTableName)) {
      createRevenueTable();
    }
    int nextIdValue = dm.getNextAutoIncrement(revenueTableName);
    int nooforders = noOfOrders();
    float totalrev = total_Revenue();
    ActionEvent event = null;

    LocalDate date = (mc.selectDate(event));

    if (date == null) {
      // Inform user that the date has not been set.
      Alert informConfirmation = new Alert(AlertType.INFORMATION);
      informConfirmation.setHeaderText("You need to set a date!");
      informConfirmation.setContentText("A date has not been selected in the date picker...");

      informConfirmation.show();
      return;
    }

    dm.execute(
        dm.createPreparedStatement(
            "INSERT INTO `" + revenueTableName
                + "` (`id`,`date`, `number_of_orders`, `total_revenue`) " + "VALUES (?,?,?,?)",
            nextIdValue, date, nooforders, totalrev));

    System.out.println("Revenue statistics for date [" + date
        + "] have been created and inserted into the Revenue database!");

    om.deleteAllOrders();
  }

  /**
   * Collates the number of orders from the order table.
   * 
   * @return the number of orders.
   */

  public int noOfOrders() {
    return OrderManager.getInstance().getAllOrders().size();
  }

  /**
   * Collates the total revenue from the order table.
   * 
   * @return the total revenue.
   */

  public float total_Revenue() {
    float total = 0;
    OrderManager om = OrderManager.getInstance();
    List<Order> orders = om.getAllOrders();
    for (Order o : orders) {
      total += o.getTotalBill();
    }
    return total;
  }

  /**
   * Deletes a row from the revenue table in the database.
   * 
   * @param idRow is the unique ID used to determine which row to delete.
   * @return true if revenue data is deleted.
   * @throws Exception if there is an SQL error.
   */

  public boolean deleteRevStat(String idRow) throws Exception {
    ResultSet rs = dm.query(
        dm.createPreparedStatement("SELECT * FROM " + revenueTableName + " WHERE id=?", idRow));
    try {
      if (!rs.next()) {
        rs.getStatement().close();
        throw new Exception("The [Revenue Id=" + idRow + "] does not exist!");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    dm.execute(
        dm.createPreparedStatement("DELETE FROM `" + revenueTableName + "` WHERE id=?", idRow));
    return true;
  }

  /**
   * Creates an instance of the RevenueManager class for use in other classes.
   * 
   * @return An instance of the class.
   */

  public static RevenueManager getInstance() {
    return instance;
  }

}