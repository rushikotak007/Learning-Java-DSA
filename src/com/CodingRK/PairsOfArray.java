package com.CodingRK;

public class PairsOfArray {
    public static void getPairsOfArray(int[] numArr) {
        System.out.println("All the generated pairs : ");
        for (int i = 0; i<numArr.length; i++){
            for (int j=i; j<numArr.length; j++){
                System.out.print("(" + numArr[i] + "," + numArr[j] + ")");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        getPairsOfArray(numbers);
    }
}
