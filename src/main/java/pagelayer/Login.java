package pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselayer.Baseclass;
import utilitylayer.Wait;

public class Login extends Baseclass {
	
	@FindBy(name= "user-name")
	private WebElement username;
	
	@FindBy(name= "password")
	private WebElement password;
	
	@FindBy (name= "login-button")
	private WebElement login;
		
	public Login() {
	
		PageFactory.initElements(driver, this);
	}
	
	public void loginfunctionality(String uname, String pass) {
		Wait.sendKeys(username, uname);
		Wait.sendKeys(password, pass);
		Wait.click(login);
	}
		


}
