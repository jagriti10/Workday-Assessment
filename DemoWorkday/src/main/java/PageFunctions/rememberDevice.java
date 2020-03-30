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
		PageFactory.initElements(driver, this);
		driverFunc = testBase.getdriverFunction();
	}
	
	public mainPage clickAndsubmit() throws InterruptedException {
		Thread.sleep(5000);
		driverFunc.click(checkbox);
		driverFunc.addWait();
		driverFunc.click(submit);
		return new mainPage(driver);
	}

	
	
}
