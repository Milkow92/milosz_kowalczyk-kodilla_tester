package com.kodilla.bank.homework;

public class Bank {

    private int size;

    public Bank() {
    }

    public void add(CashMachine machine) {
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(machines, 0, newTab, 0, machines.length);
        newTab[this.size - 1] = machine;
        this.machines = newTab;
    }

    CashMachine[] machines = new CashMachine[0];

    public int balance() {

        int sum = 0;
        for (CashMachine machine : machines) {
            sum += machine.sum();
        }
        return sum;
    }

    public int contribution() {
        int contributionSum = 0;
        for (CashMachine machine : machines) {
            contributionSum += machine.contribution();
        }
        return contributionSum;
    }

    public int withdraw() {
        int withdrawSum = 0;
        for (CashMachine machine : machines) {
            withdrawSum += machine.withdraw();
        }
        return withdrawSum;
    }

    public int countOfContribution() {
        int count = 0;
        for (CashMachine cashMachine : machines) {
            count += cashMachine.countContribution();

        }
        return count;
    }

    public double averageContribution() {
        int contribution = contribution();
        double count = countOfContribution();
        return contribution / count;

    }

    public int countWithdraw() {
        int count = 0;
        for (CashMachine cashMachine : machines) {
            count += cashMachine.countWithdraw();

        }
        return count;
    }

    public double averageWithdrow() {
        int contribution = withdraw();
        double count = countWithdraw();
        return contribution / count;
    }
}