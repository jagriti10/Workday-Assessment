package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import configurations.driverFunction;
import ObjectRepo.signInOR;
import TestCases.testBase;



public class signIn extends signInOR{
	
	WebDriver driver=null; 
	driverFunction driverFunc;
	
	public signIn(WebDriver driver) {
	
			super(driver);
			PageFactory.initElements(driver, this);
			driverFunc = testBase.getdriverFunction();
	
	}
	
	public rememberDevice login(String username, String password) throws InterruptedException {
		
		driverFunc.enterValues(email,username);
		driverFunc.addWait();
		driverFunc.click(next1);
		driverFunc.addWait();
		driverFunc.enterValues(passwd,password);
		driverFunc.addWait();
		driverFunc.click(next2);
		Thread.sleep(60000);
	    return new rememberDevice(driver);
	}
	 
	
	
}
