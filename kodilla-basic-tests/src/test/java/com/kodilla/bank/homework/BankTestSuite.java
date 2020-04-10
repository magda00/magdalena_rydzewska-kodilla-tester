package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateCorrectBalanceIfTransactionsAreOutsideRange() {
        Bank bank = new Bank("Warszawa");
        bank.addTransactionToFirst(0.00);
        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);

        bank.addTransactionToSecond(0.00);
        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);

        bank.addTransactionToThird(0.00);
        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(5241, bank.getBalanceCashMachines(), 0.01);
    }

    @Test
    public void shouldCalculateCorrectBalanceIfTransactionsAreInRange() {
        Bank bank = new Bank("Warszawa");

        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);

        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);

        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(5241, bank.getBalanceCashMachines(), 0.01);
    }

    @Test
    public void shouldCalculateCorrectCountOfWithdrawalIfTransactionsAreOutsideRange() {
        Bank bank = new Bank("Warszawa");
        bank.addTransactionToFirst(0.00);
        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);
        bank.addTransactionToFirst(-17.8);
        bank.addTransactionToFirst(-543);

        bank.addTransactionToSecond(0.00);
        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);
        bank.addTransactionToSecond(100);


        bank.addTransactionToThird(0.00);
        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(5, bank.getCountOfWithdrawal());
    }

    @Test
    public void shouldCalculateCorrectCountOfWithdrawalIfTransactionsAreInRange() {
        Bank bank = new Bank("Warszawa");
        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);
        bank.addTransactionToFirst(-17.8);
        bank.addTransactionToFirst(-543);

        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);
        bank.addTransactionToSecond(100);

        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(5, bank.getCountOfWithdrawal());
    }

    @Test
    public void shouldCalculateCorrectCountOfDepositIfTransactionsAreOutsideRange() {
        Bank bank = new Bank("Warszawa");
        bank.addTransactionToFirst(0.00);
        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);
        bank.addTransactionToFirst(-17.8);
        bank.addTransactionToFirst(-543);

        bank.addTransactionToSecond(0.00);
        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);
        bank.addTransactionToSecond(100);

        bank.addTransactionToThird(0.00);
        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(4, bank.getCountOfDeposit());
    }

    @Test
    public void shouldCalculateCorrectCountOfDepositIfTransactionsAreInRange() {
        Bank bank = new Bank("Warszawa");

        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);
        bank.addTransactionToFirst(-17.8);
        bank.addTransactionToFirst(-543);

        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);
        bank.addTransactionToSecond(100);

        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(4, bank.getCountOfDeposit());
    }

    @Test
    public void shouldCalculateCorrectCAverageOfWithdrawalIfTransactionsAreOutsideRange() {
        Bank bank = new Bank("Warszawa");
        bank.addTransactionToFirst(0.00);
        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);
        bank.addTransactionToFirst(-17.8);
        bank.addTransactionToFirst(-543);

        bank.addTransactionToSecond(0.00);
        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);
        bank.addTransactionToSecond(100);

        bank.addTransactionToThird(0.00);
        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(-81.55, bank.getAverageOfWithdrawal(), 0.01);
    }

    @Test
    public void shouldCalculateCorrectCAverageOfWithdrawalIfTransactionsAreInRange() {
        Bank bank = new Bank("Warszawa");

        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);
        bank.addTransactionToFirst(-17.8);
        bank.addTransactionToFirst(-543);

        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);
        bank.addTransactionToSecond(100);

        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(-81.55, bank.getAverageOfWithdrawal(), 0.01);
    }

    @Test
    public void shouldCalculateCorrectCAverageOfDepositIfTransactionsAreOutsideRange() {
        Bank bank = new Bank("Warszawa");
        bank.addTransactionToFirst(0.00);
        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);
        bank.addTransactionToFirst(-17.8);
        bank.addTransactionToFirst(-543);

        bank.addTransactionToSecond(0.00);
        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);
        bank.addTransactionToSecond(100);

        bank.addTransactionToThird(0.00);
        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(241.76, bank.getAverageOfDeposit(), 0.01);
    }

    @Test
    public void shouldCalculateCorrectCAverageOfDepositIfTransactionsAreInRange() {
        Bank bank = new Bank("Warszawa");

        bank.addTransactionToFirst(200);
        bank.addTransactionToFirst(-50.5);
        bank.addTransactionToFirst(-17.8);
        bank.addTransactionToFirst(-543);

        bank.addTransactionToSecond(350.20);
        bank.addTransactionToSecond(-20);
        bank.addTransactionToSecond(100);

        bank.addTransactionToThird(300.20);
        bank.addTransactionToThird(-20.9);

        assertEquals(241.76, bank.getAverageOfDeposit(), 0.01);
    }

}
