package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class StudentLoginPageElements {

	@FindBy(xpath="//span[@id='lStudentID']")
	public WebElement studentId;
	
	@FindBy(xpath="//span[@id='lStdName']")
	public WebElement studentName;
	
	@FindBy(xpath="//span[@id='lGrdSec']")
	public WebElement studentGrade;
	
	@FindBy(xpath="//span[@id='lUserName']")
	public WebElement studentUserName;
	
	
	public StudentLoginPageElements()
	{
	 PageFactory.initElements(BaseClass.driver, this);	
	}
	
	
	
	
	
	
}
