package automation.workday.workday.helper.assertions;

import org.apache.log4j.Logger;
import org.testng.Assert;

import automation.workday.workday.helper.logger.LoggerHelper;

public class AssertionHelper {

private static Logger log = LoggerHelper.getLogger(AssertionHelper.class);
	
	public static void verifyText(String s1, String s2){
		log.info("veryfing test: "+ s1 + " with "+ s2);
		Assert.assertEquals(s1, s1);
	}
	
	public static void markPass(String message){
		log.info("making script PASS.."+ message);
		Assert.assertTrue(true, message);
	}
	
	public static void markFail(String message){
		log.info("making script FAIL.."+message);
		Assert.assertTrue(false, message);
	}
	
	public static void verifyTrue(boolean status){
		Assert.assertTrue(status);
	}
	
	public static void verifyFalse(boolean status){
		Assert.assertFalse(status);
	}
	
	public static void verifyNull(String s1){
	    log.info("verify object is null..");
		Assert.assertNull(s1);
	}
	
	public static void verifyNotNull(String s1){
		log.info("verify object is not null..");
		Assert.assertNotNull(s1);
	}
	
	public static void updateTestStatus(boolean status){
		String s = null;
		if(status){
			markPass(s);
		}
		else{
			markFail(s);
		}
	}
}
