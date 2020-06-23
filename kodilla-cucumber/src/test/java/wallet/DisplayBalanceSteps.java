package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class DisplayBalanceSteps implements En {

    private Wallet wallet = new Wallet();

    public DisplayBalanceSteps() {
        Given("my account has been credited with {int}", (Integer deposit) -> {
            wallet.deposit(deposit);
        });

        When("I check my balance, I expect {int}", (Integer balance) -> {
            int expectedBalance = balance;
            int actualBalance = wallet.getBalance();
            Assert.assertEquals("Incorrect account balance", expectedBalance, actualBalance);
        });

        Then("I should see that my balance is {string}", (String answer) -> {
            String display = wallet.displayBalance();
            Assert.assertEquals(answer, display);
        });

    }
}
