package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class StaffFacultyPageElements {

	@FindBy(xpath="//input[@id='bAdd']")
	public WebElement addnew;
	
	@FindBy(xpath="//select[@id='jPosition_list']")
	public WebElement positiondropdown;
	
	@FindBy(xpath="//select[@id='dStaffStatus_list']")
	public WebElement statusdropdwon;
	
	@FindBy(xpath="//select[@id='jPosAccLev']")
	public WebElement jobpositiondropdown;
	
	@FindBy(xpath="//select[@id='myTitle_list']")
	public WebElement titledropdown;
	
	
	@FindBy(xpath="//input[@id='tLastName']")
	public WebElement lastname;
	
	@FindBy(xpath="//input[@id='tFirstName']")
	public WebElement firtsname;
	
	@FindBy(xpath="//input[@id='tDateofBirth']")
	public WebElement birthday;
	
	
	@FindBy(xpath="//input[@id='tSSN']")
	public WebElement ssn;
	
	
	@FindBy(xpath="//select[@id='dGender_list']")
	public WebElement genderdropdown;
	
	
	@FindBy(xpath="//input[@id='tPassword']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='tJTitle']")
	public WebElement joTitle;
	
	@FindBy(xpath="//input[@id='tAddress']")
	public WebElement address;
	
	
	@FindBy(xpath="//input[@id='tCity']")
	public WebElement city;
	
	@FindBy(xpath="//select[@id='state_list']")
	public WebElement state;
	
	
	@FindBy(xpath="//input[@id='tZip']")
	public WebElement zipcode;
	
	
	@FindBy(xpath="//input[@id='tCellPhone']")
	public WebElement cellphone;
	
	@FindBy(xpath="//input[@id='bSubmit']")
	public WebElement submitbutton;
	
	@FindBy(xpath="//select[@id='staffList_staffs']//option")
	public List<WebElement> listofstaff;
	
	@FindBy(xpath="//a[normalize-space()='Assignments']")
	public WebElement assignment;
	
	
	
	public StaffFacultyPageElements() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
}
