package com.nhnacademy.bank;

/**
 * Account.
 */
public class Account {
    public boolean deposit(Money money) {
        System.out.println("money = " + money);
        System.out.println("hello");
        return true;
    }

    public boolean withdraw(Money money) {
        System.out.println("money = " + money);
        return true;

    }
}
