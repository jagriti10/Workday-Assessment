
package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class mainPageTest extends testBase {
	@Test(priority=1)
	public void checkUser() throws AssertionError{
		String user= mp.checkLogin();
		Assert.assertEquals(user,"Welcome, Jagriti Sharma (41785JS)");
	
	}
	
	

}
