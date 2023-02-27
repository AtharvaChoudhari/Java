package com.apnacollege;

import java.util.Scanner;

public class Java61 {
    // Function that calculates the Greatest Common Divisor of 2 numbers
    public static void greatestCommonDivisor(int num1, int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        System.out.println("GCD is: " + num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        greatestCommonDivisor(num1, num2);
    }
}
