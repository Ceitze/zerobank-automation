@PurchaseForeign
Feature: Purchase Foreign Currency


  Scenario: Available currencies

    Given the user accesses the Purchase foreign currency cash tab
    Then following currencies should be available




  Scenario: Error message for not selecting currency

    Given the user accesses the Purchase foreign currency cash tab
    When user tries to calculate cost without selecting a currency
    Then error message should be displayed
  Scenario: Error message for not entering value
    Given the user accesses the Purchase foreign currency cash tab
    When user tries to calculate cost without entering a value
    Then error message should be displayed