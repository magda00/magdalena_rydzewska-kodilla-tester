Feature: Cash Withdrawal

  Scenario Outline: Withdrawal from a wallet
    Given I have deposited <deposit> in my wallet
    When I request <withdrawal>
    Then and <money> should be dispensed
    And the balance of my wallet should be <balance>
    Examples:
      | deposit | withdrawal | money | balance |
      | 200     | 0          | 0     | 200     |
      | 200     | 1          | 1     | 199     |
      | 200     | 200        | 200   | 0       |
      | -200    | 200        | 0     | -200    |
      | 0       | 200        | 0     | 0       |
      | 200     | 201        | 0     | 200     |