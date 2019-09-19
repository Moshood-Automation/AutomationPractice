#Author: moshoodagbosasa@yahoo.com

@AddAnItemToCartTest
Feature: Add An Item To Cart Test

  Background: 
    Given i navigate to the homepage of automation practice website
    And i click on the sign in link
    
@AddAnItemToCartTest
  Scenario: As a registered user i want to login successfully with valid details
    When i enter valid email address
    And i enter a  valid password
    And i click the sign in button
    And i should be logged in
    When i click on the T-SHIRTS link
    And i click on a displayed item
    When i click on the Add to cart button
    Then the same item should be added to the cart
   
