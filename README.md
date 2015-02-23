# Acceptance Testing Samples
Playground for some acceptae testing or bdd frameworks.
The layout is simple.
- calculator contains a project with the app to be tested and some unit tests
- the other projects, like calculator-cucumber-tests, contain acceptance tests using the atd / bdd framework included in the project name
- the app to be tested is shared via maven dependency, so all the test projects can test the same binary after it has been published

## Usage
- clone the whole repo
- call mvnw install inside 'calcualtor' to build and unittest the app
- call mvnw test in one of the other projects to run acceptance tests for the app using the different acceptance test frameworks
