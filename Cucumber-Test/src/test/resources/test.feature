Feature: Web Login
  Scenario: User should be able to login with valid credentials
    Given user is on login page
    When  the user enter valid credentials
    And   hit submit
    Then  user should be logged in successfully
