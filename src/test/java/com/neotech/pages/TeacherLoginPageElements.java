package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class TeacherLoginPageElements {

	
	@FindBy(xpath="//td[contains(text(),'Welcome')]")
	public WebElement welcome;
	
	@FindBy(xpath="//a[@id='linkShow']")
	public WebElement show;
	
	@FindBy(xpath="//span[@id='lblStaffId']")
	public WebElement localId;
	
	@FindBy(xpath="//span[@id='lblRoomNo']")
	public WebElement classroom;
	
	@FindBy(xpath="//span[@id='lblDateofBirth']")
	public WebElement dateofbirth;
	
	@FindBy(xpath="//span[@id='lblDepartment']")
	public WebElement department;
	
	@FindBy(xpath="//a[normalize-space()='Students']")
    public WebElement students;
	
	
	@FindBy(xpath="//select[@id='lStudents']")
	public WebElement totalstudentsdropdown;
	
	public TeacherLoginPageElements() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
