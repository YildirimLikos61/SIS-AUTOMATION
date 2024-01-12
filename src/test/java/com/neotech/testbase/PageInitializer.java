package com.neotech.testbase;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.pages.PrimaryParentsPageElements;
import com.neotech.pages.StaffFacultyPageElements;
import com.neotech.pages.StudentLoginPageElements;
import com.neotech.pages.StudentsPageElements;
import com.neotech.pages.StudentsPersonalPageElements;
import com.neotech.pages.StundetsParentsPageElements;
import com.neotech.pages.TeacherLoginPageElements;


public class PageInitializer extends BaseClass{

	public static LoginPageElements login;
	public static DashboardPageElements dash;
	public static StudentsPageElements students;
	public static StudentsPersonalPageElements studentspersonal;
	public static StundetsParentsPageElements studentsparent;
	public static StaffFacultyPageElements stafffaculty;
	public static StudentLoginPageElements studentslogin;
	public static PrimaryParentsPageElements parents;
	public static TeacherLoginPageElements teacher;
	
	
	public static void initializer() 
	{
		login=new LoginPageElements();
		dash=new DashboardPageElements();
		students=new StudentsPageElements();
		studentspersonal=new StudentsPersonalPageElements();
		studentsparent=new StundetsParentsPageElements();
		stafffaculty=new StaffFacultyPageElements();
		studentslogin=new StudentLoginPageElements();
		parents=new PrimaryParentsPageElements();
		teacher=new TeacherLoginPageElements();
	}
	
	
	
	
}
