package com.vtiger.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddInvoice {
	@FindBy(xpath="//a[text()='Create Invoice']")
	private WebElement invoicebtn;
	
	@FindBy(name  ="subject")
	private WebElement mandatorydetails;
	
	@FindBy(css = "input.crmbutton.small.save")
	private WebElement savebutton;
	
	public AddInvoice(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getInvoicebtn() {
		return invoicebtn;
	}

	public WebElement getMandatorydetails() {
		return mandatorydetails;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}
	

}
