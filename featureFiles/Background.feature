
@background
Feature: Education graduate level
 
 Background:
  Given the student should completed higher secondary education.
  Given the student should have more than 50% marks.

  @engg
  Scenario: Engineering
    Given the student applied for engineering course 
    When  the student passed engineering entrance exam
    And   the student is eligible for engineering course 
@medic
  Scenario: Medical
    Given the student applied for medical course 
    When  the student passed medical entrance exam
    And   the student is eligible for medical course 

 
