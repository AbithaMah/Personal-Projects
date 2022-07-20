package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import uk.ac.rhul.cs2810.database.AlertManager;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * The Alert Controller class that is used for the Alert FXML file.
 * 
 * @author Kevin Lemon
 *
 */
public class AlertController {

  private static AlertController instance = new AlertController();

  @FXML
  Label alertTableNumber;

  /**
   * A static string is needed to retrieve the table number from a separate class.
   */
  static String staticTableNumber;

  @FXML
  private Button confirmButton;

  /** Returns the singleton instance of the manager controller. */
  public static AlertController getInstance() {
    return instance;
  }

  /**
   * A getter for the stage for use in the buttonClicked method to close it.
   * 
   * @return
   */
  @FXML
  public Stage getStage() {
    return (Stage) confirmButton.getScene().getWindow();
  }


  /**
   * Sets the table number on the waiter's alert display to the correct corresponding customer table
   * number.
   */
  public void initialize() {
    alertTableNumber.setText(staticTableNumber);
  }

  /**
   * Confirms and deletes the alert from the database and then closes the stage.
   * 
   */
  public void buttonClicked() {
    try {
      AlertManager.deleteAlert(69421);
    } catch (Exception e) {
      e.printStackTrace();
    }
    getStage().close();
  }

  /**
   * Opens the alert pop up stage.
   * 
   * @throws IOException thrown if the alert scene file could not be loaded or found.
   */
  @FXML
  static void openAlert() throws IOException {
    DisplayUtil.createAdditionalStage("Alert.fxml", 400, 200, "application.css",
        AlertController.getInstance()).show();

  }


}
