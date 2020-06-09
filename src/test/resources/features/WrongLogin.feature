@wronglogin
Feature: Users should be able to login

  Background:
    Given the user is on the login page


  Scenario: Login as a driver

    When the user logs in using "username" and "password1"
    Then the user should be able to not login









