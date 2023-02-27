package com.apnacollege;

import java.util.Scanner;

public class Java67 {
    public static void main(String[] args) {

        // Print the maximum & minimum number in an array of integers
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements needed in array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the numbers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        System.out.println("Maximum number entered in array: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Largest number in array: " + max);
        System.out.println("Smallest number in array: " + min);
    }
}
