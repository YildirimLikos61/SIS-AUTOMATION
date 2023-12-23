package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StudentsSteps extends CommonMethods{

	@When("I navigate to the Students Tab")
	public void i_navigate_to_the_students_tab() 
	{
	    click(dash.students);
	}
	@Then("I validate all the tabs")
	public void i_validate_all_the_tabs(DataTable dataTable) 
	{
	    
		List<String> expected=dataTable.asList();	
		
		List<String> actual=new ArrayList<>();
		
		
		for(WebElement el:students.listoftabs) 
		{
			actual.add(el.getText().trim());
		}
		
		
		wait(1);
		
		Assert.assertEquals(expected, actual);
		
	}

	@When("I fiiled up all the section except local id, grade section, and username")
	public void i_fiiled_up_all_the_section_except_local_id_grade_section_and_username() 
	{
	   
		click(students.addnew);
		wait(1);
		sendKeys(studentspersonal.stateId,"MD");
		wait(1);
		sendKeys(studentspersonal.lastName,"Lee");
		wait(1);
		sendKeys(studentspersonal.firstName,"Me");
		wait(1);
		sendKeys(studentspersonal.middleName,"QA");
		wait(1);
		sendKeys(studentspersonal.suffix,"mr");
		wait(1);
		sendKeys(studentspersonal.ssn,"331-36-4664");
		wait(1);
		sendKeys(studentspersonal.email,"yildirim61likos@gmail.com");
		wait(1);
		sendKeys(studentspersonal.birthDay,"12/25/2022");
		wait(1);
		selectDropDown(studentspersonal.genderListdropdown,"Male");
		wait(1);
		selectDropDown(studentspersonal.luchTypeDropdown,"Free");
		wait(1);
		selectDropDown(studentspersonal.ethnicityDropdown,"Hispanic or Latino");
		wait(1);
		click(studentspersonal.dropdownButton);
		click(studentspersonal.BoR);
		wait(1);
		sendKeys(studentspersonal.label,"100");
		wait(1);
		
		wait(1);
		click(studentspersonal.submitButton);
		wait(2);
		
	}
	
	
	
	@Then("i Validate success message displayed indicating student is created")
	public void i_validate_success_message_displayed_indicating_student_is_created() 
	{
	   String actual=getAlertText().trim();
	   String expected="Successfully Added";
	   wait(1);
	   acceptAlert();
	   wait(1);
	   
	   Assert.assertEquals(expected, actual);
	   
	}

	@When("I select new as status and send the name of the new student and click the enroll and click again")
	public void i_select_new_as_status_and_send_the_name_of_the_new_student_and_click_the_enroll_and_click_again() 
	{
	  wait(2);
	  selectDropDown(studentspersonal.statusDropDown,"New");
	  wait(1);
	  sendKeys(studentspersonal.textField,"Lee Me");
	  wait(1);
	 // click(studentspersonal.searchbutton);
	   WebElement el=studentspersonal.textField;
	   el.sendKeys(Keys.ENTER);
	  wait(1);
	  
	  click(studentspersonal.enroll);
	  wait(2);
	  
	  wait(1);
	  click(studentspersonal.enroll2);
	  wait(2);
	  
	}
	
	@Then("I validate that newly created student in the enrolled students")
	public void i_validate_that_newly_created_student_in_the_enrolled_students()
	{
	    
		wait(2);
		
		List<WebElement> list=studentspersonal.listofenrolledStudent;
		
		for(WebElement el:list) 
		{
			String text=el.getText().trim();
			if(text.contains("Lee Me")) 
			{
				Assert.assertTrue(true);
			}else 
			{
              Assert.assertTrue(false);				
			}
		}
		
		
	}

	
	
	
	
}
