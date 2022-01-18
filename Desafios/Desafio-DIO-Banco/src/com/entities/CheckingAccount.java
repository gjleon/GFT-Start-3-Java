package com.entities;

public class CheckingAccount extends Account{

    public CheckingAccount(Client client,String agency) {
        super(client ,agency);
    }
    @Override
    public String toString() {
        return  "\t CONTA CONRRENTE \t"
                + "\n Client: " + this.client.getName()
                +  "\n cpf: " + this.client.getCpf()
                + "\n N. Conta: "
                + this.getNumber()
                + "\n Agencia: " + this.agency
                +"\n--------------------------------"
                ;
    }
}
