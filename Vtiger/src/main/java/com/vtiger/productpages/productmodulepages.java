package com.vtiger.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productmodulepages {
	@FindBy(xpath = "//img[@title='Create Product...']")
	private WebElement plusbtn;
	
	public productmodulepages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}
	
	

}
