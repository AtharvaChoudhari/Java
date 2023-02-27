package com.apnacollege;

public class Java34 {
    public static void main(String[] args) {

        // Floyd's Triangle
        int n = 5;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}
