package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ObjectRepo.personalInfoOR;
import TestCases.testBase;
import configurations.driverFunction;

public class personalInfo extends personalInfoOR {
	WebDriver driver=null;
	driverFunction driverFunc;
	
	
	public personalInfo(WebDriver driver) {
		super(driver);
		driverFunc=testBase.getdriverFunction();
	}
	
	public addComment clickPers() {
		driverFunc.doubleClick(changePi);
		driverFunc.sleep();
		return new addComment(driver);
		}
	}

