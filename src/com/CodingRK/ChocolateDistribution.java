package com.CodingRK;

import java.util.Arrays;

public class ChocolateDistribution {

    public static int distributeChoc(int[] inputArr, int m) {
        // Edge cases
        if (m == 0 || inputArr.length == 0) {
            return 0;
        }
        if (inputArr.length < m) {
            return -1; // Not enough packets to distribute
        }

        int currDiff = Integer.MAX_VALUE;
        Arrays.sort(inputArr);
        for (int i = 0; i <= inputArr.length - m; i++) {
            int diff = inputArr[i + m - 1] - inputArr[i];
            if (diff < currDiff) {
                currDiff = diff;
            }
        }
        return currDiff;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{4, 2, 12, 45, 9, 15, 10};
        int m = 4; // Number of students
        int result = distributeChoc(testArr, m);
        if (result != -1) {
            System.out.println("The minimum difference is " + result);
        } else {
            System.out.println("Not enough packets to distribute.");
        }
    }
}
