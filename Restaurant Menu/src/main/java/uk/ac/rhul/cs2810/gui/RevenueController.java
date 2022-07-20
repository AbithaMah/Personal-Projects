package uk.ac.rhul.cs2810.gui;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import uk.ac.rhul.cs2810.database.RevenueManager;
import uk.ac.rhul.cs2810.util.DatabaseManager;
import uk.ac.rhul.cs2810.util.DisplayUtil;

/**
 * This is the controller for the javafx revenue table. When the revenue table is created it will
 * create this class instance as its controller that will handle its behaviour and interactions.
 * 
 * @author danielrogerson
 *
 */

public class RevenueController {

  private DatabaseManager dm = DatabaseManager.getInstance();
  private String revenueTableName = "revenue";
  private static RevenueController instance = new RevenueController();
  private ObservableList<RevenueTable> oblist;
  private RevenueManager rm = RevenueManager.getInstance();

  @FXML
  private TableView<RevenueTable> revenuetable = new TableView<RevenueTable>(oblist);

  @FXML
  private TableColumn<RevenueTable, Integer> colId = new TableColumn<RevenueTable, Integer>("ID");

  @FXML
  private TableColumn<RevenueTable, LocalDate> colDate =
      new TableColumn<RevenueTable, LocalDate>("Date");

  @FXML
  private TableColumn<RevenueTable, Integer> colNoOfOrders =
      new TableColumn<RevenueTable, Integer>("Number_of_orders");

  @FXML
  private TableColumn<RevenueTable, Float> colTotalRevenue =
      new TableColumn<RevenueTable, Float>("Total_revenue");

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

  public RevenueController getInstance() {
    return instance;
  }

  /**
   * Calls the initialise method for the revenue table and displays the stage.
   * 
   * @throws IOException whenever an input or output operation fails.
   * @throws SQLException whenever the sql server returns an error with the statement.
   */

  public void showRevenueTable() throws IOException, SQLException {
    initialize();
    DisplayUtil.createAdditionalStage("Revenue.fxml", 400, 420, "application.css", instance).show();

  }

  /**
   * An initialiser for the initializeRevMenu method.
   * 
   * @throws SQLException whenever the sql server returns an error with the statement.
   * 
   */

  public void initialize() throws SQLException {
    initializeRevMenu();
  }

  /**
   * Creates the revenue table by adding the contents of the sql table into an observable array
   * list, then setting the table columns as the property values from the RevenueTable class.
   * 
   * @throws SQLException whenever the sql server returns an error with the statement.
   */

  public void initializeRevMenu() throws SQLException {

    ResultSet rs = dm.query(dm.createPreparedStatement("SELECT * FROM " + revenueTableName));
    ObservableList<RevenueTable> oblist = FXCollections.observableArrayList();
    try {
      while (rs.next()) {
        oblist.add(new RevenueTable(rs.getInt(1), rs.getDate(2).toLocalDate(), rs.getInt(3),
            rs.getFloat(4)));
        revenuetable.setItems(oblist);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    colId.setCellValueFactory(cellData -> cellData.getValue().idProperty().asObject());
    colDate.setCellValueFactory(cellData -> cellData.getValue().dateProperty());
    colNoOfOrders
        .setCellValueFactory(cellData -> cellData.getValue().number_of_ordersProperty().asObject());
    colTotalRevenue
        .setCellValueFactory(cellData -> cellData.getValue().total_revenueProperty().asObject());

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    colDate.setCellFactory((TableColumn<RevenueTable, LocalDate> column) -> {
      return new TableCell<RevenueTable, LocalDate>() {
        @Override
        protected void updateItem(LocalDate item, boolean empty) {
          super.updateItem(item, empty);

          if (item == null || empty) {
            setText(null);
          } else {
            setText(formatter.format(item));

          }
        }
      };
    });
  }


  @FXML
  private void deleteRev(ActionEvent event) {
    
    if (rowID.getText().isEmpty()) {
      // Inform user that a field has been left empty.
      Alert informConfirmation = new Alert(AlertType.INFORMATION);
      informConfirmation.setHeaderText("You must enter a valid revenue ID");
      informConfirmation.setContentText("The revenue ID field has been left empty...");

      informConfirmation.show();
      return;
    }
    try {
      String idRow = rowID.getText();
      rm.deleteRevStat(idRow);
      label.setText(idRow + " has been deleted from the Revenue database");
    } catch (Exception e) {
      System.out.println("Please enter ID to delete");
    }

  }

}
