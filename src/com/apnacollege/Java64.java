package com.apnacollege;

import java.util.Scanner;

public class Java64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] number = new int[size];

        System.out.println("Now, enter the inputs: ");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("The entered inputs are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(number[i]);
        }
    }
}
