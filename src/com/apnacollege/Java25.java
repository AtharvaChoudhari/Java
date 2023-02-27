package com.apnacollege;

import java.util.Scanner;

public class Java25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b;

        do {
            System.out.println("Enter marks: ");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) {
                System.out.println("This is Good");
            } else if (marks <= 89 && marks >= 60) {
                System.out.println("This is also Good");
            } else if (marks <= 59 && marks >= 0) {
                System.out.println("This is Good as well");
            } else {
                System.out.println("Invalid number");
            }
            System.out.print("Enter 1 to enter marks / Enter 0 to stop: ");
            b = sc.nextInt();
        } while (b == 1);
    }
}
