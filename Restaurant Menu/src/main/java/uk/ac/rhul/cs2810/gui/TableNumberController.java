package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import uk.ac.rhul.cs2810.util.DisplayUtil;

public class TableNumberController {

  private static TableNumberController instance = new TableNumberController();
  private static int maxTableNum = 20;
  private int tableNumber = 0;

  @FXML
  private ResourceBundle resources;

  @FXML
  private URL location;

  @FXML
  private Button confirmTableButton;

  @FXML
  private ChoiceBox<String> tableNumChoices;

  @FXML
  int confirmTableNumber() {
    int tableNum = Integer
        .parseInt(tableNumChoices.getSelectionModel().getSelectedItem().replaceAll("Table ", ""));
    close();
    try {
      MenuView.showMenu();
    } catch (IOException e) {
      e.printStackTrace();
    }
    tableNumber = tableNum;
    return tableNum;
  }

  @FXML
  void initialize() {
    assert confirmTableButton != null : "fx:id=\"confirmTableButton\" was not injected: "
        + "check your FXML file 'TableNumber.fxml'.";

    // Assign table numbers to choices
    for (int i = 1; i < maxTableNum; i++) {
      tableNumChoices.getItems().add("Table " + i);
    }
  }

  public int getTableNumber() {
    return tableNumber;
  }

  /**
   * This will display the table number selector window.
   */
  public void showTableSelector() {
    // Load the Table number selection menu
    try {
      DisplayUtil.createAdditionalStage("TableNumber.fxml", 400, 200, "application.css", instance)
          .show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public Stage getStage() {
    return (Stage) confirmTableButton.getScene().getWindow();
  }

  public void close() {
    getStage().close();
  }

  public static TableNumberController getInstance() {
    return instance;
  }
}
