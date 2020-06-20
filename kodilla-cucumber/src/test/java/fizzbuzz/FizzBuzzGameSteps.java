package fizzbuzz;

import fizzbuzz_game.FizzBuzz;
import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzGameSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzGameSteps() {
        Given("number is divisible by three", () -> {
            this.number = 3;
            this.number = -3;
        });

        Given("number is divisible by five", () -> {
            this.number = 5;
            this.number = -5;
        });

        Given("number is divisible by three and five", () -> {
            this.number = 15;
            this.number = -15;
        });

        Given("number isn't divisible by three or five", () -> {
            this.number = 1;
            this.number = 0;
            this.number = -1;
        });

        When("I ask whether number is divisible", () -> {
            FizzBuzz fizzBuzz = new FizzBuzz();
            this.answer = fizzBuzz.checkIfDivisible(this.number);
        });

        Then("I should be told correct {string}", (String string) -> {
            Assert.assertEquals(string, this.answer);
        });
    }

}
