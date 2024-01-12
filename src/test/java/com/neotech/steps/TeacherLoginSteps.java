package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class TeacherLoginSteps extends CommonMethods {

	
	@When("I logged in with teacher information")
	public void i_logged_in_with_teacher_information()  
	{
	    sendKeys(login.userName,"AKing");
	    sendKeys(login.password,"123456");
	    click(login.login);
	    wait(2);
	}
	@Then("I validate welcome username message")
	public void i_validate_welcome_username_message() 
	{
	
	   String actual=teacher.welcome.getText();
	   String expected="Welcome King";
		
	   Assert.assertEquals(expected, actual);
	}
	
	@Then("I validate LocalId,Classroom,Date of birth")
	public void i_validate_local_id_classroom_date_of_birth() 
	{
	    click(teacher.show);
	    wait(1);
	    String alocalid=teacher.localId.getText();
	    String elocalid="1232";
	    String aclassroom=teacher.classroom.getText();
	    String eclassroom="Computer";
	    String adateofbirth=teacher.dateofbirth.getText();
	    String edateofbirth="12/3/2023";
	    
	    Assert.assertEquals(elocalid, alocalid);
	    Assert.assertEquals(eclassroom, aclassroom);
	    Assert.assertEquals(edateofbirth, adateofbirth);
	    
	    
	}
	@Then("I validate the students tab is displayed")
	public void i_validate_the_students_tab_is_displayed() 
	{
	    boolean isdisplayed=teacher.students.isDisplayed();
	    
	    Assert.assertTrue(isdisplayed);
	}
	
	
	
	
}
