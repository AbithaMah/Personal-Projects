package uk.ac.rhul.cs2810;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.SQLException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import uk.ac.rhul.cs2810.database.StaffManager;

/**
 * The testing class for the StaffManager class.
 * 
 * @author zhac253, danielrogerson
 *
 */

public class StaffManagerTest {
  private static StaffManager sm = null;

  @BeforeAll
  static void setup() {
    sm = StaffManager.getInstance();
    sm.createTable();
  }

  // Test that the order manager can only be assess as a single instance
  @Test
  void testSingletonInstance() {
    assertNotNull(sm, "Tests to see if the singleton has been created sucessfully.");
  }

  @Test
  void testCheckOutSingle() throws SQLException {
    sm.checkIn("Test", "Test", "Waiter", "Test1", "Test");
    assertEquals(sm.checkOut(sm.getIdFromUsername("Test1")), true,
        "Should be able to find member of staff.");
    assertEquals(sm.checkOut(sm.getIdFromUsername("Test1")), false,
        "Should not be able to find member of staff.");
  }

  @Test
  void testCheckOutMultiple() throws SQLException {
    sm.checkIn("Test", "Test", "Waiter", "Test", "Test");
    sm.checkIn("Test2", "Test", "Waiter", "Test2", "Test");
    assertEquals(sm.checkOut(sm.getIdFromUsername("Test")), true,
        "Should be able to find member of staff.");
    assertEquals(sm.checkOut(sm.getIdFromUsername("Test2")), true,
        "Should be able to find member of staff.");
  }

  @Test
  void testGetIDfromUsername() throws SQLException {
    sm.checkIn("Test", "Test", "Kitchen", "TestUSERNAME", "Test");
    assertEquals(sm.getIdFromUsername("TestUSERNAME"), sm.getIdFromUsername("TestUSERNAME"),
        "Should be able to retreive a valid ID from the username");
    sm.checkOut(sm.getIdFromUsername("TestUSERNAME"));
  }

  @Test
  void testGetForename() throws SQLException {
    sm.checkIn("TestForename", "Test", "Kitchen", "Test", "Test");
    assertEquals("TestForename", sm.getForename(sm.getIdFromUsername("Test")),
        "Should return the checked in member of staff");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

  @Test
  void testSetForname() throws SQLException {
    sm.checkIn("TestForename", "Test", "Kitchen", "Test", "Test");
    assertEquals("TestForename", sm.getForename(sm.getIdFromUsername("Test")),
        "Should return orignially provided name");
    sm.setForename(sm.getIdFromUsername("Test"), "ForenameTest");
    assertEquals("ForenameTest", sm.getForename(sm.getIdFromUsername("Test")),
        "Should return new name");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

  @Test
  void testGetSurname() throws SQLException {
    sm.checkIn("Test", "TestSurname", "Kitchen", "Test", "Test");
    assertEquals("TestSurname", sm.getSurname(sm.getIdFromUsername("Test")),
        "Should return surname");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

  @Test
  void testSetSurname() throws SQLException {
    sm.checkIn("Test", "TestSurname", "Kitchen", "Test", "Test");
    assertEquals("TestSurname", sm.getSurname(sm.getIdFromUsername("Test")),
        "Should return orignially provided name");
    sm.setSurname(sm.getIdFromUsername("Test"), "SurnameTest");
    assertEquals("SurnameTest", sm.getSurname(sm.getIdFromUsername("Test")),
        "Should return new name");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

  @Test
  void testGetUsername() throws SQLException {
    sm.checkIn("Test", "Test", "Kitchen", "TestUsername", "Test");
    assertEquals("TestUsername", sm.getUsername(sm.getIdFromUsername("TestUsername")),
        "Should return username");
    sm.checkOut(sm.getIdFromUsername("TestUsername"));
  }

  @Test
  void testSetUsername() throws SQLException {
    sm.checkIn("Test", "Test", "Kitchen", "TestUsername", "Test");
    assertEquals("TestUsername", sm.getUsername(sm.getIdFromUsername("TestUsername")),
        "Should return orignially provided name");
    sm.setUsername(sm.getIdFromUsername("TestUsername"), "UsernameTest");
    assertEquals("UsernameTest", sm.getUsername(sm.getIdFromUsername("UsernameTest")),
        "Should return new name");
    sm.checkOut(sm.getIdFromUsername("UsernameTest"));
  }

  @Test
  void testGetPassword() throws SQLException {
    sm.checkIn("Test", "Test", "Kitchen", "Test", "password123");
    assertEquals("password123", sm.getPassword(sm.getIdFromUsername("Test")),
        "Should return password of the member");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

  @Test
  void testSetPassword() throws SQLException {
    sm.checkIn("Test", "Test", "Kitchen", "Test", "TestPassword");
    assertEquals("TestPassword", sm.getPassword(sm.getIdFromUsername("Test")),
        "Should return orignially provided name");
    sm.setPassword(sm.getIdFromUsername("Test"), "PasswordTest");
    assertEquals("PasswordTest", sm.getPassword(sm.getIdFromUsername("Test")),
        "Should return new name");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

  @Test
  void testGetStatus() throws SQLException {
    sm.checkIn("Test", "Test", "Kitchen", "Test", "Test");
    assertEquals("Available", sm.getStatus(sm.getIdFromUsername("Test")),
        "Should return the status");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

  @Test
  void testGetRole() throws SQLException {
    sm.checkIn("Test", "Test", "Kitchen", "Test", "Test");
    assertEquals("Kitchen", sm.getRole(sm.getIdFromUsername("Test")),
        "Should return the role of the member");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

  @Test
  void testChangeStatus() throws SQLException {
    sm.checkIn("Test", "Test", "Waiter", "Test", "Test");
    assertEquals(sm.getStatus(sm.getIdFromUsername("Test")), "Available",
        "Returns avaiable status");
    sm.changeStatus(sm.getIdFromUsername("Test"));
    assertEquals(sm.getStatus(sm.getIdFromUsername("Test")), "Busy", "Returns avaiable status");
    sm.checkOut(sm.getIdFromUsername("Test"));
  }

}