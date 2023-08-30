package com.tester.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTest {
    public Bank bank = new Bank();
    public CashMachine cashMachine1 = new CashMachine();
    public CashMachine cashMachine2 = new CashMachine();
    public Transaction transaction1 = new Transaction(6000);
    public Transaction transaction2 = new Transaction(4000);
    public Transaction transaction3 = new Transaction(-500);
    public Transaction transaction4 = new Transaction(-90);
    public Transaction transaction5 = new Transaction(300);
    public Transaction transaction6 = new Transaction(-500);

    @BeforeEach
    void setup() {
        bank.addCashMachineToBank(cashMachine1);
        bank.addCashMachineToBank(cashMachine2);
        cashMachine1.addTransaction(transaction1);
        cashMachine1.addTransaction(transaction2);
        cashMachine1.addTransaction(transaction3);
        cashMachine2.addTransaction(transaction4);
        cashMachine2.addTransaction(transaction5);
        cashMachine2.addTransaction(transaction6);
    }

    @Test
    void shouldReturnSaldoAllCashMachines() {
        double result = bank.saldoAllCashMachines();
        assertEquals(9210, result);
    }

    @Test
    void shouldReturnAmountOfAllDeposits() {
        int result = bank.sumOfAllDeposits();
        assertEquals(3, result);
    }

    @Test
    void shouldReturnAmountOfAllWithdrawals() {
        int result = bank.sumOfAllWithdrawals();
        assertEquals(3, result);
    }

    @Test
    void shouldReturnAverageOfDeposits() {
        double result = bank.avgOfDeposits();
        assertEquals(3433.33, result, 0.01);
    }

    @Test
    void shouldReturnAverageOfWithdrawals() {
        double result = bank.avgOfWithdrawals();
        assertEquals(-363.33, result, 0.01);
    }
}