package com.PracticeDSA;
//WAP to move all the zeros of an array at the end of it.

public class arr2 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 0, 0, 3, 4, 5, 0, 6};
        System.out.print("initially array was : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println("\n");

        int position = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[position] = arr[i];
                position++;
            }
        }

        while (position < arr.length) {
            arr[position++] = 0;
        }
        System.out.print("now the array is :");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
