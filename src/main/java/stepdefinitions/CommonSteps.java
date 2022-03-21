package stepdefinitions;

import io.cucumber.java.en.Given;
import wrappers.GenericWrappers;

public class CommonSteps {
	
	GenericWrappers wrapper = new GenericWrappers();
	
	@Given("Opening the browser")
	public void opening_the_browser() {
		wrapper.invokeApp("chrome", "http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
	}
	
	

}
