package com.vtiger.producttestcase;

 import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.ExcelUtility;
import com.vtiger.genericlib.IConstant;
import com.vtiger.genericlib.WebDriverUtility;
import com.vtiger.homepage.homepage;
import com.vtiger.productpages.AddInvoice;
import com.vtiger.productpages.DuplicateExistingProduct;

public class AddInvoiceToProductTest extends BaseClass{
	@Test
	public void m8() throws InterruptedException
	{
		wu = new WebDriverUtility();
		ai = new AddInvoice(Driver.driver);
		eu = new ExcelUtility();
		hp= new homepage(Driver.driver);
		dp = new DuplicateExistingProduct(Driver.driver);
		
		hp.getProductsbtn().click();
		dp.getAplhaletter().click();
		dp.getProductname().click();
		ai.getInvoicebtn().click();
		Thread.sleep(3000);
		String data = eu.FetchSingledatafromExcel(IConstant.Excelpath,"Sheet2", 1, 1);
		ai.getMandatorydetails().sendKeys(data);
		ai.getSavebutton().click();
		wu.acceptalert(Driver.driver);
		
	}

}
