Feature: This is to test google search
Scenario: Google search scenarion
Given user is entering  google.co.in
When user is typing the search term "tamil nadu"
And enter the ENTER key
Then user should see the searchh results

