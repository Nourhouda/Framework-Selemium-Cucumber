package com.e2eTest.automation.util;

public class InternetExplorerDriver extends DriverManager {
	
	@Override
	protected void startService() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver","path/IEDriverServer.exe");
	
	}

	@Override
	protected void stopService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
		// TODO Auto-generated method stub
		
		//driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}

}
