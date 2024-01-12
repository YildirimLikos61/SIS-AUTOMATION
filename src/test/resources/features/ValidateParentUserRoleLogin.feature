Feature: Validate Parent User Role Login


    @PrimaryParentLogin
    Scenario: Login with primary parent and validate all the tabs,parent profile, and student information
    When I logged in with primary information
    Then I validate all the tabs are displayed; Main Page,Attendance,Grades,Homework,Results,Schedule,Discipline
    |Main Page|
    |Attendance|
    |Grades|
    |Homework|
    |Results|
    |Schedule|
    |Discipline|
    And I validate the parent profile information; Full Name, Address,Phone,Email
    And I validate the Student Information ;StudentId, StudnetName,Grade Level
    
