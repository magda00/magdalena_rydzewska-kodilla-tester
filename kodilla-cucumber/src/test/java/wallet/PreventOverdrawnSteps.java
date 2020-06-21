package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class PreventOverdrawnSteps implements En {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    Teller teller = new Teller(cashSlot);

    public PreventOverdrawnSteps() {
        Given("my wallet has been credited with $100", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
        });

        When("I withdraw $200", () -> {
            teller.withdraw(wallet, 200);
        });

        Then("nothing should be dispensed", () -> {
            Assert.assertEquals(0, cashSlot.getContents());
        });

        Then("I should be told that I have insufficient funds in my account", () -> {
            String message = teller.tellClient(wallet, 200);
            Assert.assertEquals("You don't have sufficient funds in your account", message);
        });

    }
}
