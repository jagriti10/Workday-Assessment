package configurations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class startDriver {
	static WebDriver driver=null;
	public void startDriver(String browser) {
	
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		default:
			break;
		}
		driver.get(loadProp.getProp().getProperty("url"));
		setDriver(driver);
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public static void setDriver(WebDriver driver) {
		startDriver.driver = driver;
	}


}
