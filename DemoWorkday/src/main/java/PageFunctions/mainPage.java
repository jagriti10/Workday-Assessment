package PageFunctions;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

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
//	public Boolean verifyUser() {
//		driverFunc.addWait();
//		return userName.isDisplayed();
//	
//	}
//	
	public personalInfo clickPersonalInfo() throws InvocationTargetException {
		driverFunc.doubleClick(piImage);
		driverFunc.sleep();
		return new personalInfo(driver);
	}

	
	
}
