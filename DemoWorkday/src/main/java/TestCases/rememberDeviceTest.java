package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class rememberDeviceTest extends testBase {
	@Test
	public void checkClickAndSubmit() {
		rm.clickAndsubmit();
		Assert.assertTrue(rm!=null);
		
	}
}
