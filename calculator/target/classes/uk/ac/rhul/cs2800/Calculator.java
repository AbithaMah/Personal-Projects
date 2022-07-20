package uk.ac.rhul.cs2800;

/**
 * An interface that is implemented by the two types of calculator, ReversePolish and Standard.
 * 
 * @author abitha
 *
 */
public interface Calculator {
  
  /**
   * This method evaluates a mathematical expression.
   * 
   * @param expression A mathematical expression in PostFix form
   * @return the float result of the expression
   */
  public float calculate(String expression);

}
