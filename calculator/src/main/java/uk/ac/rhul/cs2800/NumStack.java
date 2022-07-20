
package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * This facade class is implemented to reduce the complexity of the stack class. It only holds float
 * entries.
 * 
 * @author abitha
 *
 */
public class NumStack { 
  Stack myStack;

  /**
   * Constructor that sets the value of the myStack attribute to a new Stack instance.
   * 
   */
  public NumStack() {
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
   * This method specifically pushes a float into the stack.
   * 
   * @param f A float entry to be pushed into the stack
   */
  public void push(float f) {  
    myStack.push(new Entry(f)); // As this stack involves floats, we are able to specify the type

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
   * Get the top float of the stack (remove it) and return it.
   * 
   * @return the top float of the stack
   */
  public float pop() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }
    Entry number = myStack.pop();
    return number.getNumber();
  }



}
