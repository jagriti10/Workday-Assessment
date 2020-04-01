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
	@FindBy(xpath="//h1[@data-automation-id='landingPageWelcomeCardHeading']")
	protected WebElement welcomeCard;
	

	@FindBy(xpath="/html[1]/body[1]/div[5]/div[1]/div[1]/"
			+ "section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[2]"
			+ "/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[3]/div[1]")
	protected WebElement piImage;
	

	
}
