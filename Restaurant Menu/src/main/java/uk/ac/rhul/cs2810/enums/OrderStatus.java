package uk.ac.rhul.cs2810.enums;

/**
 * Status enumerator for the order to hold the different states it is in within the management
 * system. These states allow for a sequential process from one state to the next.
 * 
 * @author Marley Dey
 *
 */
public enum OrderStatus {
  ORDERED("Ordered"), CONFIRMED("Confirmed"), PREPARED("Prepared"), DELIVERED("Delivered"), PAID(
      "Paid");

  private String formatedName;

  /**
   * Constructor that assigns the formatted name of each of the status.
   * @param formatedName formated strings for the names of each status.
   */
  private OrderStatus(String formatedName) {
    this.formatedName = formatedName;
  }

  /** Returns the formated name of the status. */
  public String toString() {
    return formatedName;
  }

}
