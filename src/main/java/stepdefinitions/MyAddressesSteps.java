package stepdefinitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MyAddressesPage;

public class MyAddressesSteps {
	
	MyAddressesPage MyAddressesPage = new MyAddressesPage();
	
	@Then("Click My Addresses")
	public void click_My_Addresses() {
		MyAddressesPage.ClickUpdate();
	}

	@Then("Click Update")
	public void click_Update() {
		MyAddressesPage.UpdateState(); 
	}
	
	@Then("Update {string}")
	public void update(String string) {
		MyAddressesPage.UpdateCity();
	}
	
	@When("Click Save")
	public void click_Save() {
		MyAddressesPage.ClickSave();
	}
	
	@Then("Validate the updates in MY ADDRESS section")
	public void validate_the_updates_in_MY_ADDRESS_section() {
		MyAddressesPage.verifyTextByXpath();
	}
	
	@Then("Click Sign out")
	public void click_Sign_out() {
		MyAddressesPage.Logout();
	}


	
	
	

}
