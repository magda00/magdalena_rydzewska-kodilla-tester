Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  //Homework:

  Scenario Outline: Successful withdrawal from a wallet
    Given I have deposited <deposit> in my wallet
    When I request <withdrawal>
    Then <withdrawal> should be dispensed
    Examples:
      | deposit | withdrawal |
      | $200    | $0         |
      | $200    | $1         |
      | $200    | $200       |


  Scenario Outline: Unsuccessful withdrawal from a wallet
    Given I have deposited <deposit> in my wallet
    When I request <withdrawal>
    Then $0 should be dispensed
    Examples:
      | deposit | withdrawal |
      | $-200   | $200       |
      | $0      | $200       |
      | $200    | $201       |
