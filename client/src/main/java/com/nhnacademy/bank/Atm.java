package com.nhnacademy.bank;

import java.math.BigDecimal;

public class Atm {
    public boolean deposit(BigDecimal amount, Long accountNumber) {
        var restApi = new RestApi();
        return restApi.postAmount(Action.DEPOSIT, accountNumber, amount);
    }

    public boolean withDraw(BigDecimal amount, Long accountNumber) {

        var restApi = new RestApi();
        return restApi.postAmount(Action.WITHDRAW, accountNumber, amount);

    }
}
