package stepdefinitions;


import io.cucumber.java.en.Then;
import pages.MyAccountPage;

public class MyAccountSteps {
	
	MyAccountPage MyAccountPage = new MyAccountPage();
	
	@Then("Click My Addresses")
	public void click_My_Addresses() {
		MyAccountPage.clickAddresses();
			
			
	}

}
