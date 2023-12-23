package com.neotech.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.testbase.PageInitializer;

public class CommonMethods extends PageInitializer{

	
	public static void sendKeys(WebElement el,String key) 
	{
		el.clear();
		el.sendKeys(key);
	}
	
	
	
	public static void clickRadioOrCheckBox(List<WebElement> list,String value) 
	{
		for(WebElement el:list) 
		{
			String value1=el.getAttribute("value").trim();
			if(value1.equals(value)&& el.isEnabled()) 
			{
				el.click();
				break;
			}
		}
	}
	
	
	
	public static void acceptAlert() 
	{
		try 
		{
		Alert alert=driver.switchTo().alert();
		alert.accept();
		}catch(NoAlertPresentException a)
		{
			a.printStackTrace();
		}
	}
	
	
	
	public static void dissmisAlert() 
	{
		try 
		{
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		}catch(NoAlertPresentException a)
		{
			a.printStackTrace();
		}
	}
	
	
	
	
	public static void sendAlertText(String text) 
	{
		try 
		{
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(text);
		}catch(NoAlertPresentException a)
		{
			a.printStackTrace();
		}
	}
	
	public static String getAlertText() 
	{
		String text=null;
		try 
		{
		Alert alert=driver.switchTo().alert();
		text=alert.getText();
		}catch(NoAlertPresentException a)
		{
			a.printStackTrace();
		}
		return text;
	}
	
	
	public static void switchToFrame(int index) 
	{
		try 
		{
		 driver.switchTo().frame(index);
		}catch(NoSuchFrameException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void switchToFrame(String nameOrId) 
	{
		try 
		{
		 driver.switchTo().frame(nameOrId);
		}catch(NoSuchFrameException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void switchToFrame(WebElement el) 
	{
		try 
		{
		 driver.switchTo().frame(el);
		}catch(NoSuchFrameException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void switchToWindow() 
	{
		Set<String> set=driver.getWindowHandles();	
		Iterator<String> it=set.iterator();
		String wind1=it.next();
		String wind2=it.next();
		
		driver.switchTo().window(wind2);
		
	}
	
	
	
	public static WebDriverWait getWaitObject() 
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(Constants.EXPLICIT_WAIT_TIME));
		return wait;
	}
	
	
	public static WebElement waitForVisibility(WebElement el) 
	{
		return getWaitObject().until(ExpectedConditions.visibilityOf(el));
	}
	
	
	public static WebElement waitForClickability(WebElement el) 
	{
		return getWaitObject().until(ExpectedConditions.elementToBeClickable(el));
	}
	
	
	public static void click(WebElement el) 
	{
		waitForVisibility(el);
		el.click();
	}
	
	
	public static void wait(int index) 
	{
		try {
			Thread.sleep(1000*index);
		} catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
	}
	
	
	public static void selectDropDown(WebElement el,int index) 
	{
		try 
		{
		  Select sel=new Select(el);
		  sel.selectByIndex(index);
		}catch(Exception e)
		{
		 e.printStackTrace();
		}
	}
	
	public static void selectDropDown(WebElement el,String visibleText) 
	{
		try 
		{
		  Select sel=new Select(el);
		  sel.selectByVisibleText(visibleText);
		}catch(Exception e)
		{
		 e.printStackTrace();
		}
	}
	
	
	
	public static JavascriptExecutor getJSObject() 
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		return js;
	}
	
	public static void jsClick(WebElement el)
	{
		getJSObject().executeScript("arguments[0].click()",el);
	}
	
	
	
	public static byte[] takeScreenshot(String path) 
	{
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		
		String destination=Constants.SCREENSHOT_PATH+path+getStampTime()+".png";
		
		File f=ss.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(f, new File(destination));
		} catch (IOException e) 
		{
			
			e.printStackTrace();
		}
		
		byte[] picture;
		
		picture =ss.getScreenshotAs(OutputType.BYTES);
		
		return picture;
	}
	
	
	
	public static String getStampTime() 
	{
		Date d=new Date();
		SimpleDateFormat f=new SimpleDateFormat("dd_mm_yyyy_ss_mm_hh");
		return f.format(d);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
