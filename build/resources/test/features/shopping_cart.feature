Feature: Search and add products to the shopping cart
  As a user of demoblaze online store
  I want to search and add products from each category
  To view them in the shopping cart

  @ShoppingCart # preguntar
  Scenario: Add and search products to shopping cart
    When Selects products from each category to add it to shopping cart
    Then the products is displayed in shopping cart with the total price of the products
