package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestSymbol {
  
  private Symbol symbol;

  @BeforeEach
  public void setup() {
    symbol = Symbol.DIVIDE;
  }
  
  // Test 1
  // A constructor was created in the Symbol enumeration to assign each enum a string value
  // The toString method was overridden to return the assigned value
  @Test
  public void testToString() {
    String value = symbol.toString();
    assertEquals(value, "/", "Test that the enumaration is printable");
  }
  
  
  
  
  
  
}