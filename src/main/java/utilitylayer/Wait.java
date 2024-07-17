package utilitylayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import baselayer.Baseclass;

public class Wait extends Baseclass {
	
	public static void click(WebElement wb) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
	}
	
	public static void sendKeys(WebElement wb, String value) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(wb)).sendKeys(value);	
	}
	
		
	}

