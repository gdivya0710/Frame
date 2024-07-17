package pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselayer.Baseclass;
import utilitylayer.Wait;

public class Personal extends Baseclass{
	
	@FindBy(name= "firstName")
	private WebElement firstname;
	
	@FindBy(name= "lastName")
	private WebElement lastname;
	
	@FindBy(name= "postalCode")
	private WebElement pcode;
	
	@FindBy(name= "continue")
	private WebElement cont;
	
	public Personal() {
		PageFactory.initElements(driver, this);
	}

public void personalfunctionality(String fname, String lname, String pin) {
	
	Wait.sendKeys(firstname, fname);
	Wait.sendKeys(lastname, lname);
	Wait.sendKeys(pcode, pin);
	Wait.click(cont);
	

	
}

}
