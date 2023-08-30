package com.tester.bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<CashMachine> cashMachineList = new ArrayList<>();

    public List<CashMachine> addCashMachineToBank(CashMachine cashMachine) {
        cashMachineList.add(cashMachine);
        return cashMachineList;
    }

    public double saldoAllCashMachines() {
        return cashMachineList
                .stream()
                .mapToDouble(CashMachine::showSaldo)
                .sum();
    }

    public int sumOfAllDeposits() {
        return cashMachineList
                .stream()
                .mapToInt(CashMachine::sumOfDeposits)
                .sum();
    }

    public int sumOfAllWithdrawals() {
        return cashMachineList
                .stream()
                .mapToInt(CashMachine::sumOfWithdrawals)
                .sum();
    }

    public double avgOfDeposits() {
        return cashMachineList
                .stream()
                .flatMap(n -> n.getTransactions().stream())
                .filter(n -> n.getValue() > 0 )
                .mapToDouble(n -> n.getValue())
                .average()
                .getAsDouble();
    }

    public double avgOfWithdrawals() {
        return cashMachineList
                .stream()
                .flatMap(n -> n.getTransactions().stream())
                .filter(n -> n.getValue() < 0 )
                .mapToDouble(n -> n.getValue())
                .average()
                .getAsDouble();
    }
}
