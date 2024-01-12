Feature: Validate User Role Login
   
   
   @studentslogin
   Scenario: Login with new user
   When I enterd a user name for the new student
   And I entred a password 
   And I clik the login button
   Then I validate studentId,StudentName,StudentGrade,UserBame
   
   
   