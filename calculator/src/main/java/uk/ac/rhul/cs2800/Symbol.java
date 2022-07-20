package uk.ac.rhul.cs2800;


/**
 * This is an enumeration of all the mathematical symbols that can be processed in the calculator.
 * 
 * @author abitha
 */
public enum Symbol {
  LEFT_BRACKET("("), RIGHT_BRACKET(")"), TIMES("*"), DIVIDE("/"),
  PLUS("+"), MINUS("-"), INVALID("Invalid");
  
  String value;
  
  
  /**
   * A constructor that assigns a string (more printable form of the enumeration) to each symbol.
   * 
   * @param value string representation of the type
   */
  Symbol(String value) {
    this.value = value;
  }
  
  /**
   * Overrides the toString method, return a more readable form of the enumeration for each symbol. 
   * 
   * @return the string representation of the enumeration 
   */
  @Override
  public String toString() {

    return this.value;
  }

}
