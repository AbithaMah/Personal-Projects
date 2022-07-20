package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import uk.ac.rhul.cs2810.database.StaffManager;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * Controller class for the addStaff JavaFX scene. Used for adding new staff members to the staff
 * database.
 * 
 * @author Daniel
 *
 */
public class AddStaffController {

  @FXML
  private TextField idField;

  @FXML
  private TextField forenameField;

  @FXML
  private TextField surnameField;

  @FXML
  private TextField roleField;

  @FXML
  private TextField usernameField;

  @FXML
  private TextField passwordField;

  @FXML
  private Button addStaffToDatabase;

  @FXML
  private Label staffLabel;

  private StaffManager sm = StaffManager.getInstance();
  private static AddStaffController instance = new AddStaffController();


  @FXML
  void pushStaff(ActionEvent event) throws IOException {

    String forename = forenameField.getText();
    String surname = surnameField.getText();
    String role = roleField.getText();
    String username = usernameField.getText();
    String password = passwordField.getText();

    if (forename.isEmpty() || surname.isEmpty() || role.isEmpty() || username.isEmpty()
        || password.isEmpty()) {
      // Inform user that a field has been left empty.
      Alert informConfirmation = new Alert(AlertType.INFORMATION);
      informConfirmation.setHeaderText("You must provide all staff information");
      informConfirmation.setContentText("One or multiple entry fields have been left empty...");

      informConfirmation.show();
      return;
    }

    if (role.equals("Waiter") || role.equals("Manager") || role.equals("Kitchen")) {
      sm.checkIn(forename, surname, role, username, password);
      staffLabel.setText(forename + " has been added to the staff database");
    } else {
      staffLabel.setText("Please enter a valid role.");
    }
  }

  /**
   * Returns the singleton instance of the AddStaffController.
   * 
   * @return
   */

  public static AddStaffController getInstance() {
    return instance;
  }

  /**
   * Shows the add staff window.
   * 
   * @throws IOException thrown if the FXML loader cannot find the scene.
   */

  public static void showAddStaff() throws IOException {
    DisplayUtil.createAdditionalStage("AddStaff.fxml", 350, 350, "application.css", instance)
        .show();
  }

}

