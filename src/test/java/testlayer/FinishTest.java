package testlayer;


import org.testng.annotations.Test;

import baselayer.Baseclass;
import pagelayer.Finish;

public class FinishTest extends Baseclass {
	
	private static Finish finish;
	
	@Test
	public static void validatefinishfunctionality() {
		finish= new Finish();
		finish.finishfunctionality();
	}
	

	

}
