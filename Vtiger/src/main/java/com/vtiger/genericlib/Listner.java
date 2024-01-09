package com.vtiger.genericlib;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Protocol;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.vtiger.driver.Driver;


public class Listner implements ITestListener {

     ExtentSparkReporter esp;
     ExtentTest test;
     ExtentReports er;
     JavaUtility ju;
     WebDriverUtility wu;
	 
	@Override
	public void onTestStart(ITestResult result) {
		String methname =result.getName();
		Reporter.log(methname+"Test case Started",true);
		test = er.createTest(methname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methname =result.getName();
		Reporter.log(methname+"Test case Executed",true);
		test.log(Status.PASS, "Test case Executed"+methname);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ju= new JavaUtility();
		wu = new WebDriverUtility();
		
		String methname =result.getName();
		Reporter.log(methname+"Test case Failed",true);
		String dateTime=ju.generateDateTimeFormate()+methname+".png";
		String path1 = IConstant.ScreenShotpath1+dateTime;
		
		String dirPath=System.getProperty("user.dir")+path1;
		test.log(Status.FAIL, "Test case Failed"+methname);
		
		try {
			wu.captureScreenShot(Driver.getDriver(),path1);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromBase64String(dirPath);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String methname =result.getName();
		Reporter.log(methname+"Test case Skipped",true);
		test.log(Status.SKIP, "Test case Skipped"+methname);
	}

	@Override
	public void onStart(ITestContext context) {
		ju = new JavaUtility();
		
		esp = new ExtentSparkReporter(IConstant.Reportpath+ju.generateDateTimeFormate()+".html");
		esp.config().setDocumentTitle("Vtiger Regression testing");
		esp.config().setReportName("Kirtinjay");
		esp.config().setProtocol(Protocol.HTTPS);
		esp.config().setTheme(Theme.DARK);
		
		er = new ExtentReports();
		er.attachReporter(esp);
		
		er.setSystemInfo("OS","Windows");
		er.setSystemInfo("version", "11");
		er.setSystemInfo("Bites","64");
		er.setSystemInfo("Graphics","i5");
		
		
		
		String methname =context.getName();
		Reporter.log(methname+"Project started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		String methname =context.getName();
		Reporter.log(methname+"Project Finished",true);
		er.flush();
	}
	

}
