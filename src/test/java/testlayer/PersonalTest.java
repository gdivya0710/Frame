package testlayer;

import org.testng.annotations.Test;

import baselayer.Baseclass;
import pagelayer.Personal;

public class PersonalTest extends Baseclass{
	
	private static Personal personal;
	
	@Test
	public static void validatepersonalfunctionality() {
		personal= new Personal();
		personal.personalfunctionality("Divya", "Gupta", "411018");
	}

}
