package uk.ac.rhul.cs2800;


/**
 * This class handles the interface that the use will use to interact with the calculator.
 * 
 * @author abitha
 *
 */
public interface ViewInterface {

  /**
   * This setter method acts upon the result attribute in the interface.
   * 
   * @param result the answer to be returned to the user
   */
  public void setResult(String result);

  
  /**
   * This method activates the menu used by the user to interact with the calculator.
   * 
   */
  public void menu();

  /**
   * Checks whether the expression is to be evaluated using StandardCalc or ReversePolish.
   * 
   * @return whether the expression is written in Postfix or Infix
   */
  public boolean isPostfix();

  /**
   * This is a getter method for the user's input in the interface.
   * 
   * @return the user's input
   */
  public String getInput();

  /**
   * This method notifies the controller class that the user has interacted with the interface.
   * 
   * @param f the controller's observer
   */
  public void addCalculateObserver(Observer f);

  /**
   * This method notifies the controller class that the user has interacted with the interface.
   * 
   * @param f the controller's observer
   */
  public void addResetObserver(Observer f);
}
