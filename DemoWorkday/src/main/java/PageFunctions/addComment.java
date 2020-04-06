package PageFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import ObjectRepo.addCommentOR;
import TestCases.testBase;
import configurations.driverFunction;

public class addComment extends addCommentOR{
	WebDriver driver=null;
	driverFunction driverFunc;
	
	public addComment(WebDriver driver) {
		super(driver);
		driverFunc=testBase.getdriverFunction();
	}
	
	public boolean writeAndSubmit() {
		driverFunc.enterValues(comment,"This for testing");
		//comment.clear();
		driverFunc.addWait();
		driverFunc.click(submit);
		driverFunc.sleep();
		return true;
		
		}

}
