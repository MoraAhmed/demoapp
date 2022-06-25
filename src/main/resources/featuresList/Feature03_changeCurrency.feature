@smoke
Feature: user could switch between available currencies
As I a user
 I want to change current currency , so that I could tap on the dropdown list and select new currency.
  Scenario: User should be able to change the currency from $ to €
    When user click on  the dropdown list
    And click on an another currency
   Then verify that all products price currency are changed

