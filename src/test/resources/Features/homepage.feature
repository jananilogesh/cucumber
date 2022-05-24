
@tag
Feature: validating home page functionality
  I want to use this template for my feature file

  @tag1
  Scenario: validating the home functionality
    Given launch the browser
    And open the application
    When enter the username and password
    And click the login button
    And select the location 
    And select the hotel
    And select the room type
    And select the number of rooms
    And select check in date
    And select the check out date
    And Select adults
    And select children
    And click the Search button
    Then I validate the outcome
    And close the browser

  |
