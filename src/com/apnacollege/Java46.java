package com.apnacollege;

import java.util.Scanner;

public class Java46 {
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);
    }
}
