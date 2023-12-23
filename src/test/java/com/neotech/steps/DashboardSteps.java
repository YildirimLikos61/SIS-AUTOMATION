package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardSteps extends CommonMethods{

	@When("I logged in")
	public void i_logged_in() 
	{
	   login.validLogin();
	}
	@Then("I validate that Announcement section is visible")
	public void i_validate_that_announcement_section_is_visible() 
	{
	    Assert.assertTrue(dash.announcements.isDisplayed());
	    
	}
	
	@Then("I Validate that the url includes the {string} extension.")
	public void i_validate_that_the_url_includes_the_extension(String extension) 
	{
	    String url=driver.getCurrentUrl();
	    Boolean contains=url.contains(extension);
	    Assert.assertTrue(contains);
	    
	}

	
	
	
	
	
	
	
	
}
