package com.vtiger.producttestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.ExcelUtility;
import com.vtiger.genericlib.JavaUtility;
import com.vtiger.genericlib.WebDriverUtility;
import com.vtiger.homepage.homepage;
import com.vtiger.productpages.createnewproductpages;
import com.vtiger.productpages.productmodulepages;

@Listeners(com.vtiger.genericlib.Listner.class)

public class CreateNewProductwithEmptyDetailsTest extends BaseClass {
	@Test
	public void m4()
	{
		wu= new WebDriverUtility();
		eu= new ExcelUtility();
	    ju= new JavaUtility();
		cnp = new createnewproductpages(Driver.driver);
		pmp= new productmodulepages(Driver.driver);
		hp = new homepage(Driver.driver);
		hp.getProductsbtn().click();
		pmp.getPlusbtn().click();
		cnp.getSavebtn().click();
		wu.acceptalert(Driver.driver);
	}

}
