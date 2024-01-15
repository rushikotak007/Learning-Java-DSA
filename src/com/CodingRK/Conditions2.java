package com.CodingRK;

import java.util.*;

// This is second code to understand Conditional statements

public class Conditions2 {
    public static void main(String[] args) {

        System.out.println(" Enter two numbers :\n");

        System.out.println(" Num1 : ");
        Scanner a = new Scanner(System.in);
        int num1 = a.nextInt();

        System.out.println(" Num2 : ");
        Scanner b = new Scanner(System.in);
        int num2 = b.nextInt();

        // Now we will apply conditional statements comparing these variables

        if (num1 == num2) {
            System.out.println("Both given no. are equal");
        } else if (num1 > num2) {
            System.out.println("num1 is greator than num2");
        } else if (num2 > num1) {
            System.out.println("num2 is greator than num1");
        }
    }

}
