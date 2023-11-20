
@beta
Feature: Orange page login testing with data from feature
  

  
  Scenario: Login to orange page website
    Given Login page of orange page websiteA
    When  userA enters the credentials
    |Admin|
    |admin123|
    And   userA clicks the login page button
    
    
    # NOTE - very important 
   # |Admin|admin123| = in this case |Admin| position is [0,0] and |admin123| position is [0,1]
   
   # |Admin|  = in this case |Admin| position is [0]
   # |admin123| = in this |admin123| position is [1]