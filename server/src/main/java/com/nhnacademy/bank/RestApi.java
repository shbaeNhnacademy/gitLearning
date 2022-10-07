package com.nhnacademy.bank;


import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class RestApi {
    public boolean postAmount(Action action, Long accountNumber, BigDecimal amount ){

        Account account = new Account();

        if(action == Action.DEPOSIT){
            System.out.println("예금");
            return account.deposit(new Money(amount, Currency.getInstance(Locale.US)));
        }else{
            System.out.println("출금");
            return account.withdraw(new Money(amount, Currency.getInstance(Locale.US)));
        }
    }
}
