package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class MyAccountPage extends GenericWrappers  {
	
	public MyAccountPage(){
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//span[contains(text(),'My addresses')]")
	WebElement MyAddresses;
	
	
	public MyAddressesPage clickAddresses() {
		//MyAddresses.click();
		clickByXpath("//span[contains(text(),'My addresses')]");
		return new MyAddressesPage();
	    
	}
}
