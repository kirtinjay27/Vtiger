package com.vtiger.genericlib;

import java.awt.Dimension;
import java.awt.Point;
import java.io.File;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class WebDriverUtility {
	
	
	/**
	 * This method will maximize the window
	 * @param driver
	 */

	public void maximizeWindow(WebDriver driver)
			{
				driver.manage().window().maximize();
			}
	
	/**
	 * This method will Minimize the window
	 * @param driver
	 */
	
	public void minimiseWindow(WebDriver driver)
	{
		driver.manage().window().minimize();
	}
	
	
	
	/**
	 * This method is use to launch the browser in fullScreen mode
	 * @param driver
	 */
	
	public void fullScreenWindow(WebDriver driver)
	{
		driver.manage().window().fullscreen();
	}
	
	/**
	 * This method is used to set the size of the webbrowser.
	 * @param driver
	 * @param w
	 * @param h
	 */
	
	public void resizethebrower(WebDriver driver, int w,int h)
	{
		Dimension d = new Dimension(w,h);
		driver.manage().window().setSize(null);
	}
	/**
	 * This method is used to set the starting point of the brower
	 * @param driver
	 */
	public void startingpointofbrower(WebDriver driver)
	{
		Point p = new Point();
		driver.manage().window().setPosition(null);
	}
	
	/**
	 *  driver It is variable which will initilised with BaseClass WebDriver refernce Variable
	 *  This method is used to perform location action
	 *  And By using this we can write the data in WebPage
	 * @param driver
	 * @param b
	 * @return
	 */
	public String XpathActionToFetchData(WebDriver driver, By b)
	{
		return driver.findElement(b).getText();
	}
	/**
	 * This method is used to click on the particular element to perform one particular action
	 * @param driver
	 * @param b
	 */
	public void XpathActionToClick(WebDriver driver,By b)
	{
		driver.findElement(b).click();
	}
	/**
	 * This method is used to get the attribute value by using attribute name
	 * @param driver
	 * @param b
	 * @return
	 */
	
	public String XpathActionTogetthetext(WebDriver driver,By b)
	{
		return driver.findElement(b).getText();
	}
	
	/**
	 * This method is use to handle the hover message on a webpage
	 * @param ele
	 * @param an
	 * @return
	 */
	public String Hovermessage(WebElement ele,String an)
	{
		return ele.getAttribute(an);
	}
	/**
	 * This method is used to validate the checkbox is selected or not
	 * @param ele
	 * @return
	 */
	public boolean Validation(WebElement ele)
	{
		return ele.isSelected();
	}
	/**
	 * This method is used to validate the message is displayed in the webpage
 	 * @param ele
	 * @return
	 */
	
	public boolean validation1(WebElement ele)
	{
		return ele.isDisplayed();
	}
	
	/**
	 * This method is used to validate whether the html attribute is enabled or disabled
	 * @param ele
	 * @return
	 */
	public Boolean validation2(WebElement ele)
	{
		return ele.isEnabled();
	}
	
	/**
	 * This method is use to add the wait which will work through out the project
	 * @param driver
	 */
	
	
	public void addImplicitlyWait(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/**
	 * This method is use to add the wait which will work whenever synchronization issue arises
	 * @param driver
	 * @param element
	 */
	
	
	public void addExplicitWait(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	/**
	 * This method is used to wait for the element to be clickable in the webpage
	 * @param driver
	 * @param element
	 */
	
	public void waitForElementTobeClickable(WebDriver driver,WebElement element)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	
	}
	
	
	/**
	 * This method is use to handle the dropdown of a webpage based on index.
	 * @param element
	 * @param index
	 */
	
	public void handleDropdown(WebElement element,int index)
	{
		Select s= new Select(element);
		s.selectByIndex(index);
		
	}
	
	/**
	 * This method is use to handle the dropdown of a webpage based on value. 
	 * @param element
	 * @param value
	 */
	public void handleDropdown(WebElement element,String value)
	{
		Select s= new Select(element);
		s.selectByValue(value);
	}
	
	/**
	 * This method is use to handle the dropdown of a webpage based on visibleText
	 * @param text
	 * @param element
	 */
	public void handleDropdown(String text,WebElement element)
	{
		Select s= new Select(element);
		s.selectByVisibleText(text);
	}
	
	/**
	 * This method is used to perform mouse Handling and specifically move your cursor scenarios
	 * @param driver
	 * @param element
	 */
	
	public void moveyourcursor(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.moveToElement(element).perform();
	}
	/**
	 * This method is used to perform mouse Handling and specifically double click scenarios
	 * @param driver
	 * @param element
	 */
	
	public void doubleaction(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.doubleClick(element).perform();
	}
	/**
	 * This method is used to perform mouse Handling and specifically Right click scenarios
	 * @param driver
	 * @param element
	 */
	public void rightclickaction(WebDriver driver, WebElement element)
	{
		Actions act= new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This method is used to perform mouse Handling and specifically Drag and drop scenarios
	 * @param driver
	 * @param srcEle
	 * @param distEle
	 */
	public void draganddropaction(WebDriver driver,WebElement srcEle,WebElement distEle)
	{
		Actions act= new Actions(driver);
		act.dragAndDrop(srcEle, distEle).perform();
	}
	
	/**
	 * This method is used to scroll up and down in a webpage
	 * @param driver
	 */
	public void scrollingAction(WebDriver driver)
	{
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("Window.scrollBy(0,500))", "");
		
	}
	/**
	 * This method is used to move to particular element in a webpage
	 * @param driver
	 * @param element
	 */
	public void scrolling(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("Argument[0]Scrollintoview(true)",element);
		
	}
	
	/**
	 * This method is used to handle the frames based on index
	 * @param driver
	 * @param frameindex
	 */
	
	public void frameHandling(WebDriver driver,int frameindex)
	{
		driver.switchTo().frame(frameindex);
	}
	/**
	 * This method is used to handle the frames based on element
	 * @param driver
	 * @param frameele
	 */
	
	public void frameHandling(WebDriver driver,WebElement frameele)
	{
		driver.switchTo().frame(frameele);
	}
	/**
	 * This method is used to handle the frames based on String
	 * @param driver
	 * @param framenameID
	 */
	
	public void frameHandling(WebDriver driver,String framenameID)
	{
		driver.switchTo().frame(framenameID);
	}
	/**
	 * This method is used to click on OK in the popups
	 * @param driver
	 */
	
	public void acceptalert(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method is used to click on cancel in the popups
	 * @param driver
	 */
	public void dismissalert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	/**
	 * This method is used to fetch the message  from the popups
	 * @param driver
	 * @return
	 */
	public String getText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	/**
	 * This method is used to get the screenshot , where the test case is getting failed
	 * @param driver
	 * @param screenshotname
	 * @return
	 * @throws Throwable
	 */
	
	public String captureScreenShot(WebDriver driver,String screenshotname) throws Throwable
	{
		TakesScreenshot sh= (TakesScreenshot) driver;
		File src = sh.getScreenshotAs(OutputType.FILE);//temporary location
		File dist = new File(".\\ScreenShots\\"+screenshotname+".png");
		FileUtils.copyFile(src, dist);
		
		
		return dist.getAbsolutePath();
	}
	/**
	 * This method is use to handle the windows of the brower
	 * @param driver
	 * @param expectedPartialTitle
	 */
	
	public void handleWindows(WebDriver driver,String expectedPartialTitle)
	{
		//capture all window id
		Set<String> allid = driver.getWindowHandles();
		
		//navigate through each window id
		for(String windId:allid)
		{
			//switch to each window id and fetch the title
			String actTitle = driver.switchTo().window(windId).getTitle();
			
			//Compare the window title
			if(actTitle.contains(expectedPartialTitle));
			{
				break;
			}
		}
	
	
	
	}
	public void openApp(String data,WebDriver driver)
	{
		driver.get(data);
	}
}
