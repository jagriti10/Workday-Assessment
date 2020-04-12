package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ObjectRepo.rememberDeviceOR;
import TestCases.testBase;
import configurations.driverFunction;

public class rememberDevice extends rememberDeviceOR {
	WebDriver driver=null;
	driverFunction driverFunc;
	
	public rememberDevice(WebDriver driver) {
		super(driver);
		driverFunc = testBase.getdriverFunction();
	}
	
	public mainPage clickAndsubmit(){
		driverFunc.addWait();
		driverFunc.click(skip);
		driverFunc.sleep();
		return new mainPage(driver);
	}

	
	
}
