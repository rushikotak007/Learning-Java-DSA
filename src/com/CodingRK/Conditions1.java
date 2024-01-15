package com.CodingRK;

import java.util.*;

// Second java code to learn the conditional statements

public class Conditions1 {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age % 2 == 0) {
            System.out.println("The no. is Even.");
        } else {
            System.out.println("he no. is Odd");

        }
    }
}
