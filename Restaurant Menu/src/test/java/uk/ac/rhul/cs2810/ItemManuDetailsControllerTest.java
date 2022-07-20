package uk.ac.rhul.cs2810;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2810.gui.MenuItemDetailsController;

public class ItemManuDetailsControllerTest {

  @Test
  void testValidUrl() {
    assertTrue(
        MenuItemDetailsController.validImageUrl("http://51.195.137.215/itemImages/default.jpg"));
    assertFalse(MenuItemDetailsController
        .validImageUrl("http://51.195.137.215/itemImages/defaultNattt.jpg"));
  }

}
