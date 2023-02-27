package com.apnacollege;

import java.util.Scanner;

public class Java51 {

    // Function to check if a given number is even or odd
    public static void checkEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is an Even Number");
        } else {
            System.out.println(n + " is not an Even Number (Odd Number)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check for even or odd: ");
        int n = sc.nextInt();

        checkEven(n);
    }
}
