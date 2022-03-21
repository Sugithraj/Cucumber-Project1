package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class MyAddressesPage extends GenericWrappers {
	
	public MyAddressesPage(){
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//span[contains(text(),'Update')]")
	WebElement UpdateClick;
	
	@FindBy(xpath="//select[@id='id_state']\", \"Arizona")
	WebElement StateUpdate;
	
	@FindBy(xpath="//input[@id='city']\", \"Washington")
	WebElement CityUpdate;
	
	@FindBy(xpath="addresses\",\"//span[contains(text(),'Save')]")
	WebElement SaveClick;
	
	@FindBy(xpath="\"//span[contains(text(),'Arizona')]\", \"Arizona\"")
	WebElement Verifytext1;
	
	@FindBy(xpath="\"//span[contains(text(),'Washington')]\", \"Washington\"")
	WebElement Verifytext2;
	
	@FindBy(xpath="(//a[contains(text(),'Sign out')])[1]")
	WebElement Logout;
	
	public MyAddressesPage ClickUpdate() {
		 clickByXpath("//span[contains(text(),'Update')]");
		 return this;
	}
	
	public MyAddressesPage UpdateState() {
		enterByXpath("//select[@id='id_state']", "Arizona");
	    return this;  	
	}
	
	public MyAddressesPage UpdateCity() {
		enterByXpath("//input[@id='city']", "Washington");
		return this;
	}
	
	public MyAddressesPage ClickSave() {
		clickByXpath("addresses\",\"//span[contains(text(),'Save')]");
		return this;
	}
	
	public MyAddressesPage verifyTextByXpath() {
		verifyTextByXpath("//span[contains(text(),'Arizona')]", "Arizona");
		return this;
	}
	
	public MyAddressesPage VerifyTextByXpath() {
		verifyTextByXpath("//span[contains(text(),'Washington')]", "Washington");	
		return this;
	}
	
	public LoginPage Logout() {
		clickByXpath("(//a[contains(text(),'Sign out')])[1]");
		return new LoginPage ();
	    
	}

	
	
	

}
