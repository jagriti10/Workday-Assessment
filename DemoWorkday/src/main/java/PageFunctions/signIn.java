package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import configurations.driverFunction;
import ObjectRepo.signInOR;
import TestCases.testBase;



public class signIn extends signInOR{
	
	driverFunction driverFunc;
	rememberDevice rm=new rememberDevice(driver);
	
	public signIn(WebDriver driver) {
	
			super(driver);
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
		driverFunc.sleep();
	    return rm;
	}
	 
	
	
}
