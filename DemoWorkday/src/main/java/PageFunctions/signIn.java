package PageFunctions;

import java.util.concurrent.TimeUnit;

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
	
	public mainPage login(String username, String password) throws InterruptedException {
		
		driverFunc.enterValues(email,username);
		driverFunc.addWait();
		driverFunc.click(next1);
		driverFunc.addWait();
		driverFunc.enterValues(passwd,password);
		driverFunc.addWait();
		driverFunc.click(next2);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    return new mainPage(driver);
	}
	 
	
	
}
