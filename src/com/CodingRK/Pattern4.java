package com.CodingRK;

//This pattern is called butterfly pattern

public class Pattern4 {
    public static void main(String args[]) {

        int i = 4;//Input which we want to take from user

        for (int a = 1; a <= i; a++) {

            for (int fs = 1; fs <= a; fs++) {
                System.out.print("*");
            }

            int d = 2 * (i - a);
            for (int ms = 1; ms <= d; ms++) {
                System.out.print(" ");
            }

            for (int ls = 1; ls <= a; ls++) {
                System.out.print("*");
            }
            System.out.println("");
        }// Upper Half Completed

        for (int a = i; a >= 1; a--) {

            for (int fs = 1; fs <= a; fs++) {
                System.out.print("*");
            }

            int d = 2 * (i - a);
            for (int ms = 1; ms <= d; ms++) {
                System.out.print(" ");
            }

            for (int ls = 1; ls <= a; ls++) {
                System.out.print("*");
            }
            System.out.println("");
        }// Upper Half Completed

    }
}

