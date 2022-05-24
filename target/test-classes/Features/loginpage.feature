
@tag
Feature: Validating the Hotel login functionlity 
 

  @tag1
  Scenario: Validating the login functionlity with valid credentials
    Given launch the browser
    And open the application
    When enter the username and password
    And click the login button
    Then I validate the outcomes
    And close the browser


