package uk.ac.rhul.cs2810.object;

/**
 * A class which defines a staff member.
 * 
 * @author zhac253
 */
public class Staff {

  private int staffID;
  private String forename;
  private String surname;
  private String role;
  private String username;
  private String password;
  private String status;

  /**
   * Constructor for a Staff member.
   * 
   * @param staffID The staff ID
   * @param forename The staff members first name
   * @param surname The staff members surname
   * @param role The role of the staff member, 'Waiter', 'Manager', 'Kitchen'
   * @param username The username of the account of the staff member
   * @param password The password of the account of the staff member
   * @param status Either Available or Busy
   */
  public Staff(int staffID, String forename, String surname, String role, String username,
      String password, String status) {
    this.staffID = staffID;
    this.forename = forename;
    this.surname = surname;
    this.role = role;
    this.password = password;
    this.setStatus(status);
  }
  
  /** Returns the staffs id. */
  public int getStaffID() {
    return staffID;
  }

  /**
   * Sets the ID of the staff member.
   * 
   * @param staffID unique Id.
   */
  public void setStaffID(int staffID) {
    this.staffID = staffID;
  }

  /** Returns the forname of the staff member. */
  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  /** Returns the surname of the staff member. */
  public String getSurname() {
    return surname;
  }

  /**
   * Sets the surname of the staff member.
   * 
   * @param surname the surname of the person.
   */
  public void setSurname(String surname) {
    this.surname = surname;
  }

  /** Returns the role of the staff member. */
  public String getRole() {
    return role;
  }

  /**
   * Sets the role of the staff member.
   * 
   * @param role The role the staff member plays, manager, waiter...
   */
  public void setRole(String role) {
    this.role = role;
  }

  /** Returns the username of the staff member. */
  public String getUsername() {
    return username;
  }

  /**
   * Sets the username for the staff members account.
   * 
   * @param username staff members username used to log in with.
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /** Returns the password of the staff member. */
  public String getPassword() {
    return password;
  }

  /**
   * Sets the password for the staff members account.
   * 
   * @param password staff members secret password.
   */
  public void setPassword(String password) {
    this.password = password;
  }

  /** Returns the status of the staff memeber. */
  public String getStatus() {
    return status;
  }

  /**
   * Sets the status of the staff member.
   * 
   * @param status Either available or not
   */
  public void setStatus(String status) {
    this.status = status;
  }


}
