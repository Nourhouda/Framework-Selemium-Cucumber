package com.e2eTest.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PrintDataOutLinePage {

	WebDriver driver;

	public PrintDataOutLinePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String FULL_NAME = "userName";
	final static String EMAIL = "userEmail";
	
	/* @FindBy*/
	@FindBy(how=How.ID, using = FULL_NAME)
	public static WebElement fullNameId;
	@FindBy(how=How.ID, using = EMAIL)
	public static WebElement emailId;

	/* @Methods*/
	public void sendfullName(String fullName) {
		
		fullNameId.sendKeys(fullName);
	}
	public void sendEmail(String email) {
		
		emailId.sendKeys(email);
	}
	
}
