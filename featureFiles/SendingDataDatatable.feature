Feature: Orange page login testing with data from feature

  Scenario Outline: Login to orange page websiteC
    Given Login page of orange page websiteC
    When userC enters the credentials "<Username>" and "<Password>"
    And userC clicks the login page button

    Examples: 
      | Username | Password |
      | Admin    | admin123 |
      | Admin    | admin345 |
      | Admin1  | admin123|
      | Admin 1 | admin345| 
