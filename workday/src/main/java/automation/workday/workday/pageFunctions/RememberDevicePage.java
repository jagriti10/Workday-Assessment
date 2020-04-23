package automation.workday.workday.pageFunctions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import automation.workday.workday.helper.logger.LoggerHelper;
import automation.workday.workday.helper.wait.WaitHelper;
import automation.workday.workday.pageObject.RememberDeviceOR;
import automation.workday.workday.testBase.TestBase;

public class RememberDevicePage extends RememberDeviceOR {

	private WebDriver driver;
	private final Logger log=LoggerHelper.getLogger(LoginPage.class);
	WaitHelper waitHelper;
	
	public RememberDevicePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		waitHelper=new WaitHelper(driver); 
		waitHelper.WaitForElementVisibleWithPollingTime(skip,60,10);
		logExtentReport("Remember Device Page object created");
	}
	
	public HomePage clickOnSkip() {
		log.info("clicking on skip option....");
		logExtentReport("clicking on skip option....");
		skip.click();
		return new HomePage(driver);
	}
	
	public void logExtentReport(String s1) {
		TestBase.test.log(Status.INFO,s1);
		
	}

	
}
