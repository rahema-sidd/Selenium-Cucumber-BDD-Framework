Feature: User Login Validation

  Background:
    Given Start Browser

  Scenario: Validate user is able to view SwagLab after login
    Given Navigate to "SwagLabURL" from page "SwagLab" by  Google Chrome
    When User enter "username" on "usernameField" from page "SwagLab"
    And User enter "password" on "passwordField" from page "SwagLab"
    Then User click on "loginBtn" from page "SwagLab"

