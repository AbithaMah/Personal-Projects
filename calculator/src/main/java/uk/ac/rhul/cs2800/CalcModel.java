package uk.ac.rhul.cs2800;

import java.util.EmptyStackException;

/**
 * This class manages the two types of calculator and can evaluate both an Inifx and Postfix
 * expression.
 * 
 * @author abitha
 *
 */
public class CalcModel {

  Calculator calculator;

  /**
   * This method evaluates a mathematical expression based on its form (Postfix or Infix).
   * 
   * @param expression the mathematical expression to be evaluated
   * @param postfix shows if the expression is Postfix or Infix
   * @return the result of the mathematical expression as a String
   */
  public String calculate(String expression, boolean postfix) {

    if (postfix) {
      calculator = new ReversePolish(); // ReversePolish notation is equivalent to Postfix notation
    } else {
      calculator = new StandardCalc();
    }


    try {
      return String.valueOf(calculator.calculate(expression));
    } catch (ArithmeticException e) {
      return "Math Error: Cannot divide by 0!";
    } catch (EmptyStackException e) {
      return "Illegal expression: check number of operators!";
    } catch (ArrayStoreException e) {
      return "Illegal expression: check number of operands!";
    } catch (IllegalArgumentException e) {
      return "Illegal expression: please input something!";
    }



  }

}
