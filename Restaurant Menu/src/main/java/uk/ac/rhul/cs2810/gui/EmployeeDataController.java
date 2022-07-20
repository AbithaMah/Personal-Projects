package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import uk.ac.rhul.cs2810.database.StaffManager;
import uk.ac.rhul.cs2810.util.DatabaseManager;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * * This is the controller for the javafx employee data table. When the employee data table is
 * created it will create this class instance as its controller that will handle its behaviour and
 * interactions.
 * 
 * @author danielrogerson
 *
 */

public class EmployeeDataController {

  private DatabaseManager dm = DatabaseManager.getInstance();
  private String staffTableName = "staff";
  private static EmployeeDataController instance = new EmployeeDataController();
  private ObservableList<EmployeeDataTable> oblist;
  private StaffManager sm = StaffManager.getInstance();

  @FXML
  private TableView<EmployeeDataTable> employeedatatable = new TableView<EmployeeDataTable>(oblist);

  @FXML
  private TableColumn<EmployeeDataTable, Integer> colStaffID =
      new TableColumn<EmployeeDataTable, Integer>("ID");

  @FXML
  private TableColumn<EmployeeDataTable, String> colForename =
      new TableColumn<EmployeeDataTable, String>("forename");

  @FXML
  private TableColumn<EmployeeDataTable, String> colSurname =
      new TableColumn<EmployeeDataTable, String>("surname");

  @FXML
  private TableColumn<EmployeeDataTable, String> colRole =
      new TableColumn<EmployeeDataTable, String>("role");

  @FXML
  private Button deleteRow;

  @FXML
  private TextField rowID;

  @FXML
  private Label label;

  /**
   * Creates the singleton design pattern.
   * 
   * @return an instance of the class.
   */

  public EmployeeDataController getInstance() {
    return instance;
  }

  /**
   * Calls the initialise method for the employee table and displays the stage.
   * 
   * @throws IOException whenever an input or output operation fails.
   * @throws SQLException whenever the sql server returns an error with the statement.
   */

  public void showEmployeeDataTable() throws IOException, SQLException {
    initialize();
    DisplayUtil.createAdditionalStage("EmployeeData.fxml", 400, 420, "application.css", instance)
        .show();
  }

  /**
   * An initialiser for the initializeEmployeeDataMenu method.
   * 
   * @throws SQLException whenever the sql server returns an error with the statement.
   */

  public void initialize() throws SQLException {
    initializeEmployeeDataMenu();
  }

  /**
   * Creates the employee data table by adding the contents of the sql table into an observable
   * array list, then setting the table columns as the property values from the employeedatatable
   * class.
   * 
   * @throws SQLException whenever the sql server returns an error with the statement.
   */

  public void initializeEmployeeDataMenu() throws SQLException {

    ResultSet rs = dm.query(dm.createPreparedStatement("SELECT * FROM " + staffTableName));
    ObservableList<EmployeeDataTable> oblist = FXCollections.observableArrayList();
    try {
      while (rs.next()) {
        oblist.add(
            new EmployeeDataTable(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)));
        employeedatatable.setItems(oblist);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    colStaffID.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
    colForename.setCellValueFactory(cellData -> cellData.getValue().forenameProperty());
    colSurname.setCellValueFactory(cellData -> cellData.getValue().surnameProperty());
    colRole.setCellValueFactory(cellData -> cellData.getValue().roleProperty());
  }

  @FXML
  private void deleteEmployee(ActionEvent event) {

    if (rowID.getText().isEmpty()) {
      // Inform user that a field has been left empty.
      Alert informConfirmation = new Alert(AlertType.INFORMATION);
      informConfirmation.setHeaderText("You must enter a valid staff ID");
      informConfirmation.setContentText("The staff ID field has been left empty...");

      informConfirmation.show();
      return;
    }

    int idRow = Integer.parseInt(rowID.getText());
    if (sm.checkOut(idRow)) {
      label.setText(idRow + " has been deleted from the staff database");
    } else {
      label.setText("Unable to delete employee");
    }
  }
}