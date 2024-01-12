package com.neotech.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ParentUserRoleLoginSteps extends CommonMethods{


	
	@When("I logged in with primary information")
	public void i_logged_in_with_primary_information()
	{
	   sendKeys(login.userName,"Likos");
	   sendKeys(login.password,"123456");
	   click(login.login);
	   wait(1);
	}
	
	@Then("I validate all the tabs are displayed; Main Page,Attendance,Grades,Homework,Results,Schedule,Discipline")
	public void i_validate_all_the_tabs_are_displayed_main_page_attendance_grades_homework_results_schedule_discipline(DataTable dataTable) 
	{
	    List<String> expected=dataTable.asList();
	    List<String> actual=new ArrayList<>();
	    for(WebElement el:parents.listoftabs) 
	    {
	    	String text=el.getText().trim();
	    	actual.add(text);
	    }
		Assert.assertEquals(expected,actual);
	}

	@Then("I validate the parent profile information; Full Name, Address,Phone,Email")
	public void i_validate_the_parent_profile_information_full_name_address_phone_email() 
	{
	    String factual=parents.fullname.getText().trim();
	    String fexpected="Osman Likos";
	    String aactual=parents.address.getText().trim();
	    String aexpected="konaklar mh 101 arkasokaklar 102 MD, 21863";
	    String hactual=parents.homephone.getText().trim();
	    String hexpected="1212334455";
	    String wactual=parents.workphone.getText().trim();
	    String wexpected="4557898579";
	    String cactual=parents.cellphone.getText().trim();
	    String cexpected="7895522333";
	    String eactaul=parents.email.getText().trim();
	    String eexpected="kjhgzcgh@gmail.com, asxhhschc@gmail.com";
	    
	    Assert.assertEquals(fexpected,factual);
	    Assert.assertEquals(aexpected,aactual);
	    Assert.assertEquals(hexpected,hactual);
	    Assert.assertEquals(wexpected,wactual);
	    Assert.assertEquals(cexpected,cactual);
	    Assert.assertEquals(eexpected,eactaul);
	  
	    
	    
		
		
		
	}
	@Then("I validate the Student Information ;StudentId, StudnetName,Grade Level")
	public void i_validate_the_student_information_student_id_studnet_name_grade_level() 
	{
	    
		String iactual=parents.studentId.getText().trim();
		String iexpected="965";
		String nactual=parents.studentName.getText().trim();
		String nexpected="Likos Yildirim";
		String gactual=parents.studentgrade.getText().trim();
		String gexpected="1";
		
		 Assert.assertEquals(iexpected,iactual);
		 Assert.assertEquals(nexpected,nactual);
		 Assert.assertEquals(gexpected,gactual);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
