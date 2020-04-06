package TestCases;

import java.lang.reflect.InvocationTargetException;

import org.testng.Assert;
import org.testng.annotations.Test;

import configurations.loadProp;

public class workdayTestCase extends testBase {


	@Test(priority=1)
	public void isEmailDisplayed() throws InterruptedException
	{
		rm=si.login(loadProp.getProp().getProperty("email"),
				loadProp.getProp().getProperty("password"));
		Assert.assertNotNull(rm);
	}
	
	@Test(priority=2)
	public void checkTickAndSubmit() throws InterruptedException
	{	
		mp=rm.clickAndsubmit();
		Assert.assertNotNull(mp);
	}
	
	@Test(priority=3)
	public void checkUser() throws AssertionError, InvocationTargetException
	{	//Assert.assertNotNull(mp.verifyUser(),"User verified");
		pi=mp.clickPersonalInfo();
		Assert.assertNotNull(pi);
	}
	
	@Test(priority=4)
	public void isPersonalInfoClicked()
	{
		  ac=pi.clickPers();
		  Assert.assertNotNull(ac);
	}
	
	@Test(priority=5)
	public void isCommentAdded()
	{	
		ac.writeAndSubmit();
	}
	

}
