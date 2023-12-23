package com.neotech.testbase;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.StudentsPageElements;
import com.neotech.pages.StudentsPersonalPageElements;


public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static DashboardPageElements dash;
	public static StudentsPageElements students;
	public static StudentsPersonalPageElements studentspersonal;
	
	
	public static void initializer() 
	{
		login=new LoginPageElements();
		dash=new DashboardPageElements();
		students=new StudentsPageElements();
		studentspersonal=new StudentsPersonalPageElements();
	}
	
	
	
	
}
