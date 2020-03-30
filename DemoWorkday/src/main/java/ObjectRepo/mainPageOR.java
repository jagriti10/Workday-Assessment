package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPageOR {
	WebDriver driver;
	
	public mainPageOR(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//h1[@class='workdayHome-j']")
	protected WebElement header;
	
	
	@FindBy(xpath="//li[3]//div[1]//div[1]//div[1]//*[local-name()='svg']")
	protected WebElement piImage;
	

	
}
