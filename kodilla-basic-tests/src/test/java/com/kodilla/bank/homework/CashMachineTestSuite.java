package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine(0.00);
        double[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddThreeElementsToArray() {
        CashMachine cashMachine = new CashMachine(0.00);
        cashMachine.addTransaction(-505.22);
        cashMachine.addTransaction(1200.00);
        cashMachine.addTransaction(2500.00);

        double[] transactions = cashMachine.getTransactions();
        assertEquals(3, transactions.length);
        assertEquals(-505.22, transactions[0]);
        assertEquals(1200.00, transactions[1]);
        assertEquals(2500.00, transactions[2]);
    }


    @Test
    public void shouldHaveFourTransactionsIfAddFourElementsToArray() {
        CashMachine cashMachine = new CashMachine(0.00);
        cashMachine.addTransaction(-505.22);
        cashMachine.addTransaction(1200.00);
        cashMachine.addTransaction(2500.00);
        cashMachine.addTransaction(-323.1200);

        assertEquals(4, cashMachine.getNumberOfTransactions());
    }


    @Test
    public void shouldReturnBalanceEqualsZeroIfArrayIsEmptyAndBaselineIsZero() {
        CashMachine cashMachine = new CashMachine(0.00);
        assertEquals(0, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnBalance() {
        CashMachine cashMachine = new CashMachine(-150.00);

        cashMachine.addTransaction(-505.22);
        cashMachine.addTransaction(1200.00);

        assertEquals(-844.78, cashMachine.getBalance());
    }

    @Test
    public void shouldReturnAverageOfWithdrawalEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine(0.00);
        assertEquals(0, cashMachine.getAverageOfWithdrawal());
    }

    @Test
    public void shouldReturnAverageOfWithdrawal() {
        CashMachine cashMachine = new CashMachine(-150.00);

        cashMachine.addTransaction(-505.22);
        cashMachine.addTransaction(-323.1200);
        cashMachine.addTransaction(1200.00);

        assertEquals(-414.17, cashMachine.getAverageOfWithdrawal(), 0.001);
    }

    @Test
    public void shouldReturnAverageOfDepositEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine(0.00);
        assertEquals(0, cashMachine.getAverageOfDeposit());
    }

    @Test
    public void shouldReturnAverageOfDeposit() {
        CashMachine cashMachine = new CashMachine(-150.00);

        cashMachine.addTransaction(505.22);
        cashMachine.addTransaction(323.1200);
        cashMachine.addTransaction(-1200.00);

        assertEquals(414.17, cashMachine.getAverageOfDeposit(), 0.001);
    }

    @Test
    public void shouldReturnCountOfWithdrawalEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine(0.00);
        assertEquals(0, cashMachine.getCountOfDeposit());
    }

    @Test
    public void shouldReturnCountOfWithdrawal() {
        CashMachine cashMachine = new CashMachine(-150.00);

        cashMachine.addTransaction(505.22);
        cashMachine.addTransaction(323.1200);
        cashMachine.addTransaction(-1200.00);

        assertEquals(1, cashMachine.getCountOfWithdrawal());
    }

    @Test
    public void shouldReturnCountOfDepositEqualsZeroIfArrayIsEmpty() {
        CashMachine cashMachine = new CashMachine(0.00);
        assertEquals(0, cashMachine.getCountOfDeposit());
    }

    @Test
    public void shouldReturnCountOfDeposit() {
        CashMachine cashMachine = new CashMachine(-150.00);

        cashMachine.addTransaction(505.22);
        cashMachine.addTransaction(323.1200);
        cashMachine.addTransaction(-1200.00);

        assertEquals(2, cashMachine.getCountOfDeposit());
    }
}
