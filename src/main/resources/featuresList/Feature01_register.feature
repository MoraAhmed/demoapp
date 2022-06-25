@smoke
Feature: registration new account
As a gust user
I want to click on the register button, so that I could insert my valid Data and register properly.
    Scenario: guest user should register with valid data
      Given user navigate to register page
      When user choose the gender
      And user insert the first name "auto" and the last name "test"
      And user select the date of birth
      And  user enter email "testgov@example.com" for registration field
      And user enter Password and Confirm password fields "P@ss123" and "P@ss123"
      And user is able to on the register button
      Then success message appears

