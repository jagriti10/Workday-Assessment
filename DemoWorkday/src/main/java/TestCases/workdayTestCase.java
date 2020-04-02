package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import configurations.loadProp;

public class workdayTestCase extends testBase {
	
	@Test(priority=1)
	public void isEmailDisplayed() throws InterruptedException
	{
		rm=si.login(loadProp.getProp().getProperty("email"),
				loadProp.getProp().getProperty("password"));
		Assert.assertTrue(rm!=null);
	}
	
	@Test(priority=2)
	public void checkTickAndSubmit() throws InterruptedException
	{	
		mp=rm.clickAndsubmit();
		Assert.assertTrue(mp!=null);
		
	}
	
	@Test(priority=3)
	public void checkUser() throws AssertionError
	{	//Assert.assertTrue(mp.verifyUser(),"User verified");
		pi=mp.clickPersonalInfo();
		Assert.assertTrue(pi!=null);
	}
	
	@Test(priority=4)
	public void isPersonalInfoClicked()
	{
		  ac=pi.clickPers();
		  Assert.assertTrue(ac!=null);
	}
	
	@Test(priority=5)
	public void isCommentAdded()
	{
		Assert.assertTrue(ac.writeAndSubmit());	
		
	}
	

}
