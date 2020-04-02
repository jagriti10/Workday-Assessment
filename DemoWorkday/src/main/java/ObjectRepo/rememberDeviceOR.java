package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.driverFunction;

public class rememberDeviceOR {
	public WebDriver driver;

	public rememberDeviceOR(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
//	@FindBy(id="tdCheckbox")
//	protected WebElement checkbox;
	
	@FindBy(xpath="//button[@data-automation-id='linkButton']")
	protected WebElement skip;
	
}
