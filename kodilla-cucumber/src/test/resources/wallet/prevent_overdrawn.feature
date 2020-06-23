Feature: Prevent users from going overdrawn

  Scenario Outline: User tries to withdraw more than their balance
    Given my wallet has been credited with <deposit>
    When I withdraw <withdrawal>
    And I should be told that I have insufficient funds in my account, when I want withdraw <sum>
    Then <money> should be dispensed
    Examples:
      | deposit | withdrawal | sum | money |
      | 100     | 200        | 200 | 0     |
