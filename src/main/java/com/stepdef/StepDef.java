package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.generic.DriverManager;
import com.pagefactory.MasterPagefactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	MasterPagefactory mpf;
	
	@Given("Open the browser")
	public void open_the_browser() {
		DriverManager dm = new DriverManager();
		driver = dm.getChromeDriver(driver);
	
	}

	@Given("Pass the URL {string}")
	public void pass_the_url(String URL) {
	   driver.navigate().to(URL);
	
	}

	@When("Enter username in the username field {string}")
	public void enter_username_in_the_username_field(String username) {
		mpf = new MasterPagefactory(driver);
	   mpf.getUsername().sendKeys(username); 
	
	}

	@When("Enter password in the password field {string}")
	public void enter_password_in_the_password_field(String password) {
	   
	mpf.getPassword().sendKeys(password);
	}

	@When("Click on Login button")
	public void click_on_login_button() {
	   
	mpf.getLogin().click();
	}

	@Then("validate that Login is successful")
	public void validate_that_login_is_successful() {
	   Assert.assertTrue(mpf.getLogout().isDisplayed(), "Login successful");
	if(mpf.getLogout().isDisplayed()) {
		System.out.println("Login successful"); 
	}else {
		System.out.println("Login failed"); 
	}
	}
@Then("validate that error message is displayed")
public void getError() {
	Assert.assertTrue(mpf.getErrormessage().isDisplayed(), "signin not successful");
}


@When("click on logout button")
public void click_on_logout_button() {
   mpf.getLogout().click();

}

@Then("Validate that log out is successful")
public void validate_that_log_out_is_successful() {
   
Assert.assertTrue(mpf.getLogin().isDisplayed(), "Logout successful");
if(mpf.getLogin().isDisplayed()) {
	System.out.println("Logout successful"); 
}else {
	System.out.println("Logout failed"); 
}  
}

}
