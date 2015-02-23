package de.webcoders.sample.calculator;

import java.util.HashMap;
import java.util.Map;

import de.webcoders.sample.operations.Add;
import de.webcoders.sample.operations.Operation;
import de.webcoders.sample.operations.Substract;

public class CalculatorApp {

	private final Map<String, Operation> operatorRegistry = new HashMap<String, Operation>();
	private float firstOperand;
	private float secondOperand;

	public CalculatorApp() {
		registerOperations();
	}

	private void registerOperations() {
		operatorRegistry.put("+", new Add());
		operatorRegistry.put("-", new Substract());
	}

	public void setFirstOperand(float i) {
		firstOperand = i;
	}

	public void setSecondOperand(float i) {
		secondOperand = i;
	}

	public float calculate(String opertion) {
		if (operatorRegistry.containsKey(opertion)) {
			return operatorRegistry.get(opertion).calculate(firstOperand,
					secondOperand);
		} else {
			throw new UnsupportedOperationException(String.format(
					"Operation '%s' is not supported", opertion));
		}

	}
}
