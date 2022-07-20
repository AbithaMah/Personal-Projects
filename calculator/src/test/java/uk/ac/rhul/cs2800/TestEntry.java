package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEntry {

  Entry entry;

  @BeforeEach
  void setup() {
    entry = new Entry("hello");
  }


  // Test 1
  // A constructor was implemented with a Symbol parameter
  // This is technically the second test as the first was converted to the setup
  @Test
  void testEntrySymbol() {
    entry = new Entry(Symbol.DIVIDE);
  }

  // Test 2
  // A constructor was implemented with a Float parameter
  @Test
  void testEntryFloat() {

    entry = new Entry(10.5f);
  }


  // Test 3
  // A getter method was implemented to return the Type of the object
  // It always returns type.String
  @Test
  void testGetType() {
    assertEquals(entry.getType(), Type.STRING,
        "Test that an entry instanciated with a string has type STRING");

  }

  // Test 4
  // An attribute type was added in entry, each constructor assigns their respective Type
  // getType() now returns this attribute
  @Test
  void testGetTypeTwice() {
    assertEquals(entry.getType(), Type.STRING,
        "Test that an entry instanciated with a string has type STRING");
    entry = new Entry(Symbol.DIVIDE);
    assertEquals(entry.getType(), Type.SYMBOL,
        "Test that the getType method works with multiple types");

  }


  // Test 5
  // A method getString() was implemented in Entry
  // Getter methods have been implemented for other types as well
  @Test
  void testGetString() {
    assertEquals(entry.getString(), "hello",
        "Test that an entry instanciated with a string returns the same string");

  }

  // Test 6
  // A string attribute was added, the String constructor assigns the parameter to the attribute
  // The get string method returns the attribute
  // The has been implemented in constructors for different types
  @Test
  void testGetStringTwice() {
    assertEquals(entry.getString(), "hello",
        "Test that an entry instanciated with a string returns the same string");
    entry = new Entry("hello world");
    assertEquals(entry.getString(), "hello world",
        "Test that the get type method works with multiple strings");

  }

  // Test 7
  // Added if statement to getNumber, if the type of the entry wasn't a number, exception was thrown
  // The same has been implemented for getters of other types
  @Test
  void testGetStringFromNumber() {
    IllegalCallerException e = assertThrows(IllegalCallerException.class, () -> entry.getNumber());
    assertEquals(e.getMessage(), "This entry is not a number");
  }

  // Test 8
  // Overridden 'equals' to always return true
  @Test
  void testEqual() {
    Entry entry2 = new Entry("hello");
    assertTrue(entry.equals(entry2));

  }



  // Test 9
  // Overridden 'hashCode' and modified 'equals'
  // 'equals' finds the type of the fist object, and compares the same type of the second object.
  // 'hashCode' has been overridden to return a new hashCode based on the attributes
  @Test
  void testNotEqual() {
    Entry entry2 = new Entry(1.23f);
    assertNotEquals(entry, entry2);

  }



}
