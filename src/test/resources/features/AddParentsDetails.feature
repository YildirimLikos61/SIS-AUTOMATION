Feature: Add Parents Details Functioality

    @AddParents
    Scenario: Add parents 
    When I logged in
    And I navigate to the Students Tab and pick the status new and select the new student
    And I navigate to the parental tab and add new primary parent details
    And I add new secondary parent details and i submit the changes
    Then I validate that i added the details
    