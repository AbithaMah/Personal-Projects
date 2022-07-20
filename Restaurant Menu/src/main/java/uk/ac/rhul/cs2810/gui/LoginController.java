package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import uk.ac.rhul.cs2810.database.StaffManager;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * This is the controller for the Login javaFx menu. When the Login menu is created it will create
 * this class instance as its controller that will handle its behaviour and interactions.
 *
 * @author Kevin Lemon, danielrogerson, Dora Rozsavolgyi,zhac253
 *
 */

public class LoginController {
  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button kitchenButton;

  @FXML
  private Button managerButton;

  @FXML
  private Button loginButton;

  @FXML
  private TextField usernameField;

  @FXML
  private PasswordField passwordField;

  @FXML
  private Label invalidLoginLabel;

  private StaffManager sm = StaffManager.getInstance();

  @FXML
  void goToLanding(ActionEvent event) throws IOException {
    LandingController.showLanding();
  }

  @FXML
  void goToMenu(ActionEvent event) throws IOException {
    MenuView.showMenu();
  }

  /**
   * Protects the waiter login from invalid entry.
   * 
   * @param event the login button is pressed
   * @throws IOException If the UI could not be displayed
   */
  @FXML
  void loginButtonOnAction(ActionEvent event) throws IOException {

    String username = usernameField.getText();
    String password = passwordField.getText();
    int userID = sm.getIdFromUsername(username);
    String role = sm.getRole(userID);
    if (checkUserCredentials(userID, password)) {
      if (role.equals("Manager") || role.equals("Waiter")) {
        WaiterController.showWaiter();
      } else {
        invalidLoginLabel.setText("You do not have the correct permissions to access this.");
      }
    }
  }

  /**
   * Checks user credentials against stored user credentials.
   * 
   * @param file holds the user credentials to be checked against.
   * @param userID is the username entered by the user.
   * @param passID is the password entered by the user.
   * @return true if username and password are correct.
   * @throws IOException if an input or output operation fails.
   */
  boolean checkUserCredentials(int userID, String password) throws IOException {
    String logPass = sm.getPassword(userID);

    if (logPass.equals(password)) {
      return true; // if they match then then method returns true
    } else {
      invalidLoginLabel.setText("Wrong username or password.");
    }
    return false;
  }

  @FXML
  void initialize() {
    assert invalidLoginLabel != null : "fx:id=\"invalidLoginLabel\" was not injected:"
        + " check your FXML file 'Login.fxml'.";
    assert loginButton != null : "fx:id=\"loginButton\" was not injected: "
        + "check your FXML file 'Login.fxml'.";
    assert usernameField != null : "fx:id=\"usernameField\" was not injected: "
        + "check your FXML file 'Login.fxml'.";
    assert passwordField != null : "fx:id=\"passwordField\" was not injected: "
        + "check your FXML file 'Login.fxml'.";
    assert invalidLoginLabel != null : "fx:id=\"invalidLoginLabel\" was not injected: "
        + "check your FXML file 'Login.fxml'.";
  }

  /**
   * This shows the login stage.
   * 
   * @throws IOException If the UI could not be displayed
   */
  public static void showLogin() throws IOException {
    DisplayUtil.createStage("Login.fxml", 420, 800, "application.css", null).show();
  }

  /**
   * Protects the kitchen login from invalid entry.
   * 
   * @param event The kitchenButton is pressed
   * @throws IOException If the UI could not be displayed
   */
  @FXML
  void kitchenButtonPressed(ActionEvent event) throws IOException {
    String username = usernameField.getText();
    String password = passwordField.getText();
    int userID = sm.getIdFromUsername(username);
    String role = sm.getRole(userID);
    if (checkUserCredentials(userID, password)) {
      if (role.equals("Manager") || role.equals("Kitchen")) {
        KitchenController.showKitchen();
      } else {
        invalidLoginLabel.setText("You do not have the correct permissions to access this.");
      }
    }

  }


  /**
   * Protects the manager login from invalid entry.
   * 
   * @param event The managerButton is pressed
   * @throws IOException If the UI could not be displayed
   */
  @FXML
  void managerButtonPressed(ActionEvent event) throws IOException {
    String username = usernameField.getText();
    String password = passwordField.getText();
    int userID = sm.getIdFromUsername(username);
    String role = sm.getRole(userID);
    if (checkUserCredentials(userID, password)) {
      if (role.equals("Manager")) {
        ManagerController.showManager();
      } else {
        invalidLoginLabel.setText("You do not have the correct permissions to access this.");
      }
    }
  }

}
