package com.PracticeDSA;

public class arrleet3 {

    public static int[] noOfSubseq(int[] arr, int target) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] <= target) {
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 10;

        int[] result = noOfSubseq(arr, target);

    }
}
