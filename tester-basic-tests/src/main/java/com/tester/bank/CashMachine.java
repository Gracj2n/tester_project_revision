package com.tester.bank;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Transaction> transactionList = new ArrayList<>();

    public List<Transaction> addTransaction(Transaction transaction) {
        transactionList.add(transaction);
        return transactionList;
    }

    public double showSaldo() {
        return transactionList
                .stream()
                .mapToDouble(n -> n.getValue())
                .sum();
    }

    public int getTransactionList() {
        return transactionList.size();
    }

    public List<Transaction> getTransactions() {
        return transactionList;
    }

    public int sumOfDeposits() {
        return transactionList
                .stream()
                .filter(n -> n.getValue() > 0)
                .toList()
                .size();
    }

    public int sumOfWithdrawals() {
        return transactionList
                .stream()
                .filter(n -> n.getValue() < 0)
                .toList()
                .size();
    }
}
