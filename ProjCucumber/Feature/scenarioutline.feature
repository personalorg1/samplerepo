Feature: Login Action

  Scenario Outline: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters <UserName> and <Password>
    Then Message displayed Login Successfully

    Examples: 
      | UserName   | Password |
      | testuser_1 | Test@123 |
      | user_2 | Test@123 |
   
