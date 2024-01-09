package com.vtiger.producttestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;

import com.vtiger.homepage.homepage;
import com.vtiger.productpages.DuplicateExistingProduct;


public class CreateDuplicateProductTest extends BaseClass {
	@Test
	public void m5() throws Throwable 
	{
		hp = new homepage(Driver.driver);
		dp= new DuplicateExistingProduct(Driver.driver);
		
		hp.getProductsbtn().click();
		dp.getAplhaletter().click();
		dp.getProductname().click();
		dp.getDuplipro().click();
		dp.getSavedupli().click();
		
	}

}
