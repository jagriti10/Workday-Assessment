package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ObjectRepo.personalInfoOR;
import TestCases.testBase;
import configurations.driverFunction;

public class personalInfo extends personalInfoOR {
	WebDriver driver;
	driverFunction driverFunc;
	addComment ac=new addComment(driver);
	
	public personalInfo(WebDriver driver) {
		super(driver);
		driverFunc=testBase.getdriverFunction();
	}
	
	public addComment clickPers() {
		driverFunc.doubleClick(changePi);
		return ac;
	}

	}

