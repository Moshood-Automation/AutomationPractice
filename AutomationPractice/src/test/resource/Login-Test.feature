#Author: moshoodagbosasa@yahoo.com

@LoginTest
Feature: Login Test

  Background:
    Given i navigate to the homepage of automation practice website
    And i click on the sign in link
    
@LoginTest
  Scenario: As a registered user i want to login successfully with valid details
    When i enter valid email address
    And i enter a  valid password
    And i click the sign in button
    Then i should be logged in
    And i log out
    
@LoginTest
  Scenario Outline: I want to enter invalid details to login inorder to get an error message
    When i enter an "<email>"
    And i enter a "<password>"
    And i click the sign in button
    Then i should get an error message

    Examples: 
      | email                     | password   |
      | moshoodagbosasa@yahoo.com | manchester |
      | moshoo-agbosasa@yahoo.com | london     |
      |                           |            |
      | moshodoo_agbo@yahoo.com   |            |
      |                           | india      |
