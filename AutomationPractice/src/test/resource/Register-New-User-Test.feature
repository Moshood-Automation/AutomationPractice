#Author:moshoodagbosasa@yahoo.com

@RegisterTest
Feature: Register Test

@RegisterTest
  Scenario: I want to register a new user account successfully
    Given i navigate to the homepage of automation practice website
    And i click on the sign in link
    And i enter a valid email address
    And i click create an account link
    When i fill the form
    And i click the register button
    Then my account should be created
    
