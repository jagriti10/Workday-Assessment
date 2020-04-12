package ExtentReport;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import configurations.driverFunction;
import configurations.startDriver;

public class ExtentReportsClass {
	
	driverFunction driverFunc;
	startDriver s;
	public static ExtentReports report;
	public static String reportPath;
	public static ExtentTest logger;
	public static ExtentSparkReporter extent;


	@BeforeSuite
	public void beforesuite() {

		Reporter.log("in the before suite", true);
		extent = new ExtentSparkReporter(new File(System.getProperty("user.dir")+driverFunc.currentDate()+".html"));
		report = new ExtentReports();
		report.attachReporter(extent);

	}
	@AfterMethod
	public void aftermethod(ITestResult result) throws IOException {
		String pa = driverFunc.captureScreenshot(s.getDriver());
		if(result.getStatus()==ITestResult.SUCCESS) {		
			logger.pass("Passed",MediaEntityBuilder.createScreenCaptureFromPath(pa).build());
			logger.info("Info");
		}
		else if(result.getStatus()==ITestResult.FAILURE) {			
			logger.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(pa).build());

		}
		else if(result.getStatus()==ITestResult.SKIP) {			
			logger.skip("Skipped",MediaEntityBuilder.createScreenCaptureFromPath(pa).build());
		}
		report.flush();
		Reporter.log("Report generated with screenshot", true);
	}




}
