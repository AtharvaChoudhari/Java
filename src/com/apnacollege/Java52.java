package com.apnacollege;

import java.util.Scanner;

public class Java52 {

    // Function to print the table of a given number
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to print the table: ");
        int n = sc.nextInt();

        printTable(n);
    }
}
