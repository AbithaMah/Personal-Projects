package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ToolBar;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import uk.ac.rhul.cs2810.database.MenuItemManager;
import uk.ac.rhul.cs2810.database.RevenueManager;
import uk.ac.rhul.cs2810.enums.ItemType;
import uk.ac.rhul.cs2810.object.MenuItem;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * Controller class for the Manager scene.
 *
 * @author Dori Rozsavolgyi, Daniel Rogerson, Marley Dey
 *
 */
public class ManagerController {

  /** The instance. */
  private static ManagerController instance = new ManagerController();

  private static PriceEditorController priceEditorController = null;
  private static RevenueManager rm = new RevenueManager();

  private EmployeeDataController employeeInstance = new EmployeeDataController();
  private RevenueController revControllerInstance = new RevenueController();

  /** The resources. */
  @FXML
  private ResourceBundle resources;

  /** The location. */
  @FXML
  private URL location;

  /** The logout button. */
  @FXML
  private Button logoutButton;

  /** The vbox that holds the menu items that can be modified. */
  @FXML
  private VBox menuVbox;

  /** The employee data button. */
  @FXML
  private Button employeeDataButton;

  /** The sales data button. */
  @FXML
  private Button salesDataButton;

  @FXML
  private DatePicker datePicker;

  @FXML
  private Button newDay;

  @FXML
  private Button addStaffButton;

  /**
   * On logout.
   *
   * @param event the event
   * @throws IOException Signals that an I/O exception has occurred.
   */
  @FXML
  void onLogout(ActionEvent event) throws IOException {
    LandingController.showLanding();
  }

  /**
   * Inserts all the menu items with buttons to edit aspects of the item such as price, title and
   * description.
   */
  private void insertModifiableMenuItems() {
    MenuItemManager mim = MenuItemManager.getInstance();

    // Get all the items in the menu
    List<MenuItem> items = mim.getAllMenuItems();

    // Check that items exist in the database.
    if (items == null) {
      menuVbox.getChildren().add(new Label("No items could be found!"));
      return;
    }

    for (MenuItem item : items) {

      // Title of item with basic font style
      Text title = new Text(200, 60, item.getName()
          + (item.getType() != ItemType.REGULAR ? " (" + item.getType().toString() + ")" : ""));
      title.setStyle(
          "-fx-font-family: Perpetua; " + "-fx-font-size: 22; " + "-fx-font-weight: Normal;");
      title.setWrappingWidth(180);


      // The tool-bar for modification buttons such as price editing
      Button pricesButton = new Button("Edit Price");

      // Event Handling below

      pricesButton.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent e) {
          openPriceEditor(item.getMenuItemID());
        }
      });


      ToolBar toolbar = new ToolBar();

      // Adds all the text and buttons to build up the ButtonBar
      toolbar.getItems().addAll(pricesButton);
      toolbar.setPrefWidth(60);
      toolbar.setStyle("-fx-background-radius: 6");
      toolbar.setStyle("-fx-background-color: linear-gradient(from 50% 50% to 100% 100%, white, "
          + "rgb(206, 18, 38))");

      ButtonBar itemDisplayBar = new ButtonBar();
      itemDisplayBar.getButtons().addAll(title, toolbar);
      itemDisplayBar.setStyle("-fx-background-radius: 6");
      itemDisplayBar.setStyle(
          "-fx-background-color: linear-gradient(from 0% 0% to 20% 20%, rgb(0, 104,71), white)");

      // Add the ButtonBar to the menu's V box container.
      menuVbox.getChildren().add(itemDisplayBar);
    }
  }

  /*
   * Opens the price editor givin its itemID, this generates the window for the manager to edit the
   * price of the item.
   */
  private void openPriceEditor(int itemId) {

    // Close the previous details window before opening the next one.
    if (priceEditorController != null) {
      priceEditorController.close();
    }

    try {
      // Load the details menu
      DisplayUtil.createAdditionalStage("PriceEditor.fxml", 400, 240, "application.css",
          priceEditorController = new PriceEditorController(itemId)).show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /** Returns the singleton instance of the manager controller. */
  public static ManagerController getInstance() {
    return instance;
  }

  /**
   * This opens the manager UI for after a member of staff logs into the login page and are a
   * manager.
   *
   * @throws IOException If the file could not not be opened and/or found
   */
  public static void showManager() throws IOException {
    DisplayUtil.createStage("Manager.fxml", 420, 800, "application.css", instance).show();
  }

  @FXML
  void initialize() {
    assert logoutButton != null : "fx:id=\"logoutButton\" was not injected: "
        + "check your FXML file 'Manager.fxml'.";
    assert menuVbox != null : "fx:id=\"managerVbox\" was not injected: "
        + "check your FXML file 'Manager.fxml'.";
    assert employeeDataButton != null : "fx:id=\"employeeDataButton\" was not injected: "
        + "check your FXML file 'Manager.fxml'.";
    assert salesDataButton != null : "fx:id=\"salesDataButton\" was not injected: "
        + "check your FXML file 'Manager.fxml'.";

    insertModifiableMenuItems();
  }

  @FXML
  void onStartDay(ActionEvent event) throws IOException {
    rm.pushToRev();
  }

  /**
   * Fetches the date from the datepicker.
   * 
   * @param event the JavaFX event
   * @return the LocalDate date.
   */
  @FXML
  public LocalDate selectDate(ActionEvent event) {
    LocalDate date = datePicker.getValue();
    return date;
  }

  @FXML
  void initializeMenu(ActionEvent event) throws IOException, SQLException {
    revControllerInstance.showRevenueTable();
  }

  @FXML
  void initializeEmployeeMenu(ActionEvent event) throws IOException, SQLException {
    employeeInstance.showEmployeeDataTable();
  }

  @FXML
  void addStaff(ActionEvent event) throws IOException {
    uk.ac.rhul.cs2810.gui.AddStaffController.showAddStaff();
  }
}
