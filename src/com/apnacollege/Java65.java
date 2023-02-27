package com.apnacollege;

import java.util.Scanner;

public class Java65 {
    public static void main(String[] args) {

        // Take an array as input from the user.
        // Search for a given number x and print the index at which it occurs

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in an array: ");
        int size = sc.nextInt();
        int[] num = new int[size];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }

        System.out.print("Enter the number you want to search: ");
        int x = sc.nextInt();

        for (int i = 0; i < num.length; i++) {
            if (num[i] == x) {
                System.out.println("Number " + x + " appeared at index: " + i);
            }
        }


    }
}
