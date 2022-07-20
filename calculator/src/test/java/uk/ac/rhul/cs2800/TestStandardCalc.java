package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestStandardCalc {

  StandardCalc standardCalc;

  @BeforeEach
  public void setup() {
    standardCalc = new StandardCalc();
  }

  // Test 1
  // Created a class StandardCalc with a method evaluate that always returns 2
  @Test
  void testSize() {
    assertEquals(standardCalc.calculate("1 + 1"), 2);
  }

  // Test 2
  // I added a new attribute holding a ReversePolish class
  // The calculate method has been modified to convert the infix expression to Postfix
  @Test
  void testSizeLonger() {
    assertEquals(standardCalc.calculate(("1 + 1 + 2")), 4);
  }

  // Test 3
  // Implemented a method that gives the operators an according level of priority
  // Whenever an operator with lower priority is read, all the operators in the
  // stack with higher priority are popped into the expression
  @Test
  void testSizeProduct() {
    assertEquals(standardCalc.calculate(("1 + 2 * 3 + 4 * 3")), 19);
  }

  // Test 4
  // Added brackets in the priority method, with the lowest priority
  // Once a right bracket is read, it will pop operators in the stack until the left bracket is read
  @Test
  void testSizeBrackets() {
    assertEquals(standardCalc.calculate(("1 + 2 * ( 3 + 4 ) * 3")), 43);
  }

  // Test 5
  // Introduced an if statement that reads minus operators and pushes the corresponding symbol
  @Test
  void testSizeDifference() {
    assertEquals(standardCalc.calculate(("1 + 2 * ( 3 + 4 ) * 3 - 2")), 41);
  }

  // Test 6
  // Introduced an if statement that reads minus operators and pushes the corresponding symbol
  @Test
  void testSizeQuotient() {
    assertEquals(standardCalc.calculate(("1 + 2 * ( 3 + 4 / 2 ) * 3 - 2")), 29);
  }



}
