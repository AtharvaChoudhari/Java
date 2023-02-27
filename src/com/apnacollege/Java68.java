package com.apnacollege;

import java.util.Scanner;

public class Java68 {
    public static void main(String[] args) {

        // Take an array of numbers as input and check if it is an array sorted in ascending order
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted in ascending order");
        }
    }
}
