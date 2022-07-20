package uk.ac.rhul.cs2810.object;

import java.util.Date;

/**
 * Class for Alert constructor and it's getters.
 * 
 * @author solsd
 *
 */
public class Alert {

  private int id;
  private Date timeSent;
  private int tableNum;
  private int orderID;

  /**
   * Constructor for Alerts.
   * 
   * @param id is the primary key for the Alert. MUST NOT BE DUPLICATED.
   * @param timeSent is the time the alert was sent to the waiters
   * @param tableNum is the identification of the table where the alert came from
   * @param orderID is what determines the order associated with the alert
   */
  public Alert(int id, Date timeSent, int tableNum, int orderID) {
    this.id = id;
    this.timeSent = timeSent;
    this.tableNum = tableNum;
    this.orderID = orderID;
  }

  /**
   * Method gets ID of alert.
   * 
   * @return id of alert
   */
  public int getId() {
    return id;
  }

  /**
   * Method gets time of alert.
   * 
   * @return time the alert was sent
   */
  public Date getTimeSent() {
    return timeSent;
  }

  /**
   * Method gets table number of alert.
   * 
   * @return the table where the alert came from
   */
  public int getTableNum() {
    return tableNum;
  }

  /**
   * Method gets orderID of alert.
   * 
   * @return the order associated with the alert
   */
  public int getOrderID() {
    return orderID;
  }

}
