package com.apnacollege;

public class Java45 {
    public static void main(String[] args) {

        // Inverted Half Pyramid
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
