Feature: Customer Maintains Their Account
  An existing customer performs maintenance operations on their account.

  Scenario: An Existing Customer Closes Their Savings Account
    Given an existing customer
    When they choose to close their savings account
    Then their savings account is flagged as closed

  Scenario: An Existing Customer Freezes Their Savings Account
    Given an existing customer
    When they choose to freeze their savings account
    Then their savings account is flagged as frozen
    And no transactions can occur against their savings account

  Scenario: An Existing Customer Unfreezes Their Savings Account
    Given an existing customer
    And they have a frozen savings account
    When they choose to unfreeze their savings account
    Then their savings account is unfrozen
    And transactions can occur against their savings account