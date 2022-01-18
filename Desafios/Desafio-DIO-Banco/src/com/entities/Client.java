package com.entities;

import java.util.List;

public class Client {
    private String name;
    private int cpf;

    public Client(String name, int cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public int getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return " Client: " + this.name
                + "\n CPF: "
                + this.cpf
                +"\n--------------------------------"
                ;
    }

}
