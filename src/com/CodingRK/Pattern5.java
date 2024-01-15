package com.CodingRK;

public class Pattern5 {
    public static void main(String args[]) {

        int i = 7;

        for (int a = 0; a <= i; a++) {

            //Spaces
            for (int b = (i - a); b >= 1; b--) {
                System.out.print(" ");
            }

            //Required Shape
            for (int c = 1; c <= i; c++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
