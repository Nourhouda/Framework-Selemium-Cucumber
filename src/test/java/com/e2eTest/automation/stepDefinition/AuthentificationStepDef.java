package com.e2eTest.automation.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.e2eTest.automation.pageObject.AuthentificationPage;
import com.e2eTest.automation.util.Setup;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AuthentificationStepDef {

	public WebDriver driver;
	private AuthentificationPage authentificationPage=new AuthentificationPage(driver);
	
	public AuthentificationStepDef() {
		
		driver=Setup.driver;
	}
	
		@Given("^open application$")
		public void openApplication() throws Throwable {
			
			String url="https://opensource-demo.orangehrmlive.com/";
			driver.get(url);
		}

		@When("^set username$")
		public void setUsername() throws Throwable {
			
			PageFactory.initElements(driver, AuthentificationPage.class);
			authentificationPage.sendUserName();
		}

		@When("^set password$")
		public void setPassword() throws Throwable {

			authentificationPage.sendUserPassword();
		}

		@And("^click nlogin button$")
		public void clickNloginButton() throws Throwable {

			authentificationPage.clickLoginButton();
		}

		@Then("^show page admin$")
		public void showPageAdmin() throws Throwable {

			String wlc=AuthentificationPage.welcome.getText();
			Assert.assertTrue(wlc.contains("Welcome"));
		}

}
