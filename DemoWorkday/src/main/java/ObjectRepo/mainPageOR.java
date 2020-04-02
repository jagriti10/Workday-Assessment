package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.driverFunction;

public class mainPageOR {
	
	public WebDriver driver;
	
	public mainPageOR(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
//	@FindBy(xpath="//h1[contains(),'Welcome, Jagriti Sharma (41785JS)']")
//	protected WebElement userName;
	

	@FindBy(css="body.WCJ.WF2P.WIVM.WCFP.WNDP.workdayHome-o:nth-child(2) div.WK2P.WI1P.WI5:nth-child(13) div.WJ2P div.WM2P:nth-child(1) section.WG2P:nth-child(2) div.WPYT div.WMYT div.WBFP.WMDP.WOFP.WI5.WJEP.wd-ViewPage div.WEFP.WKEP div.workdayHome-q.workdayHome-ac div.workdayHome-v:nth-child(3) div.workdayHome-ab div.workdayHome-w.workdayHome-z div.workdayHome-am div.css-gnrx50-CardContainer.e1mk4xet0 div.css-17tmhgx-CardContents.e1mk4xet1 div:nth-child(1) div:nth-child(2) ul.workdayHome-x li.workdayHome-ad:nth-child(3) > div.workdayHome-ae")
	protected WebElement piImage;
	

	
}
