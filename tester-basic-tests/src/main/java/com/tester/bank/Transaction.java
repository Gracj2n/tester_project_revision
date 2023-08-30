package com.tester.bank;

public class Transaction {

    private double value;

    public Transaction(double value) {
        if (value == 0) {
            throw new IllegalArgumentException("Transaction value cannot be 9");
        }
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
