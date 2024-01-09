package com.vtiger.producttestcase;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.ExcelUtility;
import com.vtiger.genericlib.IConstant;
import com.vtiger.genericlib.JavaUtility;
import com.vtiger.homepage.homepage;
import com.vtiger.productpages.createnewproductpages;
import com.vtiger.productpages.productmodulepages;

public class ProductNameAssert extends BaseClass {
	
	@Test
	public void  m1()
	{
		eu= new ExcelUtility();
	    ju= new JavaUtility();
	    cnp = new createnewproductpages(Driver.driver);
		pmp= new productmodulepages(Driver.driver);
		hp = new homepage(Driver.driver);
		hp.getProductsbtn().click();
		pmp.getPlusbtn().click();
		int num = ju.generateRandom(1000);
		cnp.getCreateproname().sendKeys(eu.FetchSingledatafromExcel(IConstant.Excelpath,"CreateProduct" , 1, 3)+num);
		cnp.getSavebtn().click();
		String actdata = Driver.driver.findElement(By.className("lvtHeaderText")).getText();
		System.out.println(actdata);
		String expdata="Television"+num+" - Product Information";
		Assert.assertTrue(actdata.contains(expdata),"product is not created");
		Reporter.log("new product is created",true);
		
	}

}
