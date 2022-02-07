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
            contributionSum = +machine.sum();
        }
        return contributionSum;
    }

        public int withdraw() {
            int withdrawSum = 0;
            for (CashMachine machine : machines) {
                withdrawSum = -machine.sum();
            }
            return withdrawSum;
        }
    }

}