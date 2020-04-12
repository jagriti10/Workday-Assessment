package configurations;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestCases.testBase;

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
	public void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void exeClick(WebElement ele ) {
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);	
	}

	public String exeText() {
		WebElement user=driver.findElement(By.xpath("//h1[@class='workdayHome-j']"));
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		String text = (String) js.executeScript("return arguments[0].text;",user);
		System.out.println(text);
		return text;
	}
	

	public String currentDate() {
		DateFormat dateFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date =new Date();
		return dateFormat.format(date);
	}

	public String captureScreenshot(WebDriver driver) {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String fileName = "";
		try {
			// now copy the screenshot to desired location using copyFile //method
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH_mm_ss");
			String stringDate = dateFormat.format(new Date());
			String saveLocation =testBase.reportPath + ".png";
			fileName =saveLocation.replace(System.getProperty("user.dir") + File.separator + File.separator,"");
			FileUtils.copyFile(src, new File(saveLocation));

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return fileName;
	}
}