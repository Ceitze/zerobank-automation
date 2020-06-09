@login1
Feature: Users should be able to login

  Background:
    Given the user is on the login page


  Scenario: Login as a driver

    When the user logs in using "username" and "password"
    Then the user should be able to login
    And the Account Activity page should be displayed












