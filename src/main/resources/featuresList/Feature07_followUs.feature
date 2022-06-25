@smoke
Feature: opening the follow us pages
  As a user, I can click on the follow us icon , so that the page opens
  Scenario: user clicks on the Facebook icon and go to the Facebook page
    Given the follow us icons on the main page are displayed
    When user clicks on the facebook icon
    Then user navigate to "https://www.facebook.com/nopCommerce" on new window


  Scenario: user clicks on the Twitter icon and go to the Facebook page
    Given the follow us icons on the main page are displayed
    When user clicks on the Twitter icon
    Then user navigate to "https://twitter.com/nopCommerce" on new window


  Scenario: user clicks on the Rss icon and goes to the Rss page
    Given the follow us icons on the main page are displayed
    When user clicks on the rss icon
    Then user navigate to rss page "https://demo.nopcommerce.com/news/rss/1" on new window


  Scenario: user clicks on the Youtube icon and goes to the Youtube page
    Given the follow us icons on the main page are displayed
    When user clicks on the Youtube icon
    Then user navigate to "https://www.youtube.com/user/nopCommerce" on new window


