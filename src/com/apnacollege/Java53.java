package com.apnacollege;

import java.util.Scanner;

public class Java53 {

    // Function to print the average of 3 numbers entered by the user
    public static int printAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = sc.nextInt();

        System.out.println("Average of the entered 3 numbers: " + printAverage(num1, num2, num3));
    }
}
