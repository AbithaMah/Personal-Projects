package uk.ac.rhul.cs2800;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

/**
 * This class is a stack of entries to be processed in the calculator program.
 * 
 * @author abitha
 *
 */
public class Stack {

  int size = 0; // A new stack will have no elements, therefore zero size
  List<Entry> entries = new ArrayList<Entry>();



  /**
   * A getter method for the size attribute of the stack.
   * 
   * @return the current size of the stack
   */
  public int size() {
    return size;
  }


  /**
   * A method that answers the 'is empty' question.
   * 
   * @return true if the stack is empty, false if other wise
   */
  public boolean isEmpty() {

    return size == 0;
  }


  /**
   * This method adds an entry to the top of the stack.
   * 
   * @param entry the entry to be pushed
   */
  public void push(Entry entry) {
    entries.add(entry);
    size++; // Incrementing size will also update the index of the top element
  }

  /**
   * Get the top element of the stack (remove it) and return it.
   * 
   * @return the top element
   */
  public Entry pop() {
    if (this.isEmpty()) {
      throw new EmptyStackException();
    }
    
    Entry temp = entries.get(--size);
    entries.remove(size);
    return temp; // Size reduced before process, as index of first element is 0

  }

  /**
   * Get the top element of the stack without removing it from the stack, and return it.
   * 
   * @return the top element
   */
  public Entry top() {

    if (this.isEmpty()) {
      throw new EmptyStackException();
    }


    return entries.get(size - 1); // Minus one because the index of first element of an array is 0



  }



}
