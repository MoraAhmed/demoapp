@smoke
Feature: user could search for a product
  As I a user
  I want to search for a product or brand , so that I could get  a relevant result.
  Scenario Outline: User should be able to search for a product by name
    Given search bar is displayed
    When user clicks on  search bar
    And user enters the product name as"<brand>"
    And user clicks on search button
    And user confirm that he goes to the search page
    Then verify the result is relevant to search word as "<brand>"
    Examples:
      | brand |
      | Apple |
      | Gift |
      | Nike |

  Scenario Outline: User should be able to search for a product by SKU
    Given search bar is displayed
    When user clicks on  search bar
    And user enters the product SKU as"<sku>"
    And user clicks on search button
    And user confirm that he goes to the search page
    Then verify the result is relevant to search word as "<sku>"
    Examples:
      | sku |
      |SCI_FAITH |
      | APPLE_CAM |

