package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import ObjectRepo.mainPageOR;
import TestCases.testBase;
import configurations.driverFunction;

public class mainPage extends mainPageOR {
	
	driverFunction driverFunc;
	personalInfo pi=new personalInfo(driver);

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
	public personalInfo clickPersonalInfo() {
		driverFunc.doubleClick(piImage);
		driverFunc.sleep();
		return pi;
	}

	
	
}
