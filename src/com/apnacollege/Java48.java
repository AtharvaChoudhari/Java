package com.apnacollege;

import java.util.Scanner;

public class Java48 {

    // Function to print product of 2 numbers
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of these 2 numbers: " + calculateProduct(a, b));
    }
}
