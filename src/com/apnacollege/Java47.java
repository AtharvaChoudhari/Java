package com.apnacollege;

import java.util.Scanner;

public class Java47 {

    // Function to print sum of 2 numbers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of these 2 numbers: " + sum);
    }


}
