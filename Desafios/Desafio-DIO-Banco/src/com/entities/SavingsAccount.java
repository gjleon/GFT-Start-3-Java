package com.entities;

public class SavingsAccount extends Account{
    public SavingsAccount(Client client, String agency) {
        super(client,agency);
    }
    @Override
    public String toString() {
        return  "\t CONTA POUPANCA \t"
                + "\n Client: " + this.client.getName()
                +  "\n cpf: " + this.client.getCpf()
                + "\n N. Conta: "
                + this.getNumber()
                + "\n Agencia: " + this.agency
                +"\n Saldo: " +this.balance
                +"\n--------------------------------"
                ;
    }
}
