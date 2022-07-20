package uk.ac.rhul.cs2810;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2810.database.AlertManager;
import uk.ac.rhul.cs2810.util.DatabaseManager;

/**
 * A class in which alerts are tested so much through standardised testing that don't play to their
 * individual strengths that they lose all sense of individuality.
 * 
 * @author solsd
 *
 */
public class AlertManagerTest {

  private static AlertManager am = null;
  private static Date timeSent;
  private static int tableNum;
  private static int orderID = 0;


  @BeforeAll
  static void setup() {
    am = AlertManager.getInstance();
  }

  @BeforeEach
  void generateParameters() {
    timeSent = new Date();
    tableNum = (int) (Math.random() * (19 - 1 + 1) + 1);
  }

  /**
   * Makes sure an alert manager exists.
   */
  @Test
  void test1_doesItEvenExist() {
    assertNotNull(am, "Alert Manager does not exist... Just like my will to live.");
  }

  /**
   * Checks to see if the table can be made.
   */
  @Test
  void test2_ifItExistsWhyCantISeeTheTable() {
    assertDoesNotThrow(() -> {
      AlertManager.createAlertTable();
    }, "Table created but exceptions were thrown. At least it wasnt hands.");
  }

  /**
   * Test the alerts to see if they want to be created.
   */
  @Test
  void test3_rightThenLetsMakeSomeAlerts() {
    assertDoesNotThrow(() -> {
      assertNotNull(AlertManager.createAlert(timeSent, tableNum, orderID));
    }, "Alerts dont like exsisting. Nor do I");
  }

  /*
   * No longer passes, Test 5 does the same thing and more
   * 
   * @Test void test4_isItEvenReal() { int alertID =
   * DatabaseManager.getInstance().getNextAutoIncrement("alerts");
   * assertTrue(am.alertExists(alertID), "The alert as ceased existing! How do I do the same?"); }
   */

  /**
   * Kills the alerts. They have failed me.
   * 
   * @throws Exception thrown if Alert Manager cannot delete Alert.
   */
  @Test
  void test5_iveHadEnoughOfTheAlertsSendThemToTheDungeons() throws Exception {
    int alertID = DatabaseManager.getInstance().getNextAutoIncrement("alerts");
    assertTrue(AlertManager.alertExists(alertID), "Alert was never created.");
    AlertManager.deleteAlert(alertID);
    assertFalse(AlertManager.alertExists(alertID),
        "Alert was not delted, I might have been upgraded instead.");
  }
}
