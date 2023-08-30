package com.tester.bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashMachineTest {

    @Test
    void shouldAddTwoTransactions() {
        //given
        CashMachine cashMachine = new CashMachine();
        Transaction transaction1 = new Transaction(1000);
        Transaction transaction2 = new Transaction(-700);

        //when
        cashMachine.addTransaction(transaction1);
        cashMachine.addTransaction(transaction2);

        //then
        assertEquals(2, cashMachine.getTransactionList());
    }

    @Test
    void shouldShowSaldo() {
        //given
        CashMachine cashMachine = new CashMachine();
        Transaction transaction1 = new Transaction(1000);
        Transaction transaction2 = new Transaction(-700);

        //when
        cashMachine.addTransaction(transaction1);
        cashMachine.addTransaction(transaction2);
        double result = cashMachine.showSaldo();

        //then
        assertEquals(300, result);
    }

    @Test
    void sumOfDeposits() {
        //given
        CashMachine cashMachine = new CashMachine();
        Transaction transaction1 = new Transaction(3500);
        Transaction transaction2 = new Transaction(200);
        Transaction transaction3 = new Transaction(500);
        Transaction transaction4 = new Transaction(-300);

        //when
        cashMachine.addTransaction(transaction1);
        cashMachine.addTransaction(transaction2);
        cashMachine.addTransaction(transaction3);
        cashMachine.addTransaction(transaction4);
        int result = cashMachine.sumOfDeposits();

        //then
        assertEquals(3, result);
    }

    @Test
    void sumOfWithdrawals() {
        //given
        CashMachine cashMachine = new CashMachine();
        Transaction transaction1 = new Transaction(3500);
        Transaction transaction2 = new Transaction(200);
        Transaction transaction3 = new Transaction(-500);
        Transaction transaction4 = new Transaction(-300);

        //when
        cashMachine.addTransaction(transaction1);
        cashMachine.addTransaction(transaction2);
        cashMachine.addTransaction(transaction3);
        cashMachine.addTransaction(transaction4);
        int result = cashMachine.sumOfWithdrawals();

        //then
        assertEquals(2, result);
    }
}