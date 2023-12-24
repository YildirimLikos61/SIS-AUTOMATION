Feature: Validate Assignment Page 

    @Assignment
    Scenario: validate assignment page
    When I logged in
    And I navigate to the stafffaculty 
    And I click the assignment tab
    Then I validate that i am on the assignment page
    