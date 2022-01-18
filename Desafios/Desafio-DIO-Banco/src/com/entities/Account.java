package com.entities;

import java.util.List;

public abstract class Account {
    private static int SEQUENCIAL = 1;
    protected Client client;
    protected String agency;
    protected int number;
    protected Double balance;

    public Account( Client client, String agency) {
        this.client = client;
        this.agency = agency;
        this.number = SEQUENCIAL++;
        this.balance = 0.00;
    }

    public String getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }


    public Double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public void deposit(Double value){
        this.balance += value;
    }
    public void withdraw(Double value){
        this.balance -= value;
    }
    public void transfer(Double value, Account targetAccount){
        this.balance -= value;
        targetAccount.deposit(value);
    }
    public void extract(){
        System.out.println("Extrato conta " + this.client.getName());
        System.out.println("Saldo da conta: " + this.balance);
    }
}
