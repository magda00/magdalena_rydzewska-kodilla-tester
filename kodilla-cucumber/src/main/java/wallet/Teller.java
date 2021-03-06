package wallet;

public class Teller {
    private CashSlot cashSlot;

    public Teller(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        if (amount > wallet.getBalance()) {
            cashSlot.dispense(0);
            wallet.debit(0);
        } else {
            cashSlot.dispense(amount);
            wallet.debit(amount);
        }
    }

    public String tellClient(Wallet wallet, int amount) {
        if (wallet.getBalance() - amount < 0) {
            return "You don't have sufficient funds in your account";
        }
        return "OK";
    }
}
