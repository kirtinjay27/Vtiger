package com.vtiger.productpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exportproduct {
	@FindBy(xpath = "//a[@name='export_link']/img")
	private WebElement exportimg;
	
    @FindBy(css = "input.crmbutton.small.create")
    private WebElement expprobtn;
    
    public Exportproduct(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }

	public WebElement getExportimg() {
		return exportimg;
	}

	public WebElement getExpprobtn() {
		return expprobtn;
	}
   
}

