@smoke
Feature: adding product to the wish-list
  As a user, I can add product to wish-list , so that the successful message appears
  Scenario: user gets successful message after clicking on add to wishlist
    When user clicks on add to wishlist icon below product
    Then successful message appears



  Scenario: the numbers of wishlist products should increase on the main page
    When user clicks on add to wishlist icon below product
    Then successful message appears
    And user waits until menu bar be visible
    And user gets the number of items on the wishlist
    Then verify that items increase on the wishlist icon on the home page


  Scenario: user is able to confirms the number of items on the wishlist page
    When user clicks on add to wishlist icon below product
    Then successful message appears
    And user gets the number of items on the wishlist
    Then verify that items increase on the wishlist icon on the home page
    And user waits until menu bar be visible
    And user clicks on wishlist tab to go to wishlist page
    Then verify that items increase on the wishlist page