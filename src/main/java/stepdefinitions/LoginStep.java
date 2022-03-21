package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep {
	
	LoginPage loginPage = new LoginPage();
	
	@Given("Enter username")
	public void enter_username() {
	    loginPage.enterUserName();
	}
	
	@Given("Enter password")
	public void enter_password() {
		loginPage.enterpassword();
	}
	
	@When("Click login")
	public void click_login() {
		loginPage.enterpassword();
	}
	

}
