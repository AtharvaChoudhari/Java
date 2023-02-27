package com.apnacollege;

import java.util.Scanner;

public class Java26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check for prime: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        int m = n / 2;

        if (n == 0 || n == 1) {
            System.out.println("Not a Prime");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println("Not a Prime");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Prime");
            }
        }
    }
}

