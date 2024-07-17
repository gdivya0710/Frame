package testlayer;


import org.testng.annotations.Test;

import baselayer.Baseclass;
import pagelayer.AddToCart;

public class AddToCartTest extends Baseclass {

	private static AddToCart addtocart;
	
	@Test (priority=1)
	public void validateAddToCartfunctionality() throws InterruptedException {
		Thread.sleep(4000);
		addtocart= new AddToCart();
		addtocart.addToCartfunctionality();
	}
	
	@Test (priority=2)
	public void validateclickaddtocartfunctionality() {
		addtocart.clickaddtocartfunctionality();
	}

	@Test (priority=3)
	public void validateclickCheckoutfunctionality() {
		addtocart.clickCheckoutfunctionality();
	}
}
