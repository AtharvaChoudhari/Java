package com.apnacollege;

import java.util.Scanner;

public class Java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float a = sc.nextFloat();
        System.out.print("Enter 2nd number: ");
        float b = sc.nextFloat();
        System.out.print("Enter operation to be performed: ");
        String c = sc.next();

        switch (c) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Invalid Operation detected");
        }
    }
}
