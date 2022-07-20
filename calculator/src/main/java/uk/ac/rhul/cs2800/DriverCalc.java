package uk.ac.rhul.cs2800;



/**
 * The driver class of the calculator class containing the main method.
 * 
 * @author abitha
 *
 */
public class DriverCalc {

  /**
   * This method decides which view to run, between ASCII and GUI.
   * 
   * @param args the console arguments when the calculator is run
   */
  public static void main(String[] args) {

    CalcModel calculator = new CalcModel();
    ViewInterface view = new AsciiView();

    if (System.console() == null) { // If the program is run though the console it uses ASCII view
      view = GuiView.getInstance();
    }


    new ControllerCalc(view, calculator);
    view.menu();
  }
}
