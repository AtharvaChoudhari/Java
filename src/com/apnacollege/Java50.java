package com.apnacollege;

import java.util.Scanner;

public class Java50 {

    // Function to check if a number is prime or not
    public static void checkPrime(int n) {
        int m = n / 2;
        boolean isPrime = true;

        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a Prime Number");
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(n + " is a Prime Number");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check for prime: ");
        int n = sc.nextInt();

        checkPrime(n);
    }
}
