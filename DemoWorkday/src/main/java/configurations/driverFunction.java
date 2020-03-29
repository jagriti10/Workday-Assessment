package configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class driverFunction {
	@SuppressWarnings("unused")
	private WebDriver driver=null;

	public driverFunction(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String enterValues(WebElement ele, String value) {
		try {
		ele.sendKeys(value);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return value;
	}
	
	public void click(WebElement ele) {
		try {
			ele.click();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void addWait() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
}