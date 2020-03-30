package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import configurations.loadProp;

public class signInTest extends testBase {

	@Test(priority=1)
	public void isEmailDisplayed() throws InterruptedException {
		rm=si.login(loadProp.getProp().getProperty("email"),
				loadProp.getProp().getProperty("password"));
		
		Assert.assertTrue(rm!=null);
	}
	

}
