package uk.ac.rhul.cs2810;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2810.database.RevenueManager;

/**
 * Test cases for the Revenue Manager.
 * 
 * @author danielrogerson
 */

public class RevenueManagerTest {

  private static RevenueManager rm = null;

  // Test created a order table if the table does not exist.
  @Test
  void testCreatesTableWhenMissing() {
    assertDoesNotThrow(() -> {
      rm.createRevenueTable();
    }, "Creating an order table should not throw any exceptions as they are handled");
  }
}
