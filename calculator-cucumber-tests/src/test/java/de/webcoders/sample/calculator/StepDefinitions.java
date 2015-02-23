package de.webcoders.sample.calculator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import de.webcoders.sample.calculator.CalculatorApp;

public class StepDefinitions {
	private CalculatorApp app;
	private float actualResult;

	@Given("^the calculator app is launched$")
	public void the_calculator_app_is_launched() throws Throwable {
		app = new CalculatorApp();
	}

	@When("^I add the numbers (\\d+) and (\\d+)$")
	public void i_add_the_numbers_and(int arg1, int arg2) throws Throwable {
		app.setFirstOperand(arg1);
		app.setSecondOperand(arg2);
		actualResult = app.calculate("+");
	}

	@When("^I substract the numbers (\\d+) and (\\d+)$")
	public void i_substract_the_numbers_and(int arg1, int arg2)
			throws Throwable {
		app.setFirstOperand(arg1);
		app.setSecondOperand(arg2);
		actualResult = app.calculate("-");
	}

	@Then("^the result should be (\\d+)$")
	public void the_result_should_be(float expectedResult) throws Throwable {
		assertThat(actualResult, is(expectedResult));
	}
}
