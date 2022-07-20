package uk.ac.rhul.cs2800;


/**
 * This class manages the two types of calculator, Standard and Reverse Polish.
 * 
 * @author abitha
 *
 */
public class ControllerCalc {

  private ViewInterface myView;
  private CalcModel myCalculator;

  private void handleCalculate() {
    String expression = myView.getInput();
    String answer = myCalculator.calculate(expression, myView.isPostfix());
    myView.setResult(answer);
  }

  private void handleReset() {
    myView.setResult("");
  }

  ControllerCalc(ViewInterface view, CalcModel calculator) {

    myView = view;
    myCalculator = calculator;
    view.addResetObserver(this::handleReset);
    view.addCalculateObserver(this::handleCalculate);
  }

}
