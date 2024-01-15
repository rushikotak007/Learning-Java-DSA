package com.PracticeDSA;

import java.util.*;

public class arr1 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 14, 15, 18, 29, 30};

        int x = 3;
        int y = 2;
        int z = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                x = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > y && arr[i] < x) {
                y = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > z && arr[i] < y) {
                z = arr[i];
            }
        }

        System.out.println(x + "\n" + y + "\n" + z);
    }
}
