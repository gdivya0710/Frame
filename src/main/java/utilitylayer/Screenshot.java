package utilitylayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baselayer.Baseclass;

public class Screenshot extends Baseclass {
	
	public static String takeScreenshot(String foldername, String Screenshotname) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		String destinationPath= System.getProperty("User.dir")+"//"+foldername+"//"+DateAndTime.captureCurrentYear()+"//"+DateAndTime.captureCurrentmonthandyear()+"//"+Screenshotname+DateAndTime.captureCurrentDateAndTime()+".png";
		File dest= new File(destinationPath);
		FileUtils.copyFile(src, dest);
		return destinationPath;
	}

}
