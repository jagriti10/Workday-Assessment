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
	@FindBy(css="h1[@data-automation-id='landingPageWelcomeCardHeading']")
	protected WebElement header;
	
	
	@FindBy(xpath="//body[@class='WCJ WF2P WIVM WCFP WNDP workdayHome-o']/div[@id='workdayApplicationFrame']/div[@class='WJ2P']/div[@id='mainContent']/section[@class='WG2P']/div[@class='WPYT']/div[@class='WMYT']/div[@id='wd-ViewPage-15$172879']/div[@class='WEFP WKEP']/div[@id='e305aaa345a84832aea05b28afa014b4']/div[@class='workdayHome-v']/div[@class='workdayHome-ab']/div[@class='workdayHome-w workdayHome-z']/div[@class='workdayHome-am']/div[@class='css-gnrx50-CardContainer e1mk4xet0']/div[@class='css-17tmhgx-CardContents e1mk4xet1']/div/div/div/ul[@id='wd-home-applets']/li[3]/div[1]")
	protected WebElement piImage;
	

	
}
