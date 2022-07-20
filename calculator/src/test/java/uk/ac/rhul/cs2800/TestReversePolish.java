package uk.ac.rhul.cs2800;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestReversePolish {

  ReversePolish reversePolish;

  @BeforeEach
  void setup() {
    reversePolish = new ReversePolish();
  }

  // Test 1
  // Created a method calculate with a string parameter that always returns 2 (faking)
  @Test
  void testCalculate() {
    assertEquals(reversePolish.calculate("1 1 +"), 2.0);
  }

  // Test 2
  // Introduced a NumStack attribute in in the class
  // A for loop reads the expression and if it reads a number it adds it to the stack
  // If it reads a plus sign, it pops the first two elements in the stack and sums them
  // At the end the remaining element in the stack is returned
  @Test
  void testCalculateLonger() {
    assertEquals(reversePolish.calculate("1 1 1 + +"), 3);
  }

  // Test 3
  // Used the String.split inbuilt method to separate the expressions in its term
  // using an empty space as a delimiter
  // The resulting array is then read element by element
  @Test
  void testCalculateMultipleDigits() {
    assertEquals(reversePolish.calculate("10 11 2 1 + + +"), 24);
  }

  // Test 4
  // Added another if statement that identifies a multiplication sign
  // If found it pops two elements from the stack and multiplies the two
  // The product is then pushed into the NumStack
  @Test
  void testCalculateProducts() {
    assertEquals(reversePolish.calculate("10 11 2 1 + * +"), 43);
  }

  // Test 5
  // Added another if statement that identifies a minus sign
  // If found it pops two elements from the stack and subtracts the two
  // The difference is then pushed into the NumStack
  @Test
  void testCalculateDifferences() {
    assertEquals(reversePolish.calculate("20 13 4 2 - * +"), 46);
  }


  // Test 5
  // Added another if statement that identifies a division sign
  // If found it pops two elements from the stack and divide the two
  // The quotient is then pushed into the NumStack
  @Test
  void testCalculateQuotients() {
    assertEquals(reversePolish.calculate("5 6 7 + * 2 /"), 32.5);
  }


}
