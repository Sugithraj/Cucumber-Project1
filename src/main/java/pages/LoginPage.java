package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="sugith06raj@gmail.com")
	WebElement username;
	
	@FindBy(id="seleniumpom")
	WebElement password;
	
	@FindBy(className="icon-lock left")
	WebElement loginButton;
	
	public LoginPage enterUserName() {
		username.sendKeys("sugith06raj@gmail.com");
		return this;
	}
	
	public LoginPage enterpassword() {
		 password.sendKeys("seleniumpom");
		 //enterById("password", "seleniumpom");
		return this;
	}
	
	public MyAccountPage clickLogin() {
		
		clickByClassName("icon-lock left");
		return new MyAccountPage();
		
		
	}
	

}
