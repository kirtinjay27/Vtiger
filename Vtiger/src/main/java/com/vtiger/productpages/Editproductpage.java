package com.vtiger.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Editproductpage {
	@FindBy(xpath = "//tr[@id='row_56']/td[9]/a[1]")
	private WebElement editbtn;
	
	public Editproductpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getEditbtn() {
		return editbtn;
	}

}
