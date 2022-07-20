package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCalcModel {

  CalcModel calculatorModel;


  @BeforeEach
  public void setup() {
    calculatorModel = new CalcModel();
  }

  // Added a calculator attribute in CalcMode that holds a ReversePolish class
  // Implemented a calculate method that evaluates a postfix expression
  // Test 1
  @Test
  void testReversePolish() {
    assertEquals(calculatorModel.calculate("1 1 +", true), "2.0",
        "Calculator mode set to reverse poliush should evaluate a postfix expression");

  }

  // Added an if statement that uses the boolean parameter to determine whether the
  // calculator attribute is StandardCalc or ReversePolish
  // Test 2
  @Test
  void testStandardCalc() {
    assertEquals(calculatorModel.calculate("1 + 1", false), "2.0",
        "Calculator mode set to reverse poliush should evaluate a postfix expression");

  }

  // Added an if statement in ReversePolish that uses an if statement to identify
  // a 0 denominator, and subsequently throws an ArithmeticException
  // Test 3
  @Test
  void testDivideBy0() {
    assertEquals(calculatorModel.calculate("1 / 0", false), "Math Error: Cannot divide by 0!");
  }

  // CalcModel catches an EmptyStack exception and prints out the correct error message
  // Test 4
  @Test
  void testOperatorExcess() {
    assertEquals(calculatorModel.calculate("1 3 + + +", false),
        "Illegal expression: check number of operators!");
  }

  // CalcModel catches an ArrayStoreException and prints out the correct error message
  // Test 5
  @Test
  void testOperandExcess() {
    assertEquals(calculatorModel.calculate("1 1 1 1 +", false),
        "Illegal expression: check number of operands!");
  }

  // CalcModel catches an IllegalArgumentException and prints out the correct error message
  // Test 5
  @Test
  void testEmptyInput() {
    assertEquals(calculatorModel.calculate("", false),
        "Illegal expression: please input something!");
  }
}


