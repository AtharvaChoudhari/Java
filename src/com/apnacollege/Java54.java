package com.apnacollege;

import java.util.Scanner;

public class Java54 {

    // Function to print the sum of all odd numbers from 1 to n
    public static int printSumOdd(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to print the sum of all odd numbers from 1 to the specified number: ");
        int n = sc.nextInt();

        System.out.println("The sum of all odd numbers b/w 1 to " + n + " is: " + printSumOdd(n));
    }
}
