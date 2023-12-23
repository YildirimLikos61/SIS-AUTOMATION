Feature: Home Page Validation

    @Homepage
    Scenario: Successfull login and home page validation
    When I logged in 
    Then I validate that i logged in
    Then I validate that Announcement section is visible
    Then I Validate that the url includes the "MainPage.aspx" extension.
    