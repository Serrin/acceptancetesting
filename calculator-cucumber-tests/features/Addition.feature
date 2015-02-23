@Calculations
Feature: Addition
  Scenario: Adding two positive numbers
    Given the calculator app is launched
    When I add the numbers 3 and 2
    Then the result should be 5