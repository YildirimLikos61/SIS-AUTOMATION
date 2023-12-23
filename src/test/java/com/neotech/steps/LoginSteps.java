package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends CommonMethods {

	
	@When("I enter username")
	public void i_enter_username()
	{
	  sendKeys(login.userName,ConfigsReader.getProperty("username")); 
	  wait(1);
	}
	@When("I enter password")
	public void i_enter_password() 
	{
	 sendKeys(login.password,ConfigsReader.getProperty("password"));
	 wait(1);
	}
	@When("I click to Login")
	public void i_click_to_login() 
	{
	    click(login.login);
	    wait(1);
	}
	@Then("I validate that i logged in")
	public void i_validate_that_i_logged_in() 
	{
	    Assert.assertTrue(dash.logo.isDisplayed());
	    
	}


	@When("I leave the password field empty")
	public void i_leave_the_password_field_empty() 
	{
	    sendKeys(login.password,"");
	}
	@Then("I validate that password cannot be empty")
	public void i_validate_that_password_cannot_be_empty() 
	{
	    String actual=getAlertText();
	    String expected="Please fill required fields";
	    acceptAlert();
	    Assert.assertEquals(expected, actual);
	}


	
	@When("I provied wrong passord")
	public void i_provied_wrong_passord() 
	{
	    sendKeys(login.password,"agduasu");
	}
	@Then("I validate that password doesnt match")
	public void i_validate_that_password_doesnt_match()
	{
		String actual=getAlertText();
	    String expected="Either username and password do"
	    		+ " not match or your account doesn't have"
	    		+ "  access for the selected Academic Year.";
	    acceptAlert();
	    Assert.assertEquals(expected, actual);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
