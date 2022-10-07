package com.nhnacademy.bank;


import java.math.BigDecimal;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
/**
 * Application class, entry point.
 */
public class Application {
    private static final Long ACCOUNT_NUMBER = 123L;

    /**
     * entry point main method.
     *
     * @param args System variable.
     */
    public static void main(String[] args) { //진입점 : 엔트리 포인트
        var atm = new Atm();
        boolean deposit = atm.deposit(BigDecimal.valueOf(100.1),
                ACCOUNT_NUMBER);

        System.out.println("################################################");
        System.out.println("배수한");
        System.out.println("################################################");

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        map.put(5, "e");

        Gson gson = new Gson();
        String json = gson.toJson(map);

        System.out.println("json = " + json);
    }
}
