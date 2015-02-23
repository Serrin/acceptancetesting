package de.webcoders.sample.calculator;

import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseRunner;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.FitnesseDir(value = ".", fitNesseRoot = "akzeptanztests")
@FitNesseRunner.Suite("Addition")
@FitNesseRunner.OutputDir("target/fitnesse-results")
@FitNesseRunner.ConfigFile("plugins.properties")
public class Akzeptanztests {

}
