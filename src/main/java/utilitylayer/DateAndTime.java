package utilitylayer;

import java.text.SimpleDateFormat;
import java.util.Date;

import baselayer.Baseclass;

public class DateAndTime extends Baseclass{
	
	public static String captureCurrentYear() {
		return new SimpleDateFormat("yyyy").format(new Date());
	}
	
	public static String captureCurrentmonthandyear() {
		SimpleDateFormat simpledateformat = new SimpleDateFormat("MMyyyy");
		String monthyear= simpledateformat.format(new Date());
		return monthyear;	
	}
	
	public static String captureCurrentDateAndTime() {
		return new SimpleDateFormat("ddMMyyyy_HHmmss").format(new Date());
	}

}
