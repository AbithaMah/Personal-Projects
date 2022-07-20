package uk.ac.rhul.cs2800;

/**
 * This facade class is implemented to reduce the complexity of the stack class.
 * It only holds symbol entries.
 * 
 * @author abitha
 *
 */
public class SymbolStack {

  Stack myStack;

  /**
   * Constructor that sets the value of the myStack attribute to a new Stack instance.
   * 
   */
  public SymbolStack() {
    myStack = new Stack();
  }

  /**
   * A getter method for the size attribute of the stack.
   * 
   * @return the current size of the stack
   */
  public int size() {
    int size = myStack.size();
    return size;
  }

  /**
   * This method specifically pushes a symbol into the stack. 
   * 
   * @param symbol A symbol entry to be pushed into the stack
   */
  public void push(Symbol symbol) {

    myStack.push(new Entry(symbol));
  }

  /**
   * A method that answers the 'is empty' question.
   * 
   * @return true if the stack is empty, false if other wise
   */
  public boolean isEmpty() {

    return myStack.isEmpty();
  }

  /**
   * Get the top symbol of the stack (remove it) and return it.
   * 
   * @return the top symbol of the stack
   */
  public String pop() {

    Entry symbol = myStack.pop();
    return symbol.getSymbol().toString();
  }
  
  /**
   * Get the top symbol of the stack without removing it.
   * 
   * @return the top Symbol of the stack
   */
  public Symbol top() {
    Entry symbol = myStack.top();
    return symbol.getSymbol();
  }

}


