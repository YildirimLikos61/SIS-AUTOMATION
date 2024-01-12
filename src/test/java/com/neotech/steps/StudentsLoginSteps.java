package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StudentsLoginSteps extends CommonMethods{

	
	@When("I enterd a user name for the new student")
	public void i_enterd_a_user_name_for_the_new_student() 
	{
	    sendKeys(login.userName,"Yildirim");
	}
	@When("I entred a password")
	public void i_entred_a_password() 
	{
		sendKeys(login.password,"885943");
	}
	@When("I clik the login button")
	public void i_clik_the_login_button() 
	{
		click(login.login);
		 wait(2);
	}
	@Then("I validate studentId,StudentName,StudentGrade,UserBame")
	public void i_validate_student_id_student_name_student_grade_user_bame() 
	{
	   
		String id=studentslogin.studentId.getText();
		String expectedId="965";
		String studentname=studentslogin.studentName.getText();
		String expectedname="Likos Yildirim";
		String grade=studentslogin.studentGrade.getText();
		String expectedGrade="1st Grade";
		String username=studentslogin.studentUserName.getText();
		String expectedusername="Yildirim";
		
		Assert.assertEquals(expectedId, id);
		Assert.assertEquals(expectedname, studentname);
		Assert.assertEquals(expectedGrade, grade);
		Assert.assertEquals(expectedusername, username);
		
	}

	
	
	
	
}
