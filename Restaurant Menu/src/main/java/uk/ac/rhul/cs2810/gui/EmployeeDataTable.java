package uk.ac.rhul.cs2810.gui;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * A class for creating an object to be entered into the employee data table.
 * 
 * @author danielrogerson
 *
 */

public class EmployeeDataTable {

  private SimpleIntegerProperty id;
  private SimpleStringProperty forename = new SimpleStringProperty();
  private SimpleStringProperty surname = new SimpleStringProperty();
  private SimpleStringProperty role = new SimpleStringProperty();

  /**
   * A constructor to assign inputted values to property values.
   * 
   * @param id is the staff ID.
   * @param forename is the staff forename.
   * @param surname is the staff surname.
   * @param role is the staff role.
   */

  public EmployeeDataTable(int id, String forename, String surname, String role) {
    this.id = new SimpleIntegerProperty(id);
    this.forename = new SimpleStringProperty(forename);
    this.surname = new SimpleStringProperty(surname);
    this.role = new SimpleStringProperty(role);
  }

  /**
   * A getter for the staff ID.
   * 
   * @return the staff ID.
   */

  public int getID() {
    return id.get();
  }

  /**
   * A setter for the staff ID.
   * 
   * @param id the staff ID.
   */

  public void setID(int id) {
    this.id.set(id);
  }

  /**
   * A getter for the staff forename.
   * 
   * @return the staff forename.
   */

  public String getForename() {
    return this.forename.get();
  }

  /**
   * A setter for the staff forename.
   * 
   * @param forename the staff forename.
   */

  public void setForename(String forename) {
    this.forename.set(forename);
  }

  /**
   * A getter for the staff surname.
   * 
   * @return the staff surname.
   */

  public String getSurname() {
    return this.surname.get();
  }

  /**
   * A setter for the staff surname.
   * 
   * @param surname the staff surname.
   */

  public void setSurname(String surname) {
    this.surname.set(surname);
  }

  /**
   * A getter for the staff role.
   * 
   * @return the staff role.
   */

  public String getRole() {
    return this.role.get();
  }

  /**
   * A setter for the staff role.
   * 
   * @param role the staff role.
   */

  public void setRole(String role) {
    this.role.set(role);
  }

  /**
   * The property value of the staff ID for use in the tablecolumn.
   * 
   * @return the integerProperty value of staff ID.
   */

  public IntegerProperty idProperty() {
    return id;
  }

  /**
   * The property value of the staff forename for use in the tablecolumn.
   * 
   * @return the StringProperty value of staff forename.
   */

  public StringProperty forenameProperty() {
    return this.forename;
  }

  /**
   * The property value of the staff surname for use in the tablecolumn.
   * 
   * @return the StringProperty value of staff surname.
   */

  public StringProperty surnameProperty() {
    return this.surname;
  }

  /**
   * The property value of the staff role for use in the tablecolumn.
   * 
   * @return the StringProperty value of staff role.
   */

  public StringProperty roleProperty() {
    return this.role;
  }

}
