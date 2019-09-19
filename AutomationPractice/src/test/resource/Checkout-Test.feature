#Author: moshoodagbosasa@yahoo.com

@CheckoutTest
Feature: Checkout Test

  Background: 
    Given i navigate to the homepage of automation practice website
    And i click on the sign in link
    
@CheckoutTest
  Scenario: As a registered user i want to add an item to cart and proceed to checkout
    When i enter valid email address
    And i enter a  valid password
    And i click the sign in button
    And i should be logged in
    When i click on the T-SHIRTS link
    And i click on a displayed item
    When i click on the Add to cart button
    Then the same item should be added to the cart
    When i click on the first proceed to checkout button
    And i click on the second proceed to checkout button
    And i click on the third proceed to checkout button
    And i agree to the terms of service
    And i click on the fourth proceed to checkout button
    Then i should be on the payment page
