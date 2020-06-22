Feature: FizzBuzz game

  Scenario Outline: Is number divisible
    Given Next <number>
    When I ask whether number is divisible
    Then I should be told correct <answer>
    Examples:
      | number | answer     |
      | 3      | "Fizz"     |
      | -3     | "Fizz"     |
      | 5      | "Buzz"     |
      | -5     | "Buzz"     |
      | 15     | "FizzBuzz" |
      | -15    | "FizzBuzz" |
      | 1      | "None"     |
      | -1     | "None"     |