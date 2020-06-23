Feature: Display balance

  Scenario Outline: User checks the balance of an account in credit
    Given my account has been credited with <deposit>
    When I check my balance, I expect <balance>
    Then I should see that my balance is <answer>
    Examples:
      | deposit | balance | answer                       |
      | 100     | 100     | "Your account balance: $100" |
