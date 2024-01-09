package com.vtiger.producttestcase;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.aventstack.extentreports.model.Report;
import com.vtiger.driver.Driver;
import com.vtiger.genericlib.BaseClass;
import com.vtiger.genericlib.ExcelUtility;
import com.vtiger.genericlib.IConstant;
import com.vtiger.genericlib.JavaUtility;
import com.vtiger.homepage.homepage;
import com.vtiger.productpages.EditdetailsOfProduct;
import com.vtiger.productpages.Editproductpage;
import com.vtiger.productpages.createnewproductpages;
import com.vtiger.productpages.productmodulepages;

public class EditExistingProduct extends BaseClass {
	@Test(groups = "RegressionSuite")
	public void m9()
	{
		    eu= new ExcelUtility();
		    ju= new JavaUtility();
		    epp = new Editproductpage(Driver.driver);
		    eop= new EditdetailsOfProduct(Driver.driver);
			cnp = new createnewproductpages(Driver.driver);
			pmp= new productmodulepages(Driver.driver);
			hp = new homepage(Driver.driver);
			hp.getProductsbtn().click();
			epp.getEditbtn().click();
			eop.getProducttextbox().clear();
			eop.getProducttextbox().sendKeys(eu.FetchSingledatafromExcel(IConstant.Excelpath,"Sheet1", 1, 1));
			eop.getSavebtn().click();
			
	}
	
	@Test
	public void m1()
	{
		Reporter.log("m1 executed",true);
	}

}
