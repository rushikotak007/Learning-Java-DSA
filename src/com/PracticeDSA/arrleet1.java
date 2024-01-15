package com.PracticeDSA;

//WAP to return the indices of the numbers of an array to a targeted number

public class arrleet1 {
    public static int[] sumTwo(int[] a, int b) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] + a[j] == b) {
                    return new int[]{i, j};

                }
            }
        }
        return new int[]{};
    }

    public static void main(String args[]) {

        int[] set = {1, 2, 3, 4, 5, 6, 7};
        int target = 10;
        int[] indices = sumTwo(set, target);

        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        }
    }
}
