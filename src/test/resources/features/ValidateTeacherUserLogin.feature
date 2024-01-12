Feature: Validate Teacher User Role Login

     @Teacherlogin
     Scenario: Validate Teacher Login
     When I logged in with teacher information
     Then I validate welcome username message
     And I validate LocalId,Classroom,Date of birth
     And I validate the students tab is displayed
     