package uk.ac.rhul.cs2810.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import uk.ac.rhul.cs2810.object.Alert;
import uk.ac.rhul.cs2810.util.DatabaseManager;

/**
 * The Alert Manager class is where you can find all the wonderful methods needed to create, store
 * and otherwise use Alerts.
 * 
 * @author solsd
 *
 */
public class AlertManager {

  private static AlertManager instance = new AlertManager();
  private static String ALERT_TABLE_NAME = "alerts";
  public static String s;

  private static DatabaseManager dm = DatabaseManager.getInstance();

  private AlertManager() {}

  /**
   * Makes sure that the manager is alive and well.
   * 
   * @return the alert manager called instance
   */
  public static AlertManager getInstance() {
    return instance;
  }

  /**
   * Shockingly enough, this one makes an Alert table if one doesn't exist already.
   */
  public static void createAlertTable() {
    // Checks for an already created table.
    if (dm.tableExists(ALERT_TABLE_NAME)) {
      return;
    }
    dm.execute(dm.createPreparedStatement("CREATE TABLE " + ALERT_TABLE_NAME + "(`ID` integer,"
        + "`Time Sent` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,"
        + "`Table Number` INT NOT NULL," + "`Order ID` INT NOT NULL," + "PRIMARY KEY (`ID`));"));
    System.out.println("Created " + ALERT_TABLE_NAME + " table!");
  }

  /**
   * Method to create alert based life out of thin air. IM A GOD MWHAHAHAHAHAHA!
   * 
   * @param timeSent is the time the alert was sent to the waiters
   * @param tableNum is the identification of the table where the alert came from
   * @param orderID is what determines the order associated with the alert
   * @return
   */
  public static Alert createAlert(Date timeSent, int tableNum, int orderID) {
    if (!dm.tableExists(ALERT_TABLE_NAME)) {
      createAlertTable();
    }

    int nextId = dm.getNextAutoIncrement(ALERT_TABLE_NAME);

    // Insert item into the database
    dm.execute(dm.createPreparedStatement(
        "INSERT INTO `" + ALERT_TABLE_NAME
            + "` (`ID`, `Time Sent`, `Table Number`, `Order ID`) VALUES (?,?,?,?)",
        nextId, timeSent, tableNum, orderID));

    System.out.println("Alert [" + nextId + "] has been created and inserted into the database!");
    return new Alert(nextId, timeSent, tableNum, orderID);
  }

  /**
   * This one checks to see if a specific alert is vibing in the table.
   * 
   * @param alertID is needed to specify which alert we're looking for
   * @return true or false depending
   */
  public static boolean alertExists(int alertID) {
    ResultSet rs = dm.query(dm.createPreparedStatement(
        "SELECT * FROM `" + ALERT_TABLE_NAME + "` WHERE `Order ID`=?", alertID));
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
   * This updates the order ID once the alert has been sent to the waiter.
   */
  public static void changeOrderID() {
    dm.execute(dm.createPreparedStatement(
        "UPDATE `alerts` SET `Order ID` = '69421' WHERE `alerts`.`Order ID` = 69420"));
  }


  /**
   * Retrieves the table number from the database to display in the alert.
   */
  public static void getTableNumber() {
    DatabaseManager dm = DatabaseManager.getInstance();
    ResultSet rs = null;
    try {
      rs = dm.query(dm.createPreparedStatement(
          "SELECT * FROM `" + ALERT_TABLE_NAME + "` WHERE `Order ID`= 69420"));
      if (rs.next()) {
        s = String.valueOf(rs.getInt("Table Number"));
      }
    } catch (SQLException e1) {
      e1.printStackTrace();
    } finally {
      try {
        rs.getStatement().close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  /**
   * Delete the alert from the table.
   * 
   * @param alertID is used so we know which one to delete
   * @throws Exception if the specific alert does not exist.
   */
  public static void deleteAlert(int alertID) throws Exception {
    if (!alertExists(alertID)) {
      throw new Exception("The [Alert Item Id=" + alertID + "] does not exist!");
    }

    dm.execute(dm.createPreparedStatement(
        "DELETE FROM `" + ALERT_TABLE_NAME + "` WHERE `Order ID`=?", alertID));
  }

}

