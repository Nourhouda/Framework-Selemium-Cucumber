@authentification
Feature: Authentification - OrangeHRM
  ETQ user je souhaite m'authentifier

  Background: 
    Given open application
    When set username
    And set password
    And click Login button

  @auth
  Scenario: Authentification - OrangeHRM
    Then show page Admin

  @linkAdmin
  Scenario: Click-Admin
    When click on Admin

  @linkBuzz
  Scenario: Click-Buzz
    When click on Buzz
