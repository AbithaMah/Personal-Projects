package uk.ac.rhul.cs2800;

/**
 * This class evaluates an Infix mathematical expression.
 * 
 * @author abitha
 *
 */
public class StandardCalc implements Calculator {

  ReversePolish reversePolish = new ReversePolish();

  private int priority(Symbol operator) {
    if (operator == Symbol.LEFT_BRACKET) { // The parenthesis should have the lowest priority
      return -1; // Because you should stop at the left parenthesis and evaluate from the right
    } else if (operator == Symbol.PLUS || operator == Symbol.MINUS) {
      return 0;
    } else {
      return 1;
    }
  }

  @Override
  public float calculate(String expression) {

    StringBuilder postfix = new StringBuilder();
    SymbolStack symbolStack = new SymbolStack();

    String[] terms = expression.trim().split("\\s+");


    for (int i = 0; i <= terms.length - 1; i++) {


      String currentTerm = terms[i];



      if (currentTerm.equals("+")) {

        while (!symbolStack.isEmpty() && priority(Symbol.PLUS) <= priority(symbolStack.top())) {
          postfix.append(symbolStack.pop()).append(" ");

        }
        symbolStack.push(Symbol.PLUS);

      } else if (currentTerm.equals("-")) {

        while (!symbolStack.isEmpty() && priority(Symbol.MINUS) <= priority(symbolStack.top())) {
          postfix.append(symbolStack.pop()).append(" ");

        }
        symbolStack.push(Symbol.MINUS);

      } else if (currentTerm.equals("*") || currentTerm.equals("x")) { // Some user's prefer x to *
        symbolStack.push(Symbol.TIMES);

      } else if (currentTerm.equals("/") || currentTerm.equals("÷")) { // Some user's prefer ÷ to /
        symbolStack.push(Symbol.DIVIDE);

      } else if (currentTerm.equals("(")) {
        symbolStack.push(Symbol.LEFT_BRACKET);

      } else if (currentTerm.equals(")")) {

        while (!(symbolStack.top() == Symbol.LEFT_BRACKET)) {
          postfix.append(symbolStack.pop()).append(" ");
        }

        symbolStack.pop();


      } else {
        postfix.append(currentTerm).append(" ");

      }
    }

    while (!symbolStack.isEmpty()) {
      postfix.append(symbolStack.pop()).append(" ");
    }

    return reversePolish.calculate(postfix.toString().trim()); // Trim the excess spaces

  }


}
