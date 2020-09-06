package com.e2eTest.automation.stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.pageObject.FormPage;
import com.e2eTest.automation.util.CommonMethods;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FormStepDef extends CommonMethods {

	public WebDriver driver;
	private FormPage formPage=new FormPage(driver);
	//private CommonMethods commonMethods=new CommonMethods();
	
	public FormStepDef() {
		
		driver=Setup.driver;
	}

	@Given("^open application medical$")
	public void openApplicationMedical() throws Throwable {
		
		String url="https://form.jotform.com/81665408084158";
		driver.get(url);
	}
	
	@When("^set first name$")
	public void setFirstName() throws Throwable {
		
		PageFactory.initElements(driver, FormStepDef.class);
		formPage.sendFirstName();
	}

	@When("^set last name$")
	public void setLastName() throws Throwable {
		formPage.sendLastName();
	}

	@When("^click submit button$")
	public void submitForm() throws Throwable {

		CommonMethods.scrollerBottom();
		formPage.submitForm();
	}

}
