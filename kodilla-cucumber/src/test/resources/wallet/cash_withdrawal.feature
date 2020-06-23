Feature: Cash Withdrawal

  Scenario Outline: Withdrawal from a wallet
    Given I have deposited <deposit> in my wallet
    When I request <withdrawal>
    Then <money> should be dispensed
    Examples:
      | deposit | withdrawal | money |
      | 200     | 0          | 0     |
      | 200     | 1          | 1     |
      | 200     | 200        | 200   |
      | -200    | 200        | 0     |
      | 0       | 200        | 0     |
      | 200     | 201        | 0     |