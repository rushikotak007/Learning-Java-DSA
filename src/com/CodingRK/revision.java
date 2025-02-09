package com.CodingRK;

import java.util.*;

public class revision {

    public static void printN(int n, int iterator) {
        if (n < iterator) return;

        System.out.println(iterator);

        printN(n,iterator+1);
    }

    public static void reverseArray(int[] arr, int iterator){
        if (iterator>arr.length){
            return;
        }

        int temp = arr[iterator];
        arr[iterator] = arr[arr.length-iterator];
        arr[arr.length-iterator] = temp;

        reverseArray(arr, iterator+1);
    }

    public static void main(String[] args) {
        int[] temp = new int[]{1,2,3,4,5,6};
        reverseArray(temp,1);
    }
}
