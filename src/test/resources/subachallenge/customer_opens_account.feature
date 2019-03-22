Feature: Customer Opens Account
    A Customer wants to open a savings account online

  Scenario: A New Customer Opens a Savings Account Online
    Given a new customer
    When they apply for a new savings account
    Then their personal details are verified
    And a new savings account is created for this customer

  Scenario: A Customer Cannot be Verified
    Given a new customer
    When they apply for a new savings account
    And their personal details cannot be verified
    Then no account is created for this customer
    And a description of the error is returned