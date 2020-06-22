package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();
    private Teller teller = new Teller(cashSlot);

    public WalletSteps() {
        Given("I have deposited {int} in my wallet", (Integer deposit) -> {
            wallet.deposit(deposit);
            int walletBalance = wallet.getBalance();
            int depositedMoney = deposit;
            Assert.assertEquals("Incorrect wallet balance", depositedMoney, walletBalance);
        });

        When("I request {int}", (Integer withdrawal) -> {
            teller.withdraw(wallet, withdrawal);
        });

        Then("{int} should be dispensed", (Integer money) -> {
            int result = cashSlot.getContents();
            int expected = money;
            Assert.assertEquals(expected, result);
        });
    }
}
