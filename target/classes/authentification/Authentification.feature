@authentification
Feature: Authentification - OrangeHRM
  ETQ user je souhaite faire m'authentifer

  @auth
  Scenario: Authentification - OrangeHRM
    Given open application
    When set username
    And set password
    And click nlogin button
    Then show page admin
