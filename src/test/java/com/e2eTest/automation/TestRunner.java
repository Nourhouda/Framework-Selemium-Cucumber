package com.e2eTest.automation;

import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

import java.io.File;

import org.junit.AfterClass;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/specs/features" },
		// glue = {""},
		plugin = { "pretty", "html:target/cucmber-htm-report", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/OrangeReport.html" }, snippets = SnippetType.CAMELCASE, tags = {
						("@authentification") }, monochrome = true)

public class TestRunner {

	@AfterClass
	public static void writeExtentReport() {

		Reporter.loadXMLConfig(new File("src/test/resources/configs/extent-config.xml"));
	}
}
