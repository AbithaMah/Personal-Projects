package uk.ac.rhul.cs2810.util;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class DisplayUtil {

  private static Stage mainStage;

  /**
   * Method for creating JavaFX stages, this is a long process so this method will load and create
   * the stage and return it ready to show it. This removes the need to load the stage in the
   * controllers all the time.
   * 
   * @param file The name of the fxml file.
   * @param width The desired width of the window.
   * @param height The desired height of the window.
   * @param stylesheet The name of the stylesheet file.
   * @param controller The controller class of the view.
   * @return The loaded and prepared stage.
   * @throws IOException If the fxml file could not be found and or loaded.
   */
  public static Stage createStage(String file, int width, int height, String stylesheet,
      Object controller) throws IOException {
    FXMLLoader loader = new FXMLLoader(DisplayUtil.class.getClassLoader().getResource(file));
    if (controller != null) {
      loader.setController(controller);
    }
    Parent window = loader.load();
    Scene basketScene = new Scene(window, width, height);
    if (stylesheet != null) {
      basketScene.getStylesheets().add(stylesheet);
    }

    mainStage.setScene(basketScene);
    return mainStage;

  }

  /**
   * Method for creating JavaFX stages, this is a long process so this method will load and create
   * the stage and return it ready to show it. This removes the need to load the stage in the
   * controllers all the time. This however creates a new stage, and does not use the parent stage.
   * 
   * @param file The name of the fxml file.
   * @param width The desired width of the window.
   * @param height The desired height of the window.
   * @param stylesheet The name of the stylesheet file.
   * @param controller The controller class of the view.
   * @return The loaded and prepared stage.
   * @throws IOException If the fxml file could not be found and or loaded.
   */
  public static Stage createAdditionalStage(String file, int width, int height, String stylesheet,
      Object controller) throws IOException {
    FXMLLoader loader = new FXMLLoader(DisplayUtil.class.getClassLoader().getResource(file));
    if (controller != null) {
      loader.setController(controller);
    }

    Parent window = loader.load();
    Scene scene = new Scene(window, width, height);
    if (stylesheet != null) {
      scene.getStylesheets().add(stylesheet);
    }
    Stage stage = new Stage();

    // Displays a NEW window with the parsed details string
    stage.setScene(scene);
    return stage;
  }

  /**
   * Sets the main stage of the application.
   * 
   * @param stage the stage to become the main stage.
   */
  public static void setMainStage(Stage stage) {
    mainStage = stage;
  }

  /** Returns the main stage of the application. */
  public static Stage getMainStage() {
    return mainStage;

  }

}
