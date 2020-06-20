Feature: FizzBuzz game

   Scenario Outline: Is number divisible
      Given number <is_divisible>
      When I ask whether number is divisible
      Then I should be told <answer>
      Examples:
        | is_divisible | answer |
        | is divisible by three | "Fizz" |
        | is divisible by five | "Buzz" |
        | is divisible by three and five | "FizzBuzz" |
        | isn't divisible by three or five | "None" |