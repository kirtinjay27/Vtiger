package com.vtiger.producttestcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.WebDriverUtility;
import com.vtiger.homepage.homepage;
import com.vtiger.productpages.DeletetheExistingProduct;

public class Deleteproduct extends BaseClass {
	@Test(groups = "smokeSuite")
	public void m3() throws Throwable
	{
		wu= new WebDriverUtility();
		de = new DeletetheExistingProduct(Driver.driver);
		hp = new homepage(Driver.driver);
		hp.getProductsbtn().click();
		de.getSelectalpha().click();
		de.getProductname().click();
		Thread.sleep(3000);
		de.getDeletebtn().click();
		wu.acceptalert(Driver.driver);
		
	}

}
