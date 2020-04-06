package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.driverFunction;

public class mainPageOR {
	
	private WebDriver driver;
	
	public mainPageOR(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
//	@FindBy(xpath="//h1[contains(),'Welcome, Jagriti Sharma (41785JS)']")
//	protected WebElement userName;
	

	@FindBy(xpath="//body[@class='WCJ WG2P WIVM WDFP WODP workdayHome-o']/div[@id='workdayApplicationFrame']/div[@class='WK2P']/div[@id='mainContent']/section[@class='WH2P']/div[@class='WA-T']/div[@class='WNYT']/div[@id='wd-ViewPage-15$172879']/div[@class='WFFP WLEP']/div[@id='20baed1d70314b6491f21e751fc1d8d5']/div[@class='workdayHome-v']/div[@class='workdayHome-ab']/div[@class='workdayHome-w workdayHome-z']/div[@class='workdayHome-am']/div[@class='css-gnrx50-CardContainer e1mk4xet0']/div[@class='css-17tmhgx-CardContents e1mk4xet1']/div/div/div/ul[@id='wd-home-applets']/li[4]/div[1]")
	protected WebElement piImage;
	

	
}
