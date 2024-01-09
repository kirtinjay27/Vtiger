package com.vtiger.producttestcase;

import org.testng.annotations.Test;
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

public class createnewProducttestcaseTest extends BaseClass{
	@Test
	public void m1() 
	{
		
		    eu= new ExcelUtility();
		    ju= new JavaUtility();
			cnp = new createnewproductpages(Driver.driver);
			pmp= new productmodulepages(Driver.driver);
			hp = new homepage(Driver.driver);
			hp.getProductsbtn().click();
			pmp.getPlusbtn().click();
			String testdata = eu.FetchSingledatafromExcel(IConstant.Excelpath,"CreateProduct", 1, 3)+ju.generateRandom(1000);
			System.out.println("+++++++++++++++++++"+testdata);
			cnp.getCreateproname().sendKeys(testdata);
			cnp.getSavebtn().click();
			
		
	}
}
