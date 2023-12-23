Feature: Students page Validation
   
   @Studentstabs
   Scenario: All tabs are visible
   When I logged in 
   And I navigate to the Students Tab
   Then I validate all the tabs
   |Personal|
   |Parental|
   |Academic|
   |Override Final Grade|
   |Schedule|
   |Discipline Stats|
   |Personal 2|
   |Enrollment|
   |Notes|
   |E-Portfolio|
   |Program Enrollment|

   
   @Addnewstudent
   Scenario: Add new student functionality
   When I logged in
   And I navigate to the Students Tab
   And I fiiled up all the section except local id, grade section, and username
   Then i Validate success message displayed indicating student is created 
   
   @EnrollStudent
   Scenario: Validate student functionality and Enrollment
   When I logged in
   And I navigate to the Students Tab
   And I select new as status and send the name of the new student and click the enroll and click again
   Then I validate that newly created student in the enrolled students
   
   
   
   
   