package com.vtiger.producttestcase;


import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.homepage.homepage;
import com.vtiger.productpages.Exportproduct;


	
public class ExporttheProduct extends BaseClass{
	@Test
	public void m6()
	{
		hp = new homepage(Driver.getDriver());
		ep = new Exportproduct(Driver.getDriver());
		hp.getProductsbtn().click();
		ep.getExportimg().click();
		ep.getExpprobtn().click();
	}

}
