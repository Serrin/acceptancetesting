package de.webcoders.sample.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import de.webcoders.sample.calculator.CalculatorApp;

public class CalculatorAppTest {

	@Test
	public void shouldBeInstantiable() {
		CalculatorApp calculatorApp = new CalculatorApp();
		assertNotNull(calculatorApp);
	}

	@Test(expected = UnsupportedOperationException.class)
	public void shouldThrowUnsupportedOperationExceptionWhenUsingUnknownOperator() {
		CalculatorApp app = new CalculatorApp();
		app.calculate("unknown_operation");
	}

	@Test
	public void shouldReturn5WhenAdding2And3() {
		CalculatorApp app = new CalculatorApp();

		app.setFirstOperand(2);
		app.setSecondOperand(3);

		assertEquals(5, app.calculate("+"), 0.0);
	}
}
