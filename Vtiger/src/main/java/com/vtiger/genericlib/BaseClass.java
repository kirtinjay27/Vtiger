package com.vtiger.genericlib;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.vtiger.driver.Driver;
import com.vtiger.homepage.homepage;
import com.vtiger.loginpages.LoginandLogoutpages;
import com.vtiger.productpages.AddInvoice;
import com.vtiger.productpages.DeletetheExistingProduct;
import com.vtiger.productpages.DuplicateExistingProduct;
import com.vtiger.productpages.EditdetailsOfProduct;
import com.vtiger.productpages.Editproductpage;
import com.vtiger.productpages.Exportproduct;
import com.vtiger.productpages.SearchaProduct;
import com.vtiger.productpages.createnewproductpages;
import com.vtiger.productpages.productmodulepages;

import Demo.Launchbrower;

public class BaseClass {
	protected static WebDriverUtility wu;
	protected static PropertyUtility pu;
	protected static JavaUtility ju;
	protected static ExcelUtility eu;
	protected static createnewproductpages cnp;
	protected static homepage hp;
	protected static productmodulepages pmp;
	protected static LoginandLogoutpages lp;
	protected static DeletetheExistingProduct de;
	protected static DuplicateExistingProduct dp;
	protected static Exportproduct ep;
	protected static SearchaProduct sp;
	protected static AddInvoice ai;
	protected static EditdetailsOfProduct eop;
	protected static Editproductpage epp;
	
	@BeforeSuite //(groups = {"smokeSuite" ,"RegressionSuite"})
	public void ConnectJDBC()
	{
		Reporter.log("JDBC Connected",true);
		
	}
	//@Parameters("browser")
	@BeforeClass //(groups = {"smokeSuite", "RegressionSuite"})
	public void setup() throws Throwable
	{
		Driver.setdriver("chrome");
		wu = new WebDriverUtility();
		pu= new PropertyUtility();
		wu.maximizeWindow(Driver.getDriver());
		wu.addImplicitlyWait(Driver.getDriver());
		wu.openApp(pu.fetchPropertyfile(IConstant.VtigerLogin, "url"), Driver.getDriver());
	}
	@BeforeMethod //(groups = {"smokeSuite", "RegressionSuite"})
	public void login() throws Throwable 
	{
		pu= new PropertyUtility();
		lp=new LoginandLogoutpages(Driver.getDriver());
		lp.createloginpage();
		
		
	}
	
	@AfterMethod //(groups = {"smokeSuite", "RegressionSuite"})
	public void logout()
	{
		wu = new WebDriverUtility();
		lp=new LoginandLogoutpages(Driver.getDriver());
		lp.logoutVtiger();
		
		
	}
	@AfterClass  //(groups = {"smokeSuite", "RegressionSuite"})
	public void tearup()
	{
		Driver.getDriver().quit();
	}
	
	@AfterSuite //(groups = {"smokeSuite", "RegressionSuite"})
	public void disconnectJDBC()
	{
		Reporter.log("Disconnect JDBC",true);
	}

}
