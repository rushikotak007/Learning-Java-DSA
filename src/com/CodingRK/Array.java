package com.CodingRK;

import java.util.*;

import static java.lang.System.out;

public class Array {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] array = new int[s];

        //Taking inputs for array
        for (int i = 0; i < s; i++) {
            array[i] = sc.nextInt();
        }

        //Showing output as array members
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
