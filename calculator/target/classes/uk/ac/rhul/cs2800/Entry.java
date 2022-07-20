package uk.ac.rhul.cs2800;


/**
 * This class represents an entry into the calculator program.
 * 
 * @author abitha
 *
 */
public class Entry {

  private String str;
  private Symbol symbol;
  private Float number;

  private Type type;



  /**
   * A parameterised constructor that instantiates a string entry.
   * 
   * @param str a piece of string to be processed in the calculator
   */
  public Entry(String str) {

    this.str = str;
    this.type = Type.STRING;

  }

  /**
   * A parameterised constructor that instantiates a symbol entry.
   * 
   * @param symbol a mathematical symbol to be processed in the calculator
   */
  public Entry(Symbol symbol) {
    this.symbol = symbol;
    this.type = Type.SYMBOL;
  }

  /**
   * A parameterised constructor that instantiates a number entry.
   * 
   * @param number a value to be processed in the calculator
   */
  public Entry(Float number) {
    this.number = number;
    this.type = Type.NUMBER;
  }


  /**
   * Get the current entry type.
   * 
   * @return the type of the entry
   */
  public Type getType() {
    return type;
  }

  /**
   * Get the attribute string if the type is STRING.
   * 
   * @return the string attribute
   */
  public String getString() {
    if (type != Type.STRING) {
      throw new IllegalCallerException("This entry is not a string");
    }
    return str;
  }

  /**
   * Get the attribute symbol if the type is SYMBOL.
   * 
   * @return the symbol attribute
   */
  public Symbol getSymbol() {
    if (type != Type.SYMBOL) {
      throw new IllegalCallerException("This entry is not a symbol");
    }
    return symbol;
  }

  /**
   * Get the attribute number if the type is NUMBER.
   * 
   * @return the number attribute
   */
  public Float getNumber() {
    if (type != Type.NUMBER) {
      throw new IllegalCallerException("This entry is not a number");
    }
    return number;
  }



  /**
   * Overrides the equals method to return true if the type and equivalent attribute match.
   * 
   * @return boolean result of the comparison
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o.getClass() != this.getClass()) {
      return false;
    }

    final Entry compare = (Entry) o;

    if (this.type == Type.STRING && this.str == compare.str) {
      return true;
    }

    if (this.type == Type.SYMBOL && this.symbol == compare.symbol) {
      return true;
    }

    if (this.type == Type.NUMBER && this.number == compare.number) {
      return true;
    } else {
      return false;
    }


  }



  /**
   * Overrides the hashCode method to create a hash code based on the attribute's HashCode.
   * 
   * @return the new HashCode of the object
   */
  @Override
  public int hashCode() {
    int hash = 17; // It's important that 17 is a prime number, to remove redundancies

    hash = 31 * hash + (str != null ? str.hashCode() : 0); // 31 is also prime for the same reason
    hash = 31 * hash + (symbol != null ? symbol.hashCode() : 0);
    hash = 31 * hash + (number != null ? number.hashCode() : 0);
    hash = 31 * hash + (type != null ? type.hashCode() : 0);


    return hash;
  }



}
