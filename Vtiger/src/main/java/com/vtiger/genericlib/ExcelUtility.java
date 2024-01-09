package com.vtiger.genericlib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

/**
 * This class is used to fetch the data from excel
 */
public final class ExcelUtility {
	FileInputStream fis;
	Workbook book;
	DataFormatter df;
	
	public  String FetchSingledatafromExcel(String path,String shName,int row,int cell) 
	
	{
		df= new DataFormatter();
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return df.formatCellValue(book.getSheet(shName).getRow(row).getCell(cell));
	}
	
	public List<Object> FetchdatainRowwise(String path,String SheetName)
	{
		List<Object> mulrowdata=new ArrayList<Object>();
		df=new DataFormatter();
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sh = book.getSheet(SheetName);
		for(int i=0;i<FetchlastRow(path, SheetName);i++)
		{
			String data =df.formatCellValue(sh.getRow(i).getCell(0));
			mulrowdata.add(data);
		}
		return mulrowdata;
		
		
	}
	public void FetchdatainCellWise()
	{
		
	}
	
	
	public int FetchlastRow(String path,String SheetName)
	{
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sh = book.getSheet(SheetName);
		int lastRow=sh.getLastRowNum();
		return lastRow;
		
		
	}
	public void FetchlasCell()
	{
		
	}

}
