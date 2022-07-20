package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * Controller class for the Landing JavaFX scene.
 * 
 * @author Kevin
 *
 */
public class LandingController {

  @FXML
  public void menuPressed(ActionEvent event) {
    TableNumberController.getInstance().showTableSelector();
  }

  @FXML
  public static void showLanding() throws IOException {
    DisplayUtil.createStage("Landing.fxml", 420, 800, "application.css", null).show();
  }

  /**
   * Directs the user back to the login page.
   */
  @FXML
  public void goToLogin() {
    try {
      LoginController.showLogin();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
