package TestCases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

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

	public ExtentHtmlReporter html;
	public static ExtentReports report;
	public static ExtentTest classtest;
	public static ExtentTest test;
	public static String reportPath;

	public static driverFunction getdriverFunction() {
		return driverFunc;
	}

	private void setdriverFunction(driverFunction driverFunc) {
		testBase.driverFunc = driverFunc;
	}

	@BeforeSuite
	public void setUp() {
		String currentDirectory = System.getProperty("user.dir");
		SimpleDateFormat formatter = new SimpleDateFormat("MM_dd_yyyy(HH_mm_ss)");
		reportPath=currentDirectory+"/"+formatter.format(new Date());
		Path p = Paths.get(reportPath);
		try {
			Files.createDirectories(p);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		html = new ExtentHtmlReporter(reportPath+"/"+"Workday-report.html");
		report = new ExtentReports();
		report.attachReporter(html);


	}
	@BeforeMethod
	public void beforMethod(Method method) {
		test=classtest.createNode(method.getName());
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
		classtest=report.createTest(getClass().getName());
		classtest.log(Status.INFO,"inside before test");  	 	
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {
		if(result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, result.getMethod().getMethodName()+"has failed");
			String pa = driverFunc.captureScreenshot(s.getDriver());
			classtest.fail(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(pa).build());
		}
		if(result.getStatus() == ITestResult.SUCCESS) {
			test.log(Status.PASS, result.getMethod().getMethodName()+"has passed");
		}
		if(result.getStatus() == ITestResult.SKIP) {
			test.log(Status.SKIP, result.getMethod().getMethodName()+"has skipped");
		}
	}

@AfterTest
public void afterTest() {
	report.flush();
	s.getDriver().quit();
}

}
