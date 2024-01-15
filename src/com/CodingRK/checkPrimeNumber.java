package com.CodingRK;

import java.util.*;

public class checkPrimeNumber {
    public static void main(String args[]) {

        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        for (int a = 2; a <= i; a++) {
            if ((i % a) == 0) {
                System.out.println("The number is not a prime no.");
            } else if (i == 1) {
                System.out.println("The number is Unique");
            } else {
                System.out.println("The number is Prime");
            }
        }

    }
}
