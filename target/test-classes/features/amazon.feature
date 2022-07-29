@Amazon
Feature: Verify product search and checkout
  @smoke
  Scenario: As a Tester, I verify product search and proceed for check out
    Given I navigate to the Amazon homepage
    And   I Search for "Macbook" product and product get listed
    And   I click on the product on the page
    And   I add the product to the cart
    And   I click on checkout button


