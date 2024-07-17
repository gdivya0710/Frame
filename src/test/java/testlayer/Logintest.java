package testlayer;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselayer.Baseclass;
import pagelayer.Login;

public class Logintest extends Baseclass {
	
	private static Login login;
	
	@BeforeTest
	public void setup() {
		Baseclass.initialization();
	}
	
	@Test
	public void validateloginfunctionality() {
		login= new Login();
		login.loginfunctionality("standard_user", "secret_sauce");
	}
	
	
	}
