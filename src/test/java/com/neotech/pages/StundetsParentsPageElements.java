package com.neotech.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.testbase.BaseClass;

public class StundetsParentsPageElements {

	@FindBy(xpath="//input[@id='ppHomePhone']")
	public WebElement phomePhone;
	
	@FindBy(xpath="//input[@id='ppWorkPhone']")
	public WebElement pworkphone;
	
	@FindBy(xpath="//input[@id='ppWorkPhoneExt']")
	public WebElement pworkphonext;
	
	@FindBy(xpath="//input[@id='ppCellPhone']")
	public WebElement pcellphone;
	
	@FindBy(xpath="//input[@id='ppEmail1']")
	public WebElement pemail;
	
	@FindBy(xpath="//input[@id='ppEmail2']")
	public WebElement pemail2;
	
	@FindBy(xpath="//input[@id='bAddNew']")
	public WebElement paddnewPrimaryParent;
	
	@FindBy(xpath="//select[@id='ppTitle_list']")
	public WebElement ptitleDrop;
	
	@FindBy(xpath="//input[@id='ppFirstName']")
	public WebElement pfirstName;
	
	@FindBy(xpath="//input[@id='ppLastName']")
	public WebElement plastName;
	
	@FindBy(xpath="//input[@id='ppPassword']")
	public WebElement ppassword;
	
	@FindBy(xpath="//select[@id='ppRelation_list']")
	public WebElement prelationList;
	
	@FindBy(xpath="//input[@id='ppAddress']")
	public WebElement paddress;
	
	@FindBy(xpath="//input[@id='ppAddress2']")
	public WebElement paddress2;
	
	@FindBy(xpath="//input[@id='ppCity']")
	public WebElement pcity;
	
	@FindBy(xpath="//select[@id='ppState_list']")
	public WebElement pstate;
	
	@FindBy(xpath="//input[@id='ppZipCode']")
	public WebElement pzipCode;
	
	@FindBy(xpath="//input[@id='bSave']")
	public WebElement psavePrimary;
	
	
	@FindBy(xpath="//select[@id='spRelation_list']")
	public WebElement srelationdropdown;
	
	@FindBy(xpath="//input[@id='spAddress']")
	public WebElement saddress;
	
	@FindBy(xpath="//input[@id='spAddress2']")
	public WebElement sadrees2;
	
	@FindBy(xpath="//input[@id='spCity']")
	public WebElement scity;
	
	@FindBy(xpath="//select[@id='spState_list']")
	public WebElement sstatedropdown;
	
	@FindBy(xpath="//input[@id='spZipCode']")
	public WebElement szipcode;
	
	@FindBy(xpath="//input[@id='spHomePhone']")
	public WebElement shomephone;
	
	@FindBy(xpath="//input[@id='spWorkPhone']")
	public WebElement sworkphone;
	
	@FindBy(xpath="//input[@id='spWorkPhoneExt']")
	public WebElement sworkphponext;
	
	@FindBy(xpath="//input[@id='spCellPhone']")
	public WebElement scellphone;
	
	@FindBy(xpath="//input[@id='spEmail1']")
	public WebElement semail;
	
	@FindBy(xpath="//input[@id='spEmail2']")
	public WebElement semail2;
	
	@FindBy(xpath="//select[@id='spTitle_list']")
	public WebElement stitledropdown;
	
	@FindBy(xpath="//input[@id='spFirstName']")
	public WebElement sfirstname;
	
	@FindBy(xpath="//input[@id='spLastName']")
	public WebElement slastname;
	
	@FindBy(xpath="//input[@id='spPassword']")
	public WebElement spassword;
	
	@FindBy(xpath="//input[@id='bAddNewSP']")
	public WebElement saddnewsecondparent;
	
	@FindBy(xpath="//input[@id='bSaveSP']")
    public WebElement ssavesecondary;
	
	
	
	
	public StundetsParentsPageElements() 
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
