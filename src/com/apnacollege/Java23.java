package com.apnacollege;

import java.util.Scanner;

public class Java23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
