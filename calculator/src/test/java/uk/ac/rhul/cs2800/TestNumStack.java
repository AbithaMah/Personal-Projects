package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestNumStack {

  NumStack numstack;


  @BeforeEach
  public void setup() {
    numstack = new NumStack();
  }


  // Test 1
  // Implemented a size method in NumStack that always returns 0
  @Test
  void testSize() {
    int size = numstack.size();
    assertEquals(size, 0, "A newly created stack should have size 0");

  }


  // Test 2
  // Introduced a myStack attribute in NumStack that holds a stack class
  // The push and size call the respective methods in the stack class
  @Test
  void testPush() {
    numstack.push((float) 1.2321);
    int size = numstack.size();
    assertEquals(size, 1, "Pushing an object into a stack should increment the size by 1");

  }


  // Test 3
  // Implemented an isEmpty method in NumStack that always returns true
  @Test
  void testIsEmpty() {
    assertTrue(numstack.isEmpty(), "A newly created stack should be empty");

  }

  // Test 4
  // Modified the isEmpty method
  // It now calls the iEmpty method of its myStack attribute
  @Test
  void testIsEmptyFalse() {
    numstack.push((float) 1.1111);
    assertFalse(numstack.isEmpty(), "A stack with an element should be empty");
  }


  // Test 5
  // Implemented pop method in NumStack
  // It uses the pop method of the myStack attribute to retrieve the entry
  // It then converts it into a float using the getNumber method in the Entry enumeration
  @Test
  void testPop() {
    numstack.push((float) 1.1111);
    assertEquals(numstack.pop(), (float) 1.1111, 
        "The pop method should return the last pushed object");
    
  }

}


