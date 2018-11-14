package com.company;

import java.util.Scanner;

public class Menu {
    Menu() {
        init();
    }

    public void init() {

        Scanner scn = new Scanner(System.in);
        System.out.println("Iveskite varda");
        String name = scn.next();
        String email;
        double balance;

        do {
            System.out.println("Iveskite emaila");
            email = scn.next();
            if (email.contains("@") && email.contains(".")) break;
            else System.out.println("neteisingai ivestas emailas");
        } while (true);

//        do {
        System.out.println("Iveskite balansa");
        balance = scn.nextDouble();
//        if (balance) break;
//        else System.out.println("neteisingai ivestas balansas");
//        } while (true);

        System.out.println("Iveskite kredito limita");
        int creditLimit = scn.nextInt();

        if (creditLimit > 0) {
            Account user1 = new Account(name, email, balance, creditLimit);
            System.out.println(user1.toString());
        }
        if (balance > 0 && creditLimit <= 0) {
            Account user1 = new Account(name, email, balance);
            System.out.println(user1.toString());
        }
        if (creditLimit <= 0 && balance <= 0) {
            Account user1 = new Account(name, email);
            System.out.println(user1.toString());
        }

    }
}
