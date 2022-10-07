package com.nhnacademy.bank;


import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

public class RestApi {
    public boolean postAmount(Action action, Long accountNumber, BigDecimal amount ){

        Account account = new Account();

        if(action == Action.DEPOSIT){
            return account.deposit(new Money(amount, Currency.getInstance(Locale.US)));
        }else{
            return account.withdraw(new Money(amount, Currency.getInstance(Locale.US)));
        }
    }
}
