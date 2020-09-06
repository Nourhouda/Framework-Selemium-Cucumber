package com.e2eTest.automation.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Setup {

	public static WebDriver driver;
	static DriverManager driverManger;

	@Before
	/**
	 * Call browser with the designe pattern factory navigater
	 */
	public static void setup() {

		driverManger = DriverManagerFactory.getManager(DriverType.CHROME);
		driver = driverManger.getDriver();
	}

	/**
	 * Embaded a screendhot in test report if test is marker as failed
	 * 
	 * @param scenario
	 */
	@After
	public void embedScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			try {
				scenario.write("current page url is :" + driver.getCurrentUrl());
				byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
				scenario.embed(screenshot, "image/png");
			} catch (WebDriverException somePlateformDontSupportScreenshots) {
				System.err.println(somePlateformDontSupportScreenshots.getMessage());
			}
		}
		driver.quit();
	}
}
