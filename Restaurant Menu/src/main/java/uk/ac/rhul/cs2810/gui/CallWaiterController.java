package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import uk.ac.rhul.cs2810.database.AlertManager;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * The CallWaiter Controller class that is used for the CallWaiter FXML file.
 * 
 * @author Kevin Lemon
 *
 */
public class CallWaiterController {


  @FXML
  private Button returnButton;

  private static CallWaiterController instance = new CallWaiterController();

  /** Returns the singleton instance of the controller. */
  public static CallWaiterController getInstance() {
    return instance;
  }

  /** Returns the stage of the CallWaiter window. */
  public Stage getStage() {
    return (Stage) returnButton.getScene().getWindow();
  }

  /**
   * This method uses the Alert creator method to insert an Alert into the database and then exits
   * the stage.
   */
  public void returnToMenu(ActionEvent event) {
    AlertManager.createAlert(null, TableNumberController.getInstance().getTableNumber(), 69420);
    getStage().close();
  }

  /**
   * Creates the CallWaiter stage.
   */
  public static void showCallWaiter() {
    try {
      DisplayUtil
          .createAdditionalStage("CallWaiter.fxml", 400, 200, "application.css", getInstance())
          .show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
