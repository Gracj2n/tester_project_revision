package com.tester.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestV2 {

    Bank millenium = new Bank();
    Bank pko = new Bank();
    CashMachine bankomatM1 = new CashMachine();
    CashMachine bankomatM2 = new CashMachine();
    CashMachine bankomatP1 = new CashMachine();
    CashMachine bankomatP2 = new CashMachine();
    Transaction transakcjaM1 = new Transaction(700);
    Transaction transakcjaM2 = new Transaction(-200);
    Transaction transakcjaM3 = new Transaction(4200);
    Transaction transakcjaM4 = new Transaction(-3200);
    Transaction transakcjaP1 = new Transaction(800);
    Transaction transakcjaP2 = new Transaction(-240);
    Transaction transakcjaP3 = new Transaction(4000);
    Transaction transakcjaP4 = new Transaction(-2000);

    @BeforeEach
    void setup() {
        millenium.addCashMachineToBank(bankomatM1);
        millenium.addCashMachineToBank(bankomatM2);

        bankomatM1.addTransaction(transakcjaM1);
        bankomatM1.addTransaction(transakcjaM2);
        bankomatM2.addTransaction(transakcjaM3);
        bankomatM2.addTransaction(transakcjaM4);

        pko.addCashMachineToBank(bankomatP1);
        pko.addCashMachineToBank(bankomatP2);

        bankomatP1.addTransaction(transakcjaP1);
        bankomatP1.addTransaction(transakcjaP2);
        bankomatP2.addTransaction(transakcjaP3);
        bankomatP2.addTransaction(transakcjaP4);
    }

    @Test
    void shouldReturnAllDepositsMillenium() {
        int result = millenium.sumOfAllDeposits();
        assertEquals(2, result);
    }

    @Test
    void shouldReturnAllDepositsPKO() {
        int result = pko.sumOfAllDeposits();
        assertEquals(2, result);
    }

    @Test
    void shouldReturnAllWithdrawalsMillenium() {
        int result = millenium.sumOfAllWithdrawals();
        assertEquals(2, result);
    }

    @Test
    void shouldReturnAllWithdrawalsPKO() {
        int result = pko.sumOfAllWithdrawals();
        assertEquals(2, result);
    }

    @Test
    void shouldReturnAverageOfMillenium() {
        double resultOfDeposits = millenium.avgOfDeposits();
        double resultOfWithrawals = millenium.avgOfWithdrawals();
        assertEquals(2450, resultOfDeposits);
        assertEquals(-1700, resultOfWithrawals);
    }

    @Test
    void shouldReturnAverageOfPKO() {
        double resultOfDeposits = pko.avgOfDeposits();
        double resultOfWithrawals = pko.avgOfWithdrawals();
        assertEquals(2400, resultOfDeposits);
        assertEquals(-1120, resultOfWithrawals);
    }
}
