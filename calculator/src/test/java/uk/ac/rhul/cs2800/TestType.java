package uk.ac.rhul.cs2800;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestType {
  
  private Type type;

  @BeforeEach
  public void setup() {
    type = Type.NUMBER;
  }
  
  // Test 1
  // A constructor was created in the Type enumeration to assign each enum a string value
  // The toString method was overridden to return the assigned value
  @Test
  public void testToString() {
    String value = type.toString();
    assertEquals(value, "Number", "Test that the enumaration is printable");
  }
  
  
  
  
  
  
}