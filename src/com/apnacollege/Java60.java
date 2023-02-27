package com.apnacollege;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Java60 {

    // Function to find the value of one number raised to the power of another,
    // if two numbers are entered by the user, x and n.
    public static int xPowerN(int x, int n) {
        int exp = 1;
        for (int i = 1; i <= n; i++) {
            exp = exp * x;
        }
        return exp;
//        return (int) pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();

        System.out.println(x + " raised to the power " + n + " = " + xPowerN(x, n));
    }
}
