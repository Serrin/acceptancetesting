package de.webcoders.sample.calculator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.ReportBuilder;

public class HtmlReportGenerator {
	public static void main(String[] args) throws Exception {
		File reportOutputDirectory = new File("target/cucumber-html");
		List<String> jsonReportFiles = new ArrayList<String>();
		jsonReportFiles.add("target/cucumber/cucumber.json");

		ReportBuilder reportBuilder = new ReportBuilder(jsonReportFiles,
				reportOutputDirectory, "", "1", "calculator", false, false,
				false, false, false, null, false);
		reportBuilder.generateReports();
	}

}
