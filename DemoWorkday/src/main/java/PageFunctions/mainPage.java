package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import ObjectRepo.mainPageOR;
import TestCases.testBase;
import configurations.driverFunction;

public class mainPage extends mainPageOR {
	WebDriver driver=null;
	driverFunction driverFunc;

	public mainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		driverFunc=testBase.getdriverFunction();
	}
	public String getHeader() {
		return header.getText();
	}
	
	public personalInfo clickPersonalInfo() {
		driverFunc.click(piImage);
		driverFunc.addWait();
		return new personalInfo(driver);
	}

	
	
}
