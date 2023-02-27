package com.apnacollege;

public class Java41 {
    public static void main(String[] args) {

        // Hollow Butterfly
        int n = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == j || i + j == 11) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
