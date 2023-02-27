package com.apnacollege;

import java.util.Scanner;

public class Java57 {

    // Function that takes in age as input and returns if that person is eligible to vote or not.
    // A person of age > 18 is eligible to vote.
    public static void isEligible(int age) {
        if (age > 18) {
            System.out.println("You can vote");
        } else {
            System.out.println("You cannot vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age to check if you are eligible to vote: ");
        int age = sc.nextInt();

        isEligible(age);
    }
}
