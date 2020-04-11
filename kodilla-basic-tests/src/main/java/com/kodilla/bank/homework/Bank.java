package com.kodilla.bank.homework;

public class Bank {
    private String branch;
    private CashMachine first;
    private CashMachine second;
    private CashMachine third;

    public Bank(String branch) {
        this.branch = branch;
        this.first = new CashMachine(1500);
        this.second = new CashMachine(2000);
        this.third = new CashMachine(2500);
    }

    public void addTransactionToFirst(double transaction) {
        if (transaction != 0) {
            this.first.addTransaction(transaction);
        }
    }

    public void addTransactionToSecond(double transaction) {
        if (transaction != 0) {
            this.second.addTransaction(transaction);
        }
    }

    public void addTransactionToThird(double transaction) {
        if (transaction != 0) {
            this.third.addTransaction(transaction);
        }
    }


    public double getBalanceCashMachines() {
        return this.first.getBalance() + this.second.getBalance() + this.third.getBalance();
    }


    public int getCountOfWithdrawal() {
        return this.first.getCountOfWithdrawal() + this.second.getCountOfWithdrawal() + this.third.getCountOfWithdrawal();
    }


    public int getCountOfDeposit() {
        return this.first.getCountOfDeposit() + this.second.getCountOfDeposit() + this.third.getCountOfDeposit();
    }


    public double getAverageOfWithdrawal() {
        double sum = this.first.getAverageOfWithdrawal() + this.second.getAverageOfWithdrawal() + this.third.getAverageOfWithdrawal();
        return sum / 3;
    }


    public double getAverageOfDeposit() {
        double sum = this.first.getAverageOfDeposit() + this.second.getAverageOfDeposit() + this.third.getAverageOfDeposit();
        return sum / 3;
    }
}
