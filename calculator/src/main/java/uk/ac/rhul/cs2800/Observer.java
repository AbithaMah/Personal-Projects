package uk.ac.rhul.cs2800;

/**
 * This interface acts an observer used by the controller class to act upon the GUI/ASCII view.
 * 
 * @author abitha
 *
 */
@FunctionalInterface
public interface Observer {

  /**
   * Method used to notify the controller class that the user has interacted with the GUI/ASCII
   * view.
   * 
   */
  public void notifyObservers();
}
