package uk.ac.rhul.cs2810.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Controller class for the allergen filtering. This class is created alongside the creation of the
 * scene itself.
 * 
 * @author Dora Rozsavolgyi
 *
 */
public class AllergenFilteringController {

  private MenuView controller;

  @FXML
  private CheckBox eggCheckbox;

  @FXML
  private CheckBox milkCheckbox;

  @FXML
  private CheckBox fishCheckbox;

  @FXML
  private CheckBox nutsCheckbox;

  @FXML
  private CheckBox wheatCheckbox;

  @FXML
  private CheckBox soyCheckbox;

  @FXML
  private Button confirmAllergenButton;

  // Methods for checking if a checkbox has been ticked.

  /** Returns if the Egg checkbox is checked. */
  public boolean isEggChecked() {
    return eggCheckbox.isSelected();
  }

  /** Returns if the Milk checkbox is checked. */
  public boolean isMilkChecked() {
    return milkCheckbox.isSelected();
  }

  /** Returns if the Fish checkbox is checked. */
  public boolean isFishChecked() {
    return fishCheckbox.isSelected();
  }

  /** Returns if the Nuts checkbox is checked. */
  public boolean isNutsChecked() {
    return nutsCheckbox.isSelected();
  }

  /** Returns if the Wheat checkbox is checked. */
  public boolean isWheatChecked() {
    return wheatCheckbox.isSelected();
  }

  /** Returns if the Soy checkbox is checked. */
  public boolean isSoyChecked() {
    return soyCheckbox.isSelected();
  }

  @FXML // This method is called by the FXMLLoader when initialization is complete
  void initialize() {
    assert eggCheckbox != null : "fx:id=\"eggCheckbox\" was not injected: "
        + "check your FXML file 'AllergenFiltering2.fxml'.";
    assert milkCheckbox != null : "fx:id=\"milkCheckbox\" was not injected: "
        + "check your FXML file 'AllergenFiltering2.fxml'.";
    assert fishCheckbox != null : "fx:id=\"fishCheckbox\" was not injected: "
        + "check your FXML file 'AllergenFiltering2.fxml'.";
    assert nutsCheckbox != null : "fx:id=\"nutsCheckbox\" was not injected: "
        + "check your FXML file 'AllergenFiltering2.fxml'.";
    assert wheatCheckbox != null : "fx:id=\"wheatCheckbox\" was not injected: "
        + "check your FXML file 'AllergenFiltering2.fxml'.";
    assert soyCheckbox != null : "fx:id=\"soyCheckbox\" was not injected: "
        + "check your FXML file 'AllergenFiltering2.fxml'.";
    assert confirmAllergenButton != null : "fx:id=\"confirmAllergenButton\" was not "
        + "injected: check your FXML file 'AllergenFiltering2.fxml'.";

  }

  /**
   * Constructor for assigning the controller of the menu controller.
   * 
   * @param controller The menu view's controller instance
   */
  public AllergenFilteringController(MenuView controller) {
    this.controller = controller;
  }

  @FXML
  void confirmAllergenFilter(ActionEvent event) {
    BorderPane border = new BorderPane();
    border.setPrefHeight(230);
    border.setPrefWidth(400);
  }

  // Calls the filtering out of allergens and closes the window once selection is
  // confirmed.
  @FXML
  void confirmAllergen(ActionEvent event) {
    controller.insertAllergenItems();
    close();
  }

  @FXML
  void closeWindow(ActionEvent event) {
    close();
  }

  /** Closes the allergen filtering window. */
  public void close() {
    ((Stage) confirmAllergenButton.getScene().getWindow()).close();
  }
}
