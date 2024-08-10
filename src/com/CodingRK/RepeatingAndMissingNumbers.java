package com.CodingRK;

public class RepeatingAndMissingNumbers {
    public int[] findRepeatingAndMissingNumbers(final int[] nums){
        int[] countArr = new int[nums.length + 1];

        for (int i=0; i<nums.length; i++){
            countArr[nums[i]]++;
        }

        int repeating = -1, missing = -1;
        for (int i=1; i<countArr.length; i++){
            if (countArr[i]==2){
                repeating = i;
            } else if (countArr[i]==0) {
                missing = i;
            }
            if (repeating != -1 && missing!= -1){
                break;
            }
        }

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        
    }
}
