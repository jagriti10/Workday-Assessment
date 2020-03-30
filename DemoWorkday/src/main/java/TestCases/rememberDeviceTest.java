package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rememberDeviceTest extends testBase {
	@Test
	public void checkClickAndSubmit() throws InterruptedException {
		mp=rm.clickAndsubmit();
		Assert.assertTrue(mp!=null);
		
	}
}
