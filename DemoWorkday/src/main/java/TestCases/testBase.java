package TestCases;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import PageFunctions.addComment;
import PageFunctions.mainPage;
import PageFunctions.personalInfo;
import PageFunctions.rememberDevice;
import PageFunctions.signIn;
import configurations.driverFunction;
import configurations.loadProp;
import configurations.startDriver;

public class testBase {
	startDriver s;
	protected addComment ac;
	protected rememberDevice rm;
	protected mainPage mp;
	protected personalInfo pi;
	protected signIn si;
	static driverFunction driverFunc;
	
	
	public static driverFunction getdriverFunction() {
		return driverFunc;
	}

	private void setdriverFunction(driverFunction driverFunc) {
		testBase.driverFunc = driverFunc;
	}

	
	@BeforeTest
	public void beforeTest() {
		try {
			loadProp.loadProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String browser = loadProp.getProp().getProperty("browser");
		s = new startDriver();
		s.startDriver(browser);
		s.getDriver();
		driverFunction driverFunc = new driverFunction(s.getDriver());
		setdriverFunction(driverFunc);
		si= new signIn(s.getDriver());
	}
	

	@AfterTest
	public void afterTest() {
		s.getDriver().quit();
	}
	



}
