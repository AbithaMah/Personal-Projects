package uk.ac.rhul.cs2810.database;

import java.sql.ResultSet;
import java.sql.SQLException;
import uk.ac.rhul.cs2810.util.DatabaseManager;

/**
 * Class which manages all staff in the restaurant.
 *
 * @author zhac253
 *
 */
public class StaffManager {

  private static StaffManager instance = new StaffManager();
  private String staffTableName = "staff";

  private DatabaseManager dm = DatabaseManager.getInstance();

  /**
   * Ignore - For singleton instances.
   */

  public StaffManager() {

  }

  /**
   * Creates new staff table if needed.
   */
  public void createTable() {
    // if table already exists we exit the method
    if (dm.tableExists(staffTableName)) {
      return;
    }
    dm.execute(dm.createPreparedStatement(
        "CREATE TABLE `staff` (\r\n" + " `Staff_ID` integer AUTO_INCREMENT NOT NULL,\r\n"
            + " `Forename` varchar(24) NOT NULL,\r\n" + " `Surname` varchar(24) NOT NULL,\r\n"
            + " `Role` varchar(16) NOT NULL,\r\n" + " `Status` varchar(16) NOT NULL,\r\n"
            + " `Username` varchar(24) NOT NULL,\r\n" + " `Password` varchar(24) NOT NULL,\r\n"
            + " PRIMARY KEY (`Staff_ID`)\r\n" + ") ENGINE=InnoDB DEFAULT CHARSET=latin1"));
  }

  /**
   * Add new staff into table along with completed information.
   *
   * @param forename staff forename
   * @param surname staff surname
   * @param role staff members role
   * @param username the staff members username
   * @param password the staff members password
   */
  public void checkIn(String forename, String surname, String role, String username,
      String password) {
    int nextIdValue = dm.getNextAutoIncrement(staffTableName);
    if (!findMemberByID(nextIdValue)) {
      dm.execute(dm.createPreparedStatement("INSERT INTO " + staffTableName + "(`Staff_ID`,"
          + " `Forename`, `Surname`, `Role`, `Status`, `Username`, `Password`) " + "VALUES ('"
          + nextIdValue + "','" + forename + "','" + surname + "','" + role + "','Available','"
          + username + "','" + password + "')"));
    }
  }

  // INSERT INTO " + staffTableName + "(`Staff_ID`, `Forename`, `Surname`,
  // `Role`, `Status`, `Username`, `Password`)
  // VALUES (-1,'Test','Test','Waiter','Busy','Test','Test')

  /**
   * Deletes a staff member from the table along with all their information.
   *
   * @param staffID ID The desired staff member
   */
  public boolean checkOut(int staffID) {
    if (findMemberByID(staffID)) {
      dm.execute(dm.createPreparedStatement(
          "DELETE FROM " + staffTableName + " WHERE `Staff_ID` = " + staffID));
      System.out.println("Staff member deleted successfully");
      return true;
    } else {
      System.out.println("Staff member not found");
      return false;
    }
  }


  /**
   * Retrieves the username from the ID.
   *
   * @param username The username of the Staff that needs a linking ID
   * @return The ID of the username
   */
  public int getIdFromUsername(String username) {
    int user = 0;
    ResultSet rs = dm.query(dm.createPreparedStatement(
        "SELECT `Staff_ID` FROM " + staffTableName + " WHERE `Username` = '" + username + "'"));
    try {
      if (rs.next()) {
        user = rs.getInt(1);
      } else {
        user = -1;
      }
      rs.getStatement().close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return user;
  }

  /**
   * Tries to find a staff member from a given ID.
   *
   * @param nextIdValue The given ID for a member to be found
   * @return True if the staff member can be found in the table
   */
  private boolean findMemberByID(int nextIdValue) {
    boolean found = false;
    ResultSet rs = dm.query(dm.createPreparedStatement(
        "SELECT `Staff_ID` FROM " + staffTableName + " WHERE `Staff_ID` = " + nextIdValue));
    try {
      found = rs.next();
      rs.getStatement().close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return found;
  }

  /**
   * Return the first name of a given staff member.
   *
   * @param staffID ID of a staff member
   */
  public String getForename(int staffID) {
    String forename = "";
    if (findMemberByID(staffID)) {
      ResultSet rs = dm.query(dm.createPreparedStatement(
          "SELECT `Forename` FROM " + staffTableName + " WHERE `Staff_ID` = " + staffID));
      try {
        rs.next();
        forename = rs.getString(1);
        rs.getStatement().close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    } else {
      forename = "Staff not found.";
    }
    return forename;
  }

  /**
   * Sets the first name for a given staff member.
   *
   * @param staffID ID of a staff member
   */
  public void setForename(int staffID, String forename) {
    if (findMemberByID(staffID)) {
      dm.execute(dm.createPreparedStatement("UPDATE " + staffTableName + "" + " SET `Forename`= '"
          + forename + "' WHERE Staff_ID = " + staffID));
      System.out.println("Forename successfully changed.");
    } else {
      System.out.println("Forename change unsuccessful.");
    }
  }

  /**
   * Return the surname of a given staff member.
   *
   * @param staffID ID of a staff member
   */
  public String getSurname(int staffID) {
    String surname = "";
    if (findMemberByID(staffID)) {
      ResultSet rs = dm.query(dm.createPreparedStatement(
          "SELECT `Surname` FROM " + staffTableName + " WHERE `Staff_ID` = " + staffID));
      try {
        rs.next();
        surname = rs.getString(1);
        rs.getStatement().close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    } else {
      surname = "Staff not found.";
    }
    return surname;
  }

  /**
   * Sets the last name for a given member.
   *
   * @param staffID ID of a staff member
   */
  public void setSurname(int staffID, String surname) {
    if (findMemberByID(staffID)) {
      dm.execute(dm.createPreparedStatement("UPDATE " + staffTableName + "" + " SET `Surname`= '"
          + surname + "' WHERE Staff_ID = " + staffID));
      System.out.println("Surname successfully changed.");
    } else {
      System.out.println("Surname change unsuccessful.");
    }
  }

  /**
   * Returns the username of a given staff member.
   *
   * @param staffID ID of a staff member
   */
  public String getUsername(int staffID) {
    String username = "";
    if (findMemberByID(staffID)) {
      ResultSet rs = dm.query(dm.createPreparedStatement(
          "SELECT `Username` FROM " + staffTableName + " WHERE `Staff_ID` = " + staffID));
      try {
        rs.next();
        username = rs.getString(1);
        rs.getStatement().close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    } else {
      username = "Staff not found.";
    }
    return username;
  }

  /**
   * Sets the username for a given member.
   *
   * @param staffID ID of a staff member
   */
  public void setUsername(int staffID, String username) {
    if (findMemberByID(staffID)) {
      dm.execute(dm.createPreparedStatement("UPDATE " + staffTableName + "" + " SET `Username`= '"
          + username + "' WHERE Staff_ID = " + staffID));
      System.out.println("Username successfully changed.");
    } else {
      System.out.println("Username change unsuccessful.");
    }
  }

  /**
   * Returns the password for a given staff member.
   *
   * @param staffID ID of a staff member
   */
  public String getPassword(int staffID) {
    String password = "";
    if (findMemberByID(staffID)) {
      ResultSet rs = dm.query(dm.createPreparedStatement(
          "SELECT `Password` FROM" + " " + staffTableName + " WHERE `Staff_ID` = " + staffID));
      try {
        rs.next();
        password = rs.getString(1);
        rs.getStatement().close();
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    } else {
      password = "Staff not found.";
    }
    return password;
  }

  /**
   * Sets password for a given member.
   *
   * @param staffID ID of a staff member
   */
  public void setPassword(int staffID, String password) {
    if (findMemberByID(staffID)) {
      dm.execute(dm.createPreparedStatement("UPDATE " + staffTableName + "" + " SET `Password`= '"
          + password + "' WHERE Staff_ID = " + staffID));
      System.out.println("Password successfully changed.");
    } else {
      System.out.println("Password change unsuccessful.");
    }
  }

  /**
   * Returns the status for a given staff member.
   *
   * @param staffID ID of a staff member
   */
  public String getStatus(int staffID) {
    String status = "Staff not found.";;
    try {
      if (findMemberByID(staffID)) {
        ResultSet rs = dm.query(dm.createPreparedStatement(
            "SELECT `Status` FROM" + " " + staffTableName + " WHERE `Staff_ID` = " + staffID));
        rs.next();
        status = rs.getString(1);
        rs.getStatement().close();
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return status;
  }

  /**
   * Returns the role for a given staff member.
   *
   * @param staffID ID of a staff member
   */
  public String getRole(int staffID) {
    String role = "";
    ResultSet rs = dm.query(dm.createPreparedStatement(
        "SELECT `Role` FROM" + " " + staffTableName + " WHERE `Staff_ID` = " + staffID));
    try {
      if (findMemberByID(staffID)) {
        rs.next();
        role = rs.getString(1);
        rs.getStatement().close();
      } else {
        return "Staff not found.";
      }
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } finally {
      try {
        if (!rs.isClosed()) {
          rs.getStatement().close();
        }
      } catch (SQLException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }
    return role;
  }

  /**
   * Sets role for a given member.
   *
   * @param staffID ID of a staff member
   */
  public void setRole(int staffID, String role) {
    if (findMemberByID(staffID)) {
      dm.execute(dm.createPreparedStatement("UPDATE " + staffTableName + "" + " SET `Role`= '"
          + role + "' WHERE Staff_ID = " + staffID));
      System.out.println("Role successfully changed.");
    } else {
      System.out.println("Role change unsuccessful.");
    }
  }



  /**
   * Changes status between available and busy.
   *
   * @param staffID The ID of the staff
   */
  public void changeStatus(int staffID) {
    if (getStatus(staffID).equals("Available")) {
      dm.execute(dm.createPreparedStatement(
          "UPDATE `" + staffTableName + "` SET `Status`='Busy' " + "WHERE `Staff_ID`=" + staffID));
    } else {
      dm.execute(dm.createPreparedStatement("UPDATE `" + staffTableName
          + "` SET `Status`='Available' WHERE `Staff_ID` = " + staffID));
    }
  }

  /**
   * Returns staff id of random available waiter.
   *
   * @return Returns the id of an available waiter
   */
  public String allocWaiterStaff() {
    String id = "-1";
    ResultSet rs = dm.query(dm.createPreparedStatement(
        "SELECT Staff_ID FROM `" + staffTableName + "` ORDER BY RAND() LIMIT 1"));
    try {
      id = rs.getString(1);
      rs.getStatement().close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    // if no staffs are available
    return id;
  }

  /**
   * Creates the singleton for the staff manager.
   *
   * @return The instance of the staff manager
   */
  public static StaffManager getInstance() {
    return instance;
  }

}