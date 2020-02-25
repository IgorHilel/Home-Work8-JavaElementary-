package com.igorberezovchuck;

import java.math.BigInteger;

/*
1) Число Фибоначи
написать метод который возвращает N-ное число фибоначи, по правилу:
F(0) = 0, F(1) = 1
F(N) = F(N - 1) + F(N - 2)
 */
public class Main {

    public static void main(String[] args) {

        int numberFib = 10;
        BigInteger result = getFibonacciNum(numberFib);
        System.out.println("Число Фибоначчи: " + result);

    }

    private static BigInteger getFibonacciNum(int numberFib) {
        if (numberFib == 0) {
            return BigInteger.valueOf(0);
        } else if (numberFib == 1) {
            return BigInteger.valueOf(1);
        }
        BigInteger leftElement = BigInteger.valueOf(0), rightElement = BigInteger.valueOf(1), temp = BigInteger.valueOf(0);
        for (int i = 1; i < numberFib; i++) {
            temp = leftElement;
            leftElement = rightElement;
            rightElement = leftElement.add(temp);
        }
        return rightElement;
    }
}
