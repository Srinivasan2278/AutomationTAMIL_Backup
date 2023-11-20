@alpha
Feature: Orange page login testing with data from feature
  

  
  Scenario: Login to orange page websiteB
    Given Login page of orange page websiteB
    When  userB enters the credentials
    |Username| Password|
    |Admin| admin123|
    And   userB clicks the login page button
    
 