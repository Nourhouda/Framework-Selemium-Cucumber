package com.e2eTest.automation.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormPage {

	WebDriver driver;

	public FormPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String USER_FIRSTNAME_ID  = "first_45";
	final static String USER_LASTNAME_ID  = "last_45";
	final static String BUTTON_SUBMIT_XPATH = "//button[@id='input_14']";
	
	/* @FindBy*/
	@FindBy(how=How.ID , using = USER_FIRSTNAME_ID)
	public static WebElement userFirstName;
	@FindBy(how=How.ID , using = USER_LASTNAME_ID)
	public static WebElement userLastName;
	@FindBy(how=How.XPATH, using = BUTTON_SUBMIT_XPATH)
	public static WebElement btnSubmit;
	
	/* @Methods*/
	public void SendUserFirstName() {
		
		userFirstName.sendKeys("Nour");
	}
	
	public void SendUserLastName() {
		
		userLastName.sendKeys("JLASSI");
	}
	
	public void clickSubmitButton() {
		btnSubmit.click();
	}
	
}
