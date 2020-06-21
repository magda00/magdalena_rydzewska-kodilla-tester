package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {

    private Wallet wallet = new Wallet();

    public DisplayBalanceSteps() {
        Given("my account has been credited with $100", () -> {
            wallet.deposit(100);
        });

        When("I check my balance", () -> {
            Assert.assertEquals("Incorrect account balance", 100, wallet.getBalance());
        });

        Then("I should see that my balance is $100", () -> {
            String display = wallet.displayBalance();
            Assert.assertEquals("Your account balance: $100", display);
        });

    }
}
