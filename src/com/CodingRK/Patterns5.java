package com.CodingRK;

//In this code we will print diamond pattern

public class Patterns5 {
    public static void main(String args[]) {

        int input = 4;

        //1st outer loop to print upper half pattern
        for (int a = 1; a <= input; a++) {

            //Spaces with inner loop
            for (int b = 1; b <= (input - a); b = b + 1) {
                System.out.print(" ");
            }

            //Stars in Upper Triangle
            for (int b = 1; b <= (2 * a - 1); b = b + 1) {
                System.out.print("*");
            }
            System.out.println();
        }//First half completed

        //2nd outer loop to print lower half pattern
        for (int a = input; a >= 1; a--) {

            //Spaces with inner loop
            for (int b = 1; b <= (input - a); b = b + 1) {
                System.out.print(" ");
            }

            //Stars in Upper Triangle
            for (int b = 1; b <= (2 * a - 1); b = b + 1) {
                System.out.print("*");
            }
            System.out.println();
        }//First half completed

    }
}
