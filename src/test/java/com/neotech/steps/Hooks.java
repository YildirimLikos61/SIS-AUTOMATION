package com.neotech.steps;

import com.neotech.testbase.BaseClass;
import com.neotech.utils.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass{

	
	@Before
	public static void open() 
	{
		setUp();
	}
	
	
	@After
	public static void close(Scenario scenario ) 
	{
		byte[] pic;
		
		if(scenario.isFailed()) 
		{
			
			pic=CommonMethods.takeScreenshot("failed/"+scenario.getName());
		}else 
		{
			pic=CommonMethods.takeScreenshot("pass/"+scenario.getName());
		}
		
		scenario.attach(pic, "image/png",scenario.getName());
		
		tearDown();
	}
	
	
}
