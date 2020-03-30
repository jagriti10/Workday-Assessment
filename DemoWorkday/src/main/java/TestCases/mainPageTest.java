
package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class mainPageTest extends testBase {
	@Test(priority=1)
	public void checkUser() throws AssertionError{
		String user= mp.getHeader();
		Assert.assertEquals(user,"Welcome, Jagriti Sharma (41785JS)");
		pi=mp.clickPersonalInfo();
		Assert.assertTrue(pi!=null);
	}
	
	

}
