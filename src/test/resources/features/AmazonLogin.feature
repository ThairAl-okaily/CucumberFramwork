@tag
Feature: Amazon Login
  I want to be able to login with valid credintials.
  I should be logged in with invalid credintials.

  @amazonLogin
  Scenario: User should be redirected to log in page.
    Given I am on the Amazon home page
    And The sign in button displays
    When I click on the sign in button
    Then I should be directed to login page.
