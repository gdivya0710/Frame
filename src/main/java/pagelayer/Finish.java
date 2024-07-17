package pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselayer.Baseclass;
import utilitylayer.Wait;

public class Finish extends Baseclass {
	
	@FindBy (name= "finish")
	private WebElement finishbutton;
	
	
	public Finish() {
		PageFactory.initElements(driver, this);
	}
	
	public void finishfunctionality() {
		Wait.click(finishbutton);
	}
}
