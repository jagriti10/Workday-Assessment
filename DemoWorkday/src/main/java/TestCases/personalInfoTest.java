package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class personalInfoTest extends testBase {
	
	@Test(priority=1)
	public void isPersonalInfoClicked() {
	  ac=pi.clickPers();
	  Assert.assertTrue(ac!=null);
		}

}
