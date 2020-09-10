package com.e2eTest.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonMethods  {

	public static WebDriver driver;
	public static Properties prop;
	
	public CommonMethods()  {

		driver=Setup.driver;
	}
	
	protected static final Logger logger = LoggerFactory.getLogger(AbstractPage.class);
	
	// Scroll
	public static void scrollerBottom() {

		for (int second = 0;; second++) {
			if (second >= 60) {
				break;
			}
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,400)", "");
		}
	}

	public void scorllerTop () {
		
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollTo("+0+","+0+")", "");
	}
	
	// Refresh
	public void refreshBrowser() {

		driver.navigate().refresh();
	}

	// Back
	public void goBack() {

		driver.navigate().back();
	}

	// Forward
	public void forword() {

		driver.navigate().forward();
	}
	
	public static void openBrowserWithConfigFile(String url) throws IOException {
		
		prop= new Properties();
		FileInputStream fis= new FileInputStream("src/test/resources/configs/config.properties");
		prop.load(fis);
		driver.get(prop.getProperty(url));
	}
	
}
