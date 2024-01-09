package com.vtiger.producttestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.ExcelUtility;
import com.vtiger.genericlib.IConstant;
import com.vtiger.genericlib.WebDriverUtility;
import com.vtiger.homepage.homepage;
import com.vtiger.productpages.SearchaProduct;

public class SearchaParticularProduct extends BaseClass {
	@Test
	public void m7() throws InterruptedException
	{
		wu= new WebDriverUtility();
		eu= new ExcelUtility();
		hp = new homepage(Driver.getDriver());
		sp= new SearchaProduct(Driver.getDriver());
		
		hp.getProductsbtn().click();
		sp.getIndropdown().click();
		wu.handleDropdown(sp.getIndropdown(), "productcode");
	    System.out.println("33333333");
		sp.getSearchbar().click();
		sp.getSearchbar().sendKeys(eu.FetchSingledatafromExcel(IConstant.Excelpath, "Sheet1", 1, 1));
		sp.getSearchbtn().click();
		
	}
	}
	