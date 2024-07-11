package com.PracticeDSA;

import java.util.*;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int l = nums.length;
        int brkPnt = -1;
        int swpPnt = 0;

        //Finding the Breakpoint where nums[i] < nums[i+1]
        for (int i = l - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                brkPnt = i;
                break;
            }
        }

        if (brkPnt == -1){
            reverseArr(nums, 0, l - 1);
            System.out.println(Arrays.toString(nums));
        }
        else{
            //Swapping the nums[brkPnt] with the smallest bigger element than itself
            for (int j = l - 1; j > brkPnt; j--) {
                if (nums[j] > nums[brkPnt]) {
                    swpPnt = j;
                    break;
                }
            }
            //Swap
            int temp = nums[brkPnt];
            nums[brkPnt] = nums[swpPnt];
            nums[swpPnt] = temp;

            //Reverse the remaining array
            reverseArr(nums, brkPnt + 1, l - 1);

            System.out.println(Arrays.toString(nums));
        }
    }


    public static void reverseArr(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] testArr = new int[]{2, 3, 1};
        nextPermutation(testArr);
    }
}
