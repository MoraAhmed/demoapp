@smoke
Feature: user logs in to an exist account
As a member user
I want to click on the login button, so that I could enter my valid data and log in to my account.
  Scenario: member user should log in to his own account by valid email and password
    Given user navigate to login page
    When user enter valid email "testgov@example.com"
    And user enter valid password "P@ss123"
    And user to click enter to log in to the account
    Then  user go to the home page

