package uk.ac.rhul.cs2800;

/**
 * This class evaluates a PostFix mathematical expression.
 * 
 * @author abitha
 *
 */
public class ReversePolish implements Calculator {

  NumStack numstack = new NumStack();

  @Override
  public float calculate(String expression) {


    String[] terms = expression.trim().split("\\s+");

    if (expression == "") {
      throw new IllegalArgumentException();
    }

    for (int i = 0; i <= terms.length - 1; i++) {

      String currentTerm = terms[i];



      if (currentTerm.equals("+")) {

        float summation = numstack.pop() + numstack.pop();

        numstack.push(summation);


      } else if (currentTerm.equals("*") || currentTerm.equals("x")) { // Some user's prefer x to *

        float product = numstack.pop() * numstack.pop();

        numstack.push(product);


      } else if (currentTerm.equals("-")) {

        float tempTerm = numstack.pop();

        float difference = numstack.pop() - tempTerm;

        numstack.push(difference);


      } else if (currentTerm.equals("/") || currentTerm.equals("÷")) { // Some user's prefer ÷ to /

        float tempTerm = numstack.pop();
        if (tempTerm == 0) { // You can't divide by 0
          throw new ArithmeticException();
        }
        float quotient = numstack.pop() / tempTerm;

        numstack.push(quotient);


      } else {

        numstack.push(Float.parseFloat(currentTerm));

      }

    }

    float result = numstack.pop();

    if (!numstack.isEmpty()) {
      throw new ArrayStoreException();
    }

    return result;

  }



}
