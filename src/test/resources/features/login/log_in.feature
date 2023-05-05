Feature: New purchase

  Scenario Outline: Buyer add a new product to shopping cart
    Given Buyer log in app SWAG LABS
    When Buyer selects a product named "<product_name>"
    And fills the client information and confirm the checkout
    Then verifies order was successfully
    Examples:
      |product_name|
      |Sauce Labs BackPack|
      |Sauce Labs Bike Light|
      |Sauce Labs Bolt T-Shirt|
      |Sauce Labs Fleece Jacket|
      |Sauce Labs Onesie|
      |T-Shirt (Red)|

  Scenario: Buyer add all available products to shopping cart
    Given Buyer log in app SWAG LABS
    When Buyer selects all available products
    And fills the client information and confirm the checkout
    Then verifies order was successfully

