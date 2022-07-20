package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSymbolStack {

  SymbolStack symbolstack;


  @BeforeEach
  public void setup() {
    symbolstack = new SymbolStack();
  }


  // Test 1
  // Implemented a size method in SymbolStack that always returns 0
  @Test
  public void testSize() {
    int size = symbolstack.size();
    assertEquals(size, 0, "A newly created stack should have size 0");

  }
  

  // Test 2
  // Introduced a myStack attribute in SymbolStack that holds a stack class
  // The push and size call the respective methods in the stack class
  @Test
  public void testPush() {
    symbolstack.push(Symbol.DIVIDE);
    int size = symbolstack.size();
    assertEquals(size, 1, "Pushing an object into a stack should increment the size by 1");

  }

  // Test 3
  // Implemented an isEmpty method in SymbolStack that always returns true
  @Test
  void testIsEmpty() {
    assertTrue(symbolstack.isEmpty(), "A newly created stack should be empty");

  }

  // Test 4
  // Modified the isEmpty method
  // It now calls the isEmpty method of its myStack attribute
  @Test
  void testIsEmptyFalse() {
    symbolstack.push(Symbol.DIVIDE);
    assertFalse(symbolstack.isEmpty(), "A stack with an element should be empty");
  }


  // Test 5
  // Implemented pop method in SymbolStack
  // It uses the pop method of the myStack attribute to retrieve the entry
  // It then converts it into a symbol using the getSymbol method in the Entry enumeration
  @Test
  void testPop() {
    symbolstack.push(Symbol.DIVIDE);
    assertEquals(symbolstack.pop(), "/",
        "The pop method should return the last pushed object");

  }

}
