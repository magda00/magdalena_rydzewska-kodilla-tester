package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventOverdrawnSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    Teller teller = new Teller(cashSlot);

    public PreventOverdrawnSteps() {
        Given("my wallet has been credited with {int}", (Integer deposit) -> {
            wallet.deposit(deposit);
            int expectedBalance = deposit;
            int actualBalance = wallet.getBalance();
            Assert.assertEquals("Incorrect wallet balance", expectedBalance, actualBalance);
        });

        When("I withdraw {int}", (Integer withdrawal) -> {
            teller.withdraw(wallet, withdrawal);
        });

        And("I should be told that I have insufficient funds in my account, when I want withdraw {int}", (Integer sum) -> {
            String message = teller.tellClient(wallet, sum);
            Assert.assertEquals("You don't have sufficient funds in your account", message);
        });

        Then("{int} should be dispensed", (Integer money) -> {
            int expected = money;
            int actual = cashSlot.getContents();
            Assert.assertEquals(expected, actual);
        });


    }
}
