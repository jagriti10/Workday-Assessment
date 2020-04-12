package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.driverFunction;

public class rememberDeviceOR {
	private WebDriver driver;

	public rememberDeviceOR(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
//	@FindBy(id="tdCheckbox")
//	protected WebElement checkbox;
	
	@FindBy(xpath="//button[@class='css-1o8kyg5-ButtonAsLink extbdco0']")
	protected WebElement skip;
	
}
