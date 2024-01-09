package com.vtiger.genericlib;

import org.testng.annotations.Test;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderfetchdata {
	Object[][] obj;
	DataFormatter df ;
	@DataProvider(name="product")
	public Object[][] promuldata() throws Throwable{
		df = new DataFormatter();
		FileInputStream fis= new FileInputStream(IConstant.Excelpath);
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet3");
	    int lastRow = sh.getLastRowNum();
	    obj= new Object[lastRow][3];
	    for(int i=1;i<=lastRow;i++)
	    {
	    	for(int j=0;j<3;j++){
	    		obj[i-1][j]=df.formatCellValue(sh.getRow(i).getCell(j));
	    	}
	    }
	    return obj;
		
	}
	@Test(dataProvider = "product")
	public void m1(String s1,String s2,String s3)
	{
		System.out.println(s1+" "+s2+" "+s3);
	}

}
