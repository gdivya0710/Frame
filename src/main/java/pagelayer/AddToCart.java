package pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselayer.Baseclass;
import utilitylayer.Wait;

public class AddToCart extends Baseclass {
	
	@FindBy(id= "add-to-cart-sauce-labs-backpack")
	private WebElement backpack;
	
	@FindBy(id= "add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement Tshirt;
	
	@FindBy(id= "add-to-cart-test.allthethings()-t-shirt-(red)")
	private WebElement allthethings;
	
	@FindBy(xpath= "//a[@class='shopping_cart_link']")
	private WebElement addtocart;
	
	@FindBy(id= "checkout")
	private WebElement checkout;
	
	
public AddToCart() {
	PageFactory.initElements(driver, this);
}

public void addToCartfunctionality() {
	Wait.click(backpack);
	Wait.click(Tshirt);
	Wait.click(allthethings);
}
	
public void clickaddtocartfunctionality() {
	Wait.click(addtocart);
}

public void clickCheckoutfunctionality() {
	Wait.click(checkout);
}

}
