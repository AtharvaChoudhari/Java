package com.apnacollege;

import java.util.Scanner;

public class Java49 {

    // Function to calculate the factorial of a number
    public static void calculateFactorial(int n) {

        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }

        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of the entered number: " + factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        calculateFactorial(n);
    }
}
