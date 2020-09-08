package com.e2eTest.automation.util;

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
	
	public static void scrollerBottom() {

		// Scroll
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
	
	public void refreshBrowser() {

		// Refresh
		driver.navigate().refresh();

	}

	public void goBack() {

		// Back
		driver.navigate().back();

	}

	public void forword() {

		// Forward
		driver.navigate().forward();

	}
	
	//public void readFile() throws IOException {
		
		//prop= new Properties();
		//FileInputStream fis= new FileInputStream("src/test/ressources/configs/config.properties");
		//prop.load(fis);
	//}
	
}
