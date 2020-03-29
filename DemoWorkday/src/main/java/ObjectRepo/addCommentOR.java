package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addCommentOR {
	
	WebDriver driver;
	
	public addCommentOR(WebDriver driver) {
	PageFactory.initElements(driver,this);	
	}
	
	@FindBy(css="textarea[@data-automation-id='textAreaField']")
	protected WebElement comment;
	
	@FindBy(xpath="//button[@id='67126638dfe24160b655bf6ec40f4efb']")
	protected WebElement submit;


}
