package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class StudentsPersonalPageElements {

	@FindBy(xpath="//input[@id='tStateId']")
	public WebElement stateId;
	
	@FindBy(xpath="//input[@id='tLastName']")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@id='tFirstName']")
	public WebElement firstName;
	
	@FindBy(xpath="//input[@id='tMiddleName']")
	public WebElement middleName;
	
	@FindBy(xpath="//input[@id='tSSN']")
	public WebElement ssn;
	
	@FindBy(xpath="//input[@id='tSuffix']")
	public WebElement suffix;
	
	@FindBy(xpath="//input[@id='tEmail']")
	public WebElement email;
	
	
	@FindBy(xpath="//input[@id='tBirthDay']")
	public WebElement birthDay;
	
	@FindBy(xpath="//select[@id='gender_list']")
	public WebElement genderListdropdown;
	
	@FindBy(xpath="//select[@id='lunchType']")
	public WebElement luchTypeDropdown;
	
	@FindBy(xpath="//select[@id='ddEthnicity_list']")
	public WebElement ethnicityDropdown;
	
	@FindBy(xpath="//select[@id=\"ddRaceNew\"]")
	public WebElement raceDropDown;
	
	@FindBy(xpath="//input[@id='tLabel']")
	public WebElement label;
	
	@FindBy(xpath="//input[@id='tGradeLevel']")
	public WebElement gradeLevel;
	
	@FindBy(xpath="//input[@id='tParent']")
	public WebElement primaryParent;
	
	@FindBy(xpath="//input[@id='tAddress']")
	public WebElement address;
	
	@FindBy(xpath="//input[@id='tAddress2']")
	public WebElement address2;
	
	@FindBy(xpath="//input[@id='tCity']")
	public WebElement city;
	
	@FindBy(xpath="//input[@id='tState']")
	public WebElement state;
	
	@FindBy(xpath="//input[@id='tZip']")
	public WebElement zip;
	
	@FindBy(xpath="//input[@id='tHomePhone']")
	public WebElement homePhone;
	
	@FindBy(xpath="//input[@id='tBusInfo']")
	public WebElement busInfo;
	
	@FindBy(xpath="//input[@id='bSubmit']")
	public WebElement submitButton;
	
	@FindBy(xpath="//a[@id='photoChange']")
    public WebElement clicktochange;
	
	@FindBy(xpath="//input[@id='fileUpload']")
	public WebElement fileUpload;
	
	@FindBy(xpath="//input[@id='bSubmit']")
	public WebElement upload;
	
	@FindBy(xpath="//span[normalize-space()='Black or African American']")
	public WebElement BoR;
	
	@FindBy(xpath="//span[@class='caret']")
	public WebElement dropdownButton;
	
	@FindBy(xpath="//select[@id='studentStatus_list']")
	public WebElement statusDropDown;
	
	@FindBy(xpath="//input[@id='AutoCompleteStudentName_tStudentName']")
	public WebElement textField;
	
	@FindBy(xpath="//a[@id='bStatusChange']")
	public WebElement enroll;
	
	@FindBy(xpath="//input[@id='bEnroll']")
	public WebElement enroll2;
	
	@FindBy(id="//*[@id='students_students']//option")
	public List<WebElement> listofenrolledStudent;
	
	@FindBy(xpath="//input[@id='AutoCompleteStudentName_bStudentSelect']")
	public WebElement searchbutton;
	
	@FindBy(xpath="//select[@id='enrollGradeSection_list']")
	public WebElement gradeSection;
	
	@FindBy(xpath="//input[@id='tPassword']")
	public WebElement password;
	
	
	@FindBy(xpath="//select[@id='students_students']")
	public WebElement newstudentsdropdown;
	
	
	public StudentsPersonalPageElements()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
	
	
	
	
	
}
