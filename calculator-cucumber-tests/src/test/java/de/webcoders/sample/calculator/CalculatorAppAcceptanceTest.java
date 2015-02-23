package de.webcoders.sample.calculator;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber",
		"json:target/cucumber/cucumber.json" }, features = "features")
public class CalculatorAppAcceptanceTest {

}
