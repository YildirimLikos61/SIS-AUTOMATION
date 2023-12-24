package com.neotech.steps;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTeacherSteps extends CommonMethods {

	
	
	@When("I navigate to the stafffaculty")
	public void i_navigate_to_the_stafffaculty() 
	{   
		Actions action=new Actions(driver);
		WebElement button=dash.staffbutton;
		action.moveToElement(button).perform();
	    click(dash.staffbutton);
	    wait(1);   
	}



	
	@When("I click add new")
	public void i_click_add_new() 
	{
	   wait(2);
	   click(stafffaculty.addnew);
	   wait(1);
	   
	   
	}
	
	@When("I select the position status and filled up all the section")
	public void i_select_the_position_status_and_filled_up_all_the_section()
	{
		
		   selectDropDown(stafffaculty.jobpositiondropdown,"Teacher/Teacher");
		   
		   wait(1);
		   sendKeys(stafffaculty.lastname,"King");
		   wait(1);
		   sendKeys(stafffaculty.firtsname,"Ataturk");
		   wait(1);
		   
		   Actions action =new Actions(driver);
		   
		   WebElement el=stafffaculty.birthday;
		   action.moveToElement(el).perform();
		   click(stafffaculty.birthday);
		   sendKeys(stafffaculty.birthday,"11/7/1881");
		   el.sendKeys(Keys.ENTER);
		   
		   sendKeys(stafffaculty.joTitle,"Bas Ogretmen");
		   wait(1);
		   WebElement el2=stafffaculty.ssn;
		   
		   action.moveToElement(el2).perform();
		   sendKeys(stafffaculty.ssn,"929951248");
		   wait(1);
		   selectDropDown(stafffaculty.genderdropdown,"Male");
		   wait(1);
		   WebElement password=stafffaculty.password;
		   action.moveToElement(password).perform();
		   sendKeys(stafffaculty.password,"123456");
		   wait(1);
		   sendKeys(stafffaculty.address,"Selanik Yunan adalari");
		   wait(1);
		   sendKeys(stafffaculty.city,"Selanik");
		   wait(1);
		   selectDropDown(stafffaculty.state,"MD");
		   wait(1);
		   sendKeys(stafffaculty.zipcode,"21863");
		   wait(1);
		   sendKeys(stafffaculty.cellphone,"45678945656");
		   wait(1);
		   click(stafffaculty.submitbutton);
		   wait(2);
		   
	}
	
	

  @When("I click the assignment tab")
  public void i_click_the_assignment_tab() 
  {
    click(stafffaculty.assignment);
  }
  
  @Then("I validate that i am on the assignment page")
  public void i_validate_that_i_am_on_the_assignment_page() 
  {
    Assert.assertTrue(true);
  }

	
	
	
	
	
	

	
	
}
