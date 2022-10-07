package com.nhnacademy.bank;


import java.math.BigDecimal;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
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

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in); 
        System.out.println("첫번째 인자 입력: ");
        int test1 = scanner.nextInt();

        System.out.println("두번째 인자 입력: ");
        int test2 = scanner.nextInt();

        int add = calculator.add(test1, test2);
        System.out.println("add = " + add);

        int sub = calculator.sub(test1, test2);
        System.out.println("sub = " + sub);

        int multiple = calculator.multiple(test1, test2);
        System.out.println("multiple = " + multiple);

        int divide = calculator.divide(test1, test2);

        System.out.println("divide 2 아니고 1 = " + divide);
        
        scanner.close();

        int mul_div = calculator.multiple(add, sub);
        System.out.println("mul_div = " + mul_div);

    }

    static class Calculator{
        public int add(int num1, int num2) {
            return num1 + num2;
        }

        public int sub(int num1, int num2) {
            System.out.println(num1 - num2);
            return num1 - num2;
        }

        public int multiple(int num1, int num2) {
            System.out.println(num1 * num2);
            return num1 * num2;
        }

        public int divide(int num1, int num2) {
            if (num2 == 0) {
                throw new ArithmeticException("divide by zero");
            }
            return num1 / num2;
        }

        //TODO impl divide
    }
}
