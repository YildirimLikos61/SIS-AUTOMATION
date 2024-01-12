package com.neotech.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class PrimaryParentsPageElements {

	
	@FindBy(xpath="//table[@id='Header1_tableHeader']/following-sibling::table//table//tbody/tr/td[@background='../../Common/themes/Blue/mBg.jpg']")
	public List<WebElement> listoftabs;
	
	@FindBy(xpath="//*[@id=\"form1\"]/table[3]/tbody/tr/td[2]/table/tbody/tr[4]/td[2]")
	public WebElement fullname;
	
	@FindBy(xpath="//span[@id='lAddress']")
	public WebElement address;
	
	@FindBy(xpath="//span[@id='lHomePhone']")
	public WebElement homephone;
	
	@FindBy(xpath="//span[@id='lWorkPhone']")
	public WebElement workphone;
	
	@FindBy(xpath="//span[@id='lCellPhone']")
	public WebElement cellphone;
	
	@FindBy(xpath="//span[@id='lEmail']")
	public WebElement email;
	
	@FindBy(xpath="//span[@id='GridStudents_ctl02_lStdId']")
	public WebElement studentId;
	
	@FindBy(xpath="//span[@id='GridStudents_ctl02_lStudentName']")
	public WebElement studentName;
	
	@FindBy(xpath="//span[@id='GridStudents_ctl02_lblGradeLevel']")
	public WebElement studentgrade;
	
	public PrimaryParentsPageElements() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
