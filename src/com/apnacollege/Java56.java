package com.apnacollege;

import java.util.Scanner;

public class Java56 {

    // Function to print Circumference of a circle that takes radius as an input
    public static double getCircumference(double r) {
        return 2 * 3.14 * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double r = sc.nextDouble();

        System.out.println(getCircumference(r));
    }
}
