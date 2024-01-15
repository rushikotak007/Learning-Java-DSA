package com.CodingRK;

//Pyramid of numbers

public class Pattern6 {
    public static void main(String[] args) {

        int i = 9;// Which we can take from user

        for (int a = 1; a <= i; a++) {

            //Initial spaces
            for (int b = 1; b <= (i - a); b++) {
                System.out.print(" ");
            }

            //printing (i)th number (i) times
            for (int number = 1; number <= a; number++) {
                System.out.print(a + " ");
            }
            System.out.println("");
        }
    }
}
