package com.apnacollege;

import java.util.Scanner;

public class Java7 {
    public static void main(String[] args) {
        final float pi = 3.14F;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        float r = sc.nextFloat();

        float a = pi * r * r;
        System.out.println("The area of the circle: ");
        System.out.println(a);
    }
}
