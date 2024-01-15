package com.CodingRK;

import java.util.*;

public class Lec7Que1 {

    public static int calculateSum(int a, int b) {
        int c = a + b;
        System.out.println(c);
        return c;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 1st no. :");
        int a = sc.nextInt();
        System.out.println("Enter the value of 2nd no. :");
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
    }

}
