package uk.ac.rhul.cs2810.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * The main class of application, this triggers the Landing page to be launched and therefore starts
 * the application.
 * 
 * @author Kevin
 */
public class Main extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Landing.fxml"));
    Scene menuScene = new Scene(root, 420, 800);
    menuScene.getStylesheets().add("application.css");
    primaryStage.setScene(menuScene);
    primaryStage.show();

    DisplayUtil.setMainStage(primaryStage);

  }

  /**
   * Default Java main method for begining an application, this launched the JavaFX components of
   * the application.
   * 
   * @param args ignore
   */
  public static void main(String[] args) {
    launch(args);
  }
}
