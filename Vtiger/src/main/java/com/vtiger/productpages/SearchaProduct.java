package com.vtiger.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchaProduct {
	@FindBy(xpath = "//select[@name='search_field']")
	private WebElement Indropdown;
	
	@FindBy(xpath = "//div[@id='searchAcc']/form/table/tbody/tr/td[3]/input")
	private WebElement searchbar;
	
	@FindBy(name="submit")
	private WebElement searchbtn;
	
	public SearchaProduct(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getIndropdown() {
		return Indropdown;
	}

	

	public WebElement getSearchbar() {
		return searchbar;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}
	
	

}
