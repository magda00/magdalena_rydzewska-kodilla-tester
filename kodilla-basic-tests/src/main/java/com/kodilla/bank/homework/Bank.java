package com.kodilla.bank.homework;

public class Bank {
    private String branch;
    private CashMachine first;
    private CashMachine second;
    private CashMachine third;

    public Bank(String branch) {
        this.branch = branch;
        this.first = new CashMachine();
        this.second = new CashMachine();
        this.third = new CashMachine();
    }

    public void addTransactionToFirst(int transaction) {
        this.first.addTransaction(transaction);
    }

    public void addTransactionToSecond(int transaction) {
        this.second.addTransaction(transaction);
    }

    public void addTransactionToThird(int transaction) {
        this.third.addTransaction(transaction);
    }



    public double getBalanceFirst() {
        return this.first.getBalance();
    }

    public double getBalanceSecond() {
        return this.second.getBalance();
    }

    public double getBalanceThird() {
        return this.third.getBalance();
    }

    public double getBalanceCashMachines() {
        return this.first.getBalance() + this.second.getBalance() + this.third.getBalance();
    }



    public int getCountOfWithdrawalFirst() {
        return this.first.getCountOfWithdrawal();
    }

    public int getCountOfWithdrawalSecond() {
        return this.second.getCountOfWithdrawal();
    }

    public int getCountOfWithdrawalThird() {
        return this.third.getCountOfWithdrawal();
    }

    public int getCountOfWithdrawal() {
        return this.first.getCountOfWithdrawal() + this.second.getCountOfWithdrawal() + this.third.getCountOfWithdrawal();
    }



    public int getCountOfDepositFirst() {
        return this.first.getCountOfDeposit();
    }

    public int getCountOfDepositSecond() {
        return this.second.getCountOfDeposit();
    }

    public int getCountOfDepositThird() {
        return this.third.getCountOfDeposit();
    }

    public int getCountOfDeposit() {
        return this.first.getCountOfDeposit() + this.second.getCountOfDeposit() + this.third.getCountOfDeposit();
    }



    public double getAverageOfWithdrawalFirst() {
        return this.first.getAverageOfWithdrawal();
    }

    public double getAverageOfWithdrawalSecond() {
        return this.second.getAverageOfWithdrawal();
    }

    public double getAverageOfWithdrawalThird() {
        return this.third.getAverageOfWithdrawal();
    }

    public double getAverageOfWithdrawal() {
        double sum;
        sum = this.first.getAverageOfWithdrawal() + this.second.getAverageOfWithdrawal() + this.third.getAverageOfWithdrawal();
        return sum / 3;
    }



    public double getAverageOfDepositFirst() {
        return this.first.getAverageOfDeposit();
    }

    public double getAverageOfDepositSecond() {
        return this.second.getAverageOfDeposit();
    }

    public double getAverageOfDepositThird() {
        return this.third.getAverageOfDeposit();
    }

    public double getAverageOfDeposit() {
        double sum;
        sum = this.first.getAverageOfDeposit() + this.second.getAverageOfDeposit() + this.third.getAverageOfDeposit();
        return sum / 3;
    }
}
