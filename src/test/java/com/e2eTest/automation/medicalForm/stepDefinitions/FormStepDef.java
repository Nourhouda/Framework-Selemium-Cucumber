package com.e2eTest.automation.medicalForm.stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.medicalForm.pageObjects.FormPage;
import com.e2eTest.automation.util.CommonMethods;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class FormStepDef extends CommonMethods {

	public WebDriver driver;
	private FormPage formPage = new FormPage(driver);

	public FormStepDef() {

		driver = Setup.driver;
	}

	@Given("^open application medical$")
	public void openApplicationMedical() throws Throwable {

		CommonMethods.openBrowserWithConfigFile("url2");
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
