package com.epam.courses;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        Scanner scanner = new Scanner(System.in);
        long firstNumber = scanner.nextLong();

        System.out.println("Enter second number: ");
        long secondNumber = scanner.nextLong();

        System.out.println(gcd(Math.abs(firstNumber), Math.abs(secondNumber)));

    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        if (a == 0) return b;

        if ((a & 1) == 0 && (b & 1) == 0) return gcd(a >> 1, b >> 1) << 1;

        else if ((a & 1) == 0) return gcd(a >> 1, b);

        else if ((b & 1) == 0) return gcd(a, b >> 1);

        else if (a >= b) return gcd((a-b) >> 1, b);

        else return gcd(a, (b-a) >> 1);
    }
}
