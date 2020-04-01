package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ObjectRepo.rememberDeviceOR;
import TestCases.testBase;
import configurations.driverFunction;

public class rememberDevice extends rememberDeviceOR {
	WebDriver driver;
	driverFunction driverFunc;
	mainPage mp=new mainPage(driver);
	
	
	public rememberDevice(WebDriver driver) {
		super(driver);
		driverFunc = testBase.getdriverFunction();
	}
	
	public mainPage clickAndsubmit() throws InterruptedException {
		driverFunc.addWait();
		driverFunc.click(skip);
		driverFunc.addWait();
		return mp;
	}

	
	
}
