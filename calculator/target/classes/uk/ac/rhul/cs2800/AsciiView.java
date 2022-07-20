package uk.ac.rhul.cs2800;

import java.util.Scanner;

/**
 * This class Ascii interface that the calculator uses if it's run through the console.
 * 
 * @author abitha
 *
 */
public class AsciiView implements ViewInterface {

  private boolean postfix = false;
  private String input;
  Observer calc = null;
  Observer reset = null;

  @Override
  public void setResult(String result) {
    System.out.println(result);
  }

  @Override
  public boolean isPostfix() {
    return postfix;
  }

  @Override
  public String getInput() {
    return input;
  }

  @Override
  public void addCalculateObserver(Observer f) {
    calc = f;
  }

  @Override
  public void addResetObserver(Observer f) {
    reset = f;
  }

  @Override
  public void menu() {
    Scanner s = new Scanner(System.in);
    boolean finished = false;
    help();

    while (!finished && s.hasNext()) {
      String t = s.nextLine();
      switch (t.toUpperCase().charAt(0)) {      // Eliminates errors due to wrong case
        case 'P':
          postfix = true;
          System.out.println("Calculator set to Reverse Polish notation");
          break;
        case 'I':
          postfix = false;
          System.out.println("Calculator set to Standard notation");
          break;
        case 'C':
          if (calc != null) {
            calc.notifyObservers();
            System.out.flush(); // Clears the console
          }
          break;
        case 'R':
          if (reset != null) {
            reset.notifyObservers();
          }
          break;
        case '?':
          input = t.substring(1); // The expression is the substring after the question mark
          System.out.println("Question set to: " + input);
          break;
        case 'Q':
          System.out.println("Bye");
          finished = true;
          break;
        default:
          help();      // If the user inputs a wrong character the menu is displayed again
      }
    }
    s.close();

  }



  /**
   * The ASCII Menu of the calculator program It provides the list of inputs the user can perform.
   * 
   */
  private void help() {
    System.out.println("Use one of the following:");
    System.out.println("  ?Expression - to set expression");
    System.out.println("  C - to calculate");
    System.out.println("  R - to reset the calculator");
    System.out.println("  P - to set calculator to Reverse Polish notation");
    System.out.println("  I - to set calculator to Standard notation");
    System.out.println("  Q - to exit");
  }



}
