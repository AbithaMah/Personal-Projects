package uk.ac.rhul.cs2800;


/**
 * This is an enumeration of the different types an entry can have.
 * 
 * @author abitha
 */
public enum Type {
  NUMBER("Number"), SYMBOL("Symbol"), STRING("String"), INVALID("Invalid");
  
  String value;
  
  /**
   * A constructor that assigns a string (more printable form of the enumeration) to each type.
   * 
   * @param value string representation of the type
   */
  Type(String value) {
    this.value = value;
  }
  
  /**
   * Overrides the toString method, return a more readable form of the enumeration for each type.
   * 
   * @return the string representation of the enumeration
   */
  @Override
  public String toString() {

    return this.value;
  }

}
