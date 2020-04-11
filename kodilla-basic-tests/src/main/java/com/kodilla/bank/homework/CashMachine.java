package com.kodilla.bank.homework;

public class CashMachine {
    private double[] transactions;
    private int number;
    private double baseline;

    public CashMachine(double baseline) {
        this.number = 0;
        this.transactions = new double[0];
        this.baseline = baseline;
    }

    public void addTransaction(double value) {
        this.number++;
        double[] newTab = new double[this.number];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.number - 1] = value;
        this.transactions = newTab;
    }

    public double[] getTransactions() {
        return transactions;
    }

    public int getNumberOfTransactions() {
        return transactions.length;
    }


    public double getBalance() {
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return baseline - sum;
    }

    public double getAverageOfWithdrawal() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                sum += this.transactions[i];
            }
        }
        return sum / getCountOfWithdrawal();
    }

    public double getAverageOfDeposit() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                sum += this.transactions[i];
            }
        }
        return sum / getCountOfDeposit();
    }


    public int getCountOfWithdrawal() {
        int countWithdrawal = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                countWithdrawal++;
            }
        }
        return countWithdrawal;
    }


    public int getCountOfDeposit() {
        int countDeposit = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                countDeposit++;
            }
        }
        return countDeposit;
    }
}
