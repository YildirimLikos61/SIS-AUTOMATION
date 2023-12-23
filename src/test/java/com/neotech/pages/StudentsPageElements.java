package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class StudentsPageElements {

	
	
	@FindBy(xpath="//*[@id=\"form1\"]/script[12]/following-sibling::table//td[@background=\"../../Common/themes/Blue/mBg.jpg\"]")
	public List<WebElement> listoftabs;
	
	@FindBy(xpath="//input[@id='bAdd']")
	public WebElement addnew;
	
	
	public StudentsPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
