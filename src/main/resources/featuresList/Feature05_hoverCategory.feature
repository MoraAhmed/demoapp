@smoke
Feature: Hover on category tabs and select sub-category
  As I a user
  I am able to hover category tabs and sub category, so that I could select sub-category

  Scenario: User should be able to hover category and select sub-category
    Given verify that the categories tabs are displayed
    When user hovers on category and select subCategory
    Then verify the page title is the same of the sub-category title



