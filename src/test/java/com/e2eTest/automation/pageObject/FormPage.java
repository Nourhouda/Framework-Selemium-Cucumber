package com.e2eTest.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

WebDriver driver ;
	
	public FormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	final static String FIRST_NAME_ID = "first_45";
	final static String LAST_NAME_ID = "last_45";
	final static String SUBMIT_XPATH = "//button[@id='input_14']";
	
	/* @FindBy */

	@FindBy(how = How.ID, using = FIRST_NAME_ID)
	public static WebElement firstName;
	@FindBy(how = How.ID, using = LAST_NAME_ID)
	public static WebElement lastName;
	@FindBy(how = How.XPATH, using = SUBMIT_XPATH)
	public static WebElement submit;
	
	/* Methods */

	public void sendFirstName() {
		firstName.sendKeys("blablabla");
	}

	public void sendLastName() {
		lastName.sendKeys("blablabla");
	}

	public void submitForm() {
		submit.click();
	}

	
	
	
	
	
}
