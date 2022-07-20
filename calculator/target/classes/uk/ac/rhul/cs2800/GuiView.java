package uk.ac.rhul.cs2800;


import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.stage.Stage;

/**
 * This is the GUI that the calculator program uses.
 * 
 * @author abitha
 *
 */
public class GuiView extends Application implements ViewInterface {

  CalcModel calculator = new CalcModel();
  boolean postfix; // As the toggle button starts not pressed, postfix is false at the start


  private static volatile GuiView instance = null;

  @FXML
  void initialize() {
    instance = this;
  }

  /**
   * This method creates an instance of the GUI to be used by the controller class.
   * 
   * @return an instance of the GUI view
   */
  public static synchronized GuiView getInstance() {
    if (instance == null) {
      new Thread(() -> Application.launch(GuiView.class)).start();
      while (instance == null) {
      }
    }

    return instance;
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("GuiView.fxml"));
    Scene scene = new Scene(root, 800, 500);
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  @FXML
  private TextField inputArea;


  @FXML
  private ToggleButton reversePolishToggle = null;

  @FXML
  private Button calculateButton = null;

  @FXML
  private Button resetButton = null;

  @Override
  public void addCalculateObserver(Observer f) {
    calculateButton.setOnAction(event -> f.notifyObservers()); // Notifies controller
  }


  @Override
  public void addResetObserver(Observer f) {
    resetButton.setOnAction(event -> f.notifyObservers()); // Notifies controller
  }

  @Override
  public void menu() { // Enables the buttons when the menu is called

    reversePolishToggle.setDisable(false); // This is the only way to enable a button is Javafx
    calculateButton.setDisable(false);
    resetButton.setDisable(false);
  }

  @Override
  public void setResult(String result) {
    inputArea.setText(result);

  }

  @Override
  public boolean isPostfix() {
    return reversePolishToggle.isPressed();
  }

  @Override
  public String getInput() {
    return inputArea.getText();
  }



}


