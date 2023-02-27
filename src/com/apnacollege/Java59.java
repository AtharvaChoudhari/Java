package com.apnacollege;

import java.util.Scanner;

public class Java59 {
    public static void main(String[] args) {

        // Program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1 to continue & 0 to stop: ");
        int input = sc.nextInt();

        int positive = 0;
        int negative = 0;
        int zero = 0;

        while (input == 1) {
            System.out.print("Enter your preferred number: ");
            int num = sc.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.print("Enter 1 to continue & 0 to stop: ");
            input = sc.nextInt();
        }
        System.out.println("Number of Positive Numbers: " + positive);
        System.out.println("Number of Negative Numbers: " + negative);
        System.out.println("Number of Zeros: " + zero);
    }
}