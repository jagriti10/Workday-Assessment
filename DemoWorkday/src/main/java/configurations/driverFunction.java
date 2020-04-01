package configurations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class driverFunction {

	private WebDriver driver;

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
	
	public void doubleClick(WebElement ele) {
		try {
			Actions action = new Actions(driver).doubleClick(ele);
			action.build().perform();
			System.out.println("Double clicked the element");}
		catch(Exception e) {
			System.out.print(e.getMessage());
		}
		}
		
	public void addWait() {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
}