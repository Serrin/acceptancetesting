package de.webcoders.sample.calculator;

public class TesteSummenbildung {

	private CalculatorApp app;

	public TesteSummenbildung() {
		app = new CalculatorApp();
	}

	public void setErsterOperand(float ersterOperand) {
		app.setFirstOperand(ersterOperand);
	}

	public void setZweiterOperand(float zweiterOperand) {
		app.setSecondOperand(zweiterOperand);
	}

	public float erwartetesErgebnis() {
		return app.calculate("+");
	}
}
