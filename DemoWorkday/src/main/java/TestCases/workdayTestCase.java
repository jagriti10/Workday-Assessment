package TestCases;

import java.lang.reflect.InvocationTargetException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import configurations.loadProp;

public class workdayTestCase extends testBase {


	@Test(priority=1)
	public void isEmailDisplayed() throws InterruptedException
	{	
		logger = report.createTest("Login");
		rm=si.login(loadProp.getProp().getProperty("email"),
				loadProp.getProp().getProperty("password"));
		Assert.assertNotNull(rm);
		logger.pass("Passed TC-1");
	}
	
	@Test(priority=2)
	public void checkTickAndSubmit() throws InterruptedException
	{	
		logger = report.createTest("Details Verify");
		logger.log(Status.INFO, "Skip for this computer");
		Assert.assertNotNull(rm.clickAndsubmit());
		logger.pass("Passed TC-2");
	}
	
	@Test(priority=3)
	public void checkUser() throws AssertionError, InvocationTargetException
	{	//Assert.assertNotNull(mp.verifyUser(),"User verified");
		logger = report.createTest("Verify User");
		pi=mp.clickPersonalInfo();
		logger.log(Status.INFO, "Verify user");
		Assert.assertNotNull(pi);
		logger.pass("Passed TC-3");
	}
	
	@Test(priority=4)
	public void isPersonalInfoClicked()
	{	  
		  logger = report.createTest("Click on Edit Personal Info");
		  ac=pi.clickPers();
		  logger.log(Status.INFO, "Navigated to page 4");
		  Assert.assertNotNull(ac);
		  logger.pass("Passed TC-4");
	}
	
	@Test(priority=5)
	public void isCommentAdded()
	{	
		logger = report.createTest("Adding comments and submiting form ");
		ac.writeAndSubmit();
		logger.log(Status.INFO, "Comments Added");
		logger.pass("Passed TC-5");
	}
	

}
