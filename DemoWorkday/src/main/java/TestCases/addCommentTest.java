package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class addCommentTest extends testBase{
	
	@Test(priority=1)
	public void isCommentAdded() {
	Assert.assertTrue(ac.writeAndSubmit());	
	
	} 
	
	

}
