package com.vtiger.loginpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.IConstant;
import com.vtiger.genericlib.PropertyUtility;
import com.vtiger.genericlib.WebDriverUtility;

public class LoginandLogoutpages extends BaseClass {
	@FindBy(name="user_name")
	private WebElement untab;
	
	@FindBy(name="user_password")
	private WebElement pwdtab;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//td[@class='genHeaderSmall']/following-sibling::td/img")
	private WebElement adminimage;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement Signout;
	
  
	

	public WebElement getAdminimage() {
		return adminimage;
	}

	
	


	public WebElement getSignout() {
		return Signout;
	}





	public LoginandLogoutpages(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public WebElement getUntab() {
		return untab;
	}

	public WebElement getPwdtab() {
		return pwdtab;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	//business libraries
	
	public void createloginpage() throws Throwable
	{
		pu= new PropertyUtility();
		getUntab().sendKeys(pu.fetchPropertyfile(IConstant.VtigerLogin, "un"));
		getPwdtab().sendKeys(pu.fetchPropertyfile(IConstant.VtigerLogin, "pwd"));
		getLoginbtn().click();
		
	}
	
	public void logoutVtiger()
	{
		wu = new WebDriverUtility();
		wu.moveyourcursor(Driver.driver,getAdminimage());
		getSignout().click();
	}
	
	
	
	

}
