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

		Assert.assertNotNull(si.login(loadProp.getProp().getProperty("email"),
				loadProp.getProp().getProperty("password")));

	}

	@Test(priority=2)
	public void checkTickAndSubmit() throws InterruptedException
	{	
		logger = report.createTest("Details Verify");
		logger.log(Status.INFO, "Skip for this computer");

		Assert.assertNotNull(rm.clickAndsubmit());

	}

	@Test(priority=3)
	public void checkUser() throws AssertionError, InvocationTargetException
	{
		logger = report.createTest("Username verification");
		logger.log(Status.INFO, "Verify user");

		Assert.assertNotNull(mp.clickPersonalInfo());

	}

	@Test(priority=4)
	public void isPersonalInfoClicked()
	{	  
		logger = report.createTest("Click on Edit Personal Info");
		logger.log(Status.INFO, "Navigated to page 4");
		
		Assert.assertNotNull(pi.clickPers());

	}

	@Test(priority=5)
	public void isCommentAdded()
	{	
		logger = report.createTest("Adding comments and submiting form ");
		logger.log(Status.INFO, "Comments Added");
		ac.writeAndSubmit();

	}


}
