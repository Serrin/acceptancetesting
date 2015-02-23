@Calculations
Feature: Substraction
  Scenario: Substracting two positive numbers
    Given the calculator app is launched
    When I substract the numbers 3 and 2
    Then the result should be 1