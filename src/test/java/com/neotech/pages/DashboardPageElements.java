package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class DashboardPageElements {

	@FindBy(xpath="//img[@id='Header1_imgSchoolLogo']")
	public WebElement logo;
	
	@FindBy(xpath="//table[@id='Header1_tableHeader']/following-sibling::table[2]//table")
	public WebElement announcements;
	
	@FindBy(xpath="//a[normalize-space()='Students']")
	public WebElement students;
	
	
	public DashboardPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
}
