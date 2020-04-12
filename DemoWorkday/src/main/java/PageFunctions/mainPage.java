package PageFunctions;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;

import ObjectRepo.mainPageOR;
import TestCases.testBase;
import configurations.driverFunction;

public class mainPage extends mainPageOR {
	WebDriver driver=null;
	driverFunction driverFunc;

	public mainPage(WebDriver driver) {
		super(driver);
		driverFunc=testBase.getdriverFunction(); 
	}
	public Boolean verifyUser() {
		driverFunc.addWait();
		String user =driverFunc.exeText();
		if(user=="Welcome, Jagriti Sharma (41785JS)") {
			System.out.print(user);
			return true;
		}
		else
			return false;
	
	}

	public personalInfo clickPersonalInfo() throws InvocationTargetException {
		driverFunc.doubleClick(piImage);
		driverFunc.sleep();
		return new personalInfo(driver);
	}

	
	
}
