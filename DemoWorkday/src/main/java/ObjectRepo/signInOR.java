package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.driverFunction;

public class signInOR {
	
	driverFunction driverFunc;
	
	public signInOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	protected WebElement email;
	
	@FindBy(id="next")
	protected WebElement next1;
	
	@FindBy(id="password")
	protected WebElement passwd;
	
	@FindBy(id="submit")
	protected WebElement next2;
	
}
