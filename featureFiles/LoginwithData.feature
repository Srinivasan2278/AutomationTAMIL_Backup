Feature: Orange page login testing with data from feature
  

  
  Scenario: Login to orange page website
    Given Login page of orange page website
    When  user enters the "Admin" and "admin123"
    And   user clicks the login page button
    Then  user logged in to the orange page webpage