package com.apnacollege;

public class Java32 {
    public static void main(String[] args) {

        // Half Pyramid with Numbers
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


}
