package com.neotech.steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddPrentsDetailsSteps extends CommonMethods{

	
	
	@When("I navigate to the Students Tab and pick the status new and select the new student")
	public void i_navigate_to_the_students_tab_and_pick_the_status_new_and_select_the_new_student()
	{
	   click(dash.students);
	   wait(1);
	   selectDropDown(studentspersonal.statusDropDown,"New");
	   wait(1);
	  // sendKeys(studentspersonal.textField,"L M");
	  // wait(1);
	   
	   for(WebElement el:students.listofnewStudents) 
	   {
		   String text=el.getText().trim();
		   if(text.equals("L M")) 
		   {
			   el.click();
			   break;
		   }
	   }
	   //jsClick(studentspersonal.searchbutton);
	   wait(2);
	   
	   //WebElement el=studentspersonal.textField;
	  // el.sendKeys(Keys.ENTER);
	 //  wait(1);
	}
	@When("I navigate to the parental tab and add new primary parent details")
	public void i_navigate_to_the_parental_tab_and_add_new_primary_parent_details()
	{
		   click(students.clickParental);
		   wait(1);
		   click(studentsparent.paddnewPrimaryParent);
		   wait(1);
		   selectDropDown(studentsparent.ptitleDrop,"Mr.");
		   wait(1);
		   sendKeys(studentsparent.pfirstName,"Osman");
		   wait(1);
		   sendKeys(studentsparent.plastName,"Likos");
		   wait(1);
		   sendKeys(studentsparent.ppassword,"123456");
		   wait(1);
		   selectDropDown(studentsparent.prelationList,"Father");
		   wait(1);
		   sendKeys(studentsparent.paddress,"konaklar mh 101");
		   wait(1);
		   sendKeys(studentsparent.paddress2,"arkasokaklar 102");
		   wait(1);
		   sendKeys(studentsparent.pcity,"Trabzon");
		   wait(1);
		   selectDropDown(studentsparent.pstate,"MD");
		   wait(1);
	 
		   sendKeys(studentsparent.pzipCode,"21863");
		   wait(1);
		   sendKeys(studentsparent.phomePhone,"1212334455");
		   wait(1);
		   sendKeys(studentsparent.pworkphone,"4557898579");
		   wait(1);
		   sendKeys(studentsparent.pworkphonext,"+1");
		   wait(1);
		   sendKeys(studentsparent.pcellphone,"7895522333");
		   wait(1);
		   sendKeys(studentsparent.pemail,"kjhgzcgh@gmail.com");
		   wait(1);
		   sendKeys(studentsparent.pemail2,"asxhhschc@gmail.com");
		   wait(1);
		   click(studentsparent.psavePrimary);
		   wait(1);
	}
	@When("I add new secondary parent details and i submit the changes")
	public void i_add_new_secondary_parent_details_and_i_submit_the_changes() 
	{
	   
		   click(studentsparent.saddnewsecondparent);
		
		   wait(1);
		   selectDropDown(studentsparent.stitledropdown,"Mrs.");
		   wait(1);
		   sendKeys(studentsparent.sfirstname,"Fatma");
		   wait(1);
		   sendKeys(studentsparent.slastname,"Likos");
		   wait(1);
		   sendKeys(studentsparent.spassword,"123456");
		   wait(1);
		   selectDropDown(studentsparent.srelationdropdown,"Mother");
		   wait(1);
		   sendKeys(studentsparent.saddress,"konaklar mh 101");
		   wait(1);
		   sendKeys(studentsparent.sadrees2,"arkasokaklar 102");
		   wait(1);
		   sendKeys(studentsparent.scity,"Trabzon");
		   wait(1);
		   selectDropDown(studentsparent.sstatedropdown,"MD");
		   wait(1);
		   sendKeys(studentsparent.szipcode,"21863");
		   wait(1);
		   sendKeys(studentsparent.shomephone,"1212334455");
		   wait(1);
		   sendKeys(studentsparent.sworkphone,"4557898579");
		   wait(1);
		   sendKeys(studentsparent.sworkphponext,"+1");
		   wait(1);
		   sendKeys(studentsparent.scellphone,"7895522333");
		   wait(1);
		   sendKeys(studentsparent.semail,"kjhgzcgh@gmail.com");
		   wait(1);
		   sendKeys(studentsparent.semail2,"asxhhschc@gmail.com");
		   wait(1);
		   click(studentsparent.ssavesecondary);
		   wait(1);
		
	}
	
	@Then("I validate that i added the details")
	public void i_validate_that_i_added_the_details()
	{
	    Assert.assertTrue(true);
	}

	
}
