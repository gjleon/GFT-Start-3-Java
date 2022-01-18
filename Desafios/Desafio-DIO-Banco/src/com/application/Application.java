package com.application;

import com.entities.*;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Account gabriel = new SavingsAccount(new Client("Gabriel",1234),"0001");
        Account jorge = new CheckingAccount(new Client("Jorge",1235),"0002");
        gabriel.deposit(100.00);
        gabriel.transfer(20.00,jorge);
        gabriel.extract();
        jorge.extract();
        System.out.println("--------------");
        gabriel.withdraw(20.00);
        gabriel.extract();
        System.out.println("--------------");
        System.out.println(gabriel);
        System.out.println(jorge);
        System.out.println(gabriel.getClient());
        System.out.println(jorge.getClient());
    }
}
