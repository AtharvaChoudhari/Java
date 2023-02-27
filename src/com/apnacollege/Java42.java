package com.apnacollege;

public class Java42 {
    public static void main(String[] args) {

        // Hollow Rhombus
        int n = 5;
        int m = 9;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= m; j++) {
                if (i + j == n + 1 || i + j == m + 1 || (i == 1 && j >= n) || (i == n && j <= m - 5)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
