package com.vtiger.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuplicateExistingProduct {
	@FindBy(xpath = "//a[text()='Products']")
	private WebElement productbtn;
	
	@FindBy(xpath = "//td[@id='alpha_12']")

	private WebElement aplhaletter;
	
	/*@FindBy(linkText = "LAPTOPS")
	private WebElement productnames;*/
	
	@FindBy(xpath = "//table[@class='lvt small']/tbody/tr[5]/td[3]/a")
	private WebElement productname;
	
	@FindBy(css = "input.crmbutton.small.create")
	private WebElement duplipro;
	
	@FindBy(css = "input.crmbutton.small.save")
	private WebElement savedupli;
	
	
	public DuplicateExistingProduct(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

	public WebElement getProductname() {
		return productname;
	}

	public WebElement getDuplipro() {
		return duplipro;
	}
	/*public WebElement getProductnames() {
		return productnames;
	}*/



	public WebElement getSavedupli() {
		return savedupli;
	}



	public WebElement getProductbtn() {
		return productbtn;
	}



	public WebElement getAplhaletter() {
		return aplhaletter;
	}
	

	
	

}
