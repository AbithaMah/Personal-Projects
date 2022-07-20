package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.EmptyStackException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStack {

  Stack stack;
  Entry firstEntry;
  Entry secondEntry;


  @BeforeEach
  public void setup() {
    stack = new Stack();
    firstEntry = new Entry(Symbol.DIVIDE);
    secondEntry = new Entry(1.23f);

  }

  // Test 1
  // size() implemented, it always returns the value 0
  @Test
  void testSize() {
    assertEquals(stack.size(), 0, "A newly created stack should have size 0");
  }

  // Test 2
  // isEmpty() implemented in stack, it returns true if size is 0, false if otherwise
  @Test
  void testIsEmpty() {
    assertTrue(stack.isEmpty());
  }

  // Test 3
  // A 'size' attribute added to Stack, now size() returns this attribute
  // push() has been implemented, incrementing the value of 'size' by one
  @Test
  void testPush() {
    stack.push(firstEntry);
    assertEquals(stack.size(), 1, "After pushing once, the size should be 1");
  }

  // Test 4
  // pop() implemented in Stack
  // An if statement throws an EmptyStackException if isEmpty() is true
  @Test
  void testEmptyPop() {
    assertThrows(EmptyStackException.class, () -> stack.pop(), "You can't pop from an empty stack");
  }

  // Test 5
  // pop() changed from 'void' to 'Entry', it always returns 'Entry(Symbol.DIVIDE)'
  @Test
  void testPushPop() {
    stack.push(firstEntry);
    assertEquals(stack.pop(), firstEntry,
        "Pop should return the pushed entry if it is the first pushed value");

  }

  // Test 6
  // Added a 'top' attribute in Stack to represent the last pushed entry
  // Modified push() to return 'top'
  @Test
  void testPushPushPop() {
    stack.push(firstEntry);
    stack.push(secondEntry);
    assertEquals(stack.pop(), secondEntry, "Pop should return the last entered value");

  }

  // Test 7
  // 'entries' attribute has been added to Stack as a list<Entry> to store the pushed items
  // 'top' changed from an 'Entry' to an integer, to represent the index of the top of the stack
  // After pushing the value of the index is reduced by one
  @Test
  void testPushPushPopPop() {
    stack.push(firstEntry);
    stack.push(secondEntry);
    assertEquals(stack.pop(), secondEntry);
    assertEquals(stack.pop(), firstEntry,
        "Popping twice should return the second item down the stack");

  }


  // Test 8
  // If statement added in top(), throwing an exception if isEmpty() is true
  @Test
  void testEmptyTop() {
    assertThrows(EmptyStackException.class, () -> stack.top(), "An empty stack doesn't have a top");
  }

  // Test 9
  // top() implemented in Stack, it returns the element of the entries list with index 'size'
  @Test
  void testGetTop() {
    stack.push(firstEntry);
    assertEquals(stack.top(), firstEntry);
    assertEquals(stack.pop(), firstEntry,
        "top() should not change the value of the attribut, only display it");
  }



}
