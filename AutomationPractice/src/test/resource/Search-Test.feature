#Author: moshoodagbosasa@yahoo.com

@SearchTest
Feature: Search Test

@SearchTest
 Scenario: As a registered user, i want to search for items and see the items displayed 
    Given i navigate to the homepage of automation practice website                      
    And i click on the sign in link                                                     
    When i enter valid email address                                                   
    And i enter a  valid password                                                     
    And i click the sign in button                                                      
    Then i should be logged in                                                          
    When I enter a search keyword                                                       
    And I click the search button                                                  
    Then the searched item should be displayed
    
@SearchTest    
    Scenario: As a guest user, i want to search for items and see the items displayed
    Given i navigate to the homepage of automation practice website                
    When I enter an item in the search input box                                
    And I click the search button                                                 
    Then the search result should be displayed   

