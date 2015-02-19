Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName and Password
      | Field    | Value      |
      | username | testuser_1 |
      | password | Test@123   |
    Then Message displayed Login Successfully
