package utilitylayer;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsSetUp {
	
	public static ExtentReports setUp(String reportname) {
		
		ExtentReports extentreports= new ExtentReports();
		String destinationPath= System.getProperty("User.dir")+"//ExtentsReport//"+DateAndTime.captureCurrentYear()+"//"+DateAndTime.captureCurrentmonthandyear()+"//"+reportname+DateAndTime.captureCurrentDateAndTime()+".html";

		ExtentSparkReporter extentreporter= new ExtentSparkReporter(destinationPath);
		
		extentreports.attachReporter(extentreporter);
		return extentreports;
		
		
	}

}
