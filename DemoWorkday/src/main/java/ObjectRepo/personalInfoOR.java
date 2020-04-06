package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.driverFunction;

public class personalInfoOR {
	private WebDriver driver;
	
	public personalInfoOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='2997$4586']")
	protected WebElement changePi;

	

}
