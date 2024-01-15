package com.CodingRK;

import java.util.*;

//In this progeamme we will execute pallindromic numbers pattern

public class Patterns4 {
    public static void main(String args[]) {

        System.out.println("Enter a number :");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int a = 1; a <= input; a++) {

            //Initial Spaces
            for (int b = 1; b <= (input - a); b++) {
                System.out.print(" ");
            }

            //First half numbers till 1
            for (int b = a; b >= 1; b--) {
                System.out.print(b);
            }

            //Second half numbers having forward loop
            for (int b = 2; b <= a; b++) {
                System.out.print(b);
            }


            System.out.println();
        }//External nested loop ended

    }
}
