Feature: Goto the login page and verify the title of the page

  Scenario: 
    Given user is on login page
    When user enter username as "<username>" and password as "<password>"
    Then user should be logged in
    And user gets the right title of the page

    Examples:
    
    |username|password|
    |testuser|test@123|
    
    