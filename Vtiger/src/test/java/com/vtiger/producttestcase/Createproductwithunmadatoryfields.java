package com.vtiger.producttestcase;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.ExcelUtility;
import com.vtiger.genericlib.IConstant;
import com.vtiger.genericlib.JavaUtility;
import com.vtiger.homepage.homepage;
import com.vtiger.productpages.createnewproductpages;
import com.vtiger.productpages.productmodulepages;
@Listeners(com.vtiger.genericlib.Listner.class)
public class Createproductwithunmadatoryfields extends BaseClass {
	@Test
	public void m2() 
	{
	eu= new ExcelUtility();
    ju= new JavaUtility();
	cnp = new createnewproductpages(Driver.getDriver());
	pmp= new productmodulepages(Driver.getDriver());
	hp = new homepage(Driver.getDriver());
	hp.getProductsbtn().click();
	pmp.getPlusbtn().click();
	String testdata=eu.FetchSingledatafromExcel(IConstant.Excelpath, "CreateProduct", 1, 3)+ju.generateRandom(100);
	cnp.getCreateproname().sendKeys(testdata);
	String testdata1=eu.FetchSingledatafromExcel(IConstant.Excelpath,"CreateProduct", 4, 4)+ju.generateRandom(100);
	cnp.getPartNumber().sendKeys(testdata1);
	cnp.getSavebtn().click();
	
	
	}
	

}
