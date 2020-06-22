package fizzbuzz;

import fizzbuzz_game.FizzBuzz;
import io.cucumber.java8.En;
import org.junit.Assert;

public class FizzBuzzGameSteps implements En {
    private int number;
    private String answer;

    public FizzBuzzGameSteps() {
        Given("Next {int}", (Integer integer) -> {
            this.number = integer;
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
