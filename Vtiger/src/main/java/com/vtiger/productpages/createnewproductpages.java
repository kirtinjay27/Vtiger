package com.vtiger.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createnewproductpages {
	@FindBy(name = "productname")
	private WebElement createproname;
	
	@FindBy(id="productcod")
	private WebElement partNumber;
	
	
	
	@FindBy(css = "input.crmbutton.small.save")
	private WebElement savebtn;
	
	public createnewproductpages(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreateproname() {
		return createproname;
	}

	public WebElement getSavebtn() {
		return savebtn;
	}

	public WebElement getPartNumber() {
		return partNumber;
	}


	

	




	
	

}
