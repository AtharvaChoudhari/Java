package com.apnacollege;

import java.util.Scanner;

public class Java66 {
    public static void main(String[] args) {

        // Take an array of names as input from the user and print them on the screen
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of names need to input: ");
        int size = sc.nextInt();
        String[] name = new String[size];

        System.out.println("Enter the names: ");
        for (int i = 0; i < size; i++) {
            name[i] = sc.next();
        }

        System.out.println("The entered names are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(name[i]);
        }
    }
}
