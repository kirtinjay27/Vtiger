package com.vtiger.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditdetailsOfProduct {
	@FindBy(name = "productname")
	private WebElement producttextbox;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebtn;
	
	
	public EditdetailsOfProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getProducttextbox() {
		return producttextbox;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

}
