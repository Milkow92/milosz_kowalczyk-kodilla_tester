package com.kodilla.bank.homework;

public class CashMachine {
    private int Transactions[];
    private int size;

    public CashMachine() {

        this.Transactions = new int[0];
        this. size = 0;
    }
    public void add(int Transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(Transactions, 0, newTab, 0, Transactions.length);
        newTab[this.size - 1] = Transaction;
        this.Transactions = newTab;
    }
    public int sum(){
        int sum = 0;
        for (int transaction: Transactions){
            sum += transaction;
        }
     return sum;
    }
public int contribution(){
        int contribution = 0;
        for ( int transaction: Transactions){
            contribution = + transaction;
        }
        return contribution;
}
public int withdraw(){
        int withdraw = 0;
        for ( int transaction: Transactions){
            withdraw = - transaction;
        }
        return withdraw;
}
    }
