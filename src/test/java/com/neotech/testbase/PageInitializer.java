package com.neotech.testbase;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.StaffFacultyPageElements;
import com.neotech.pages.StudentsPageElements;
import com.neotech.pages.StudentsPersonalPageElements;
import com.neotech.pages.StundetsParentsPageElements;


public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static DashboardPageElements dash;
	public static StudentsPageElements students;
	public static StudentsPersonalPageElements studentspersonal;
	public static StundetsParentsPageElements studentsparent;
	public static StaffFacultyPageElements stafffaculty;
	
	
	public static void initializer() 
	{
		login=new LoginPageElements();
		dash=new DashboardPageElements();
		students=new StudentsPageElements();
		studentspersonal=new StudentsPersonalPageElements();
		studentsparent=new StundetsParentsPageElements();
		stafffaculty=new StaffFacultyPageElements();
	}
	
	
	
	
}
