package com.CodingRK;

public class HashingPractice {
    public static void countANumber(int[] inputArr) {
        int max = 0;
        for (int i : inputArr) {
            if (i > max) {
                max = i;
            }
        }

        int[] hashArray = new int[max+1];

        for ( int j : inputArr){
            hashArray[j] += 1;
        }

        for( int k=0; k<hashArray.length; k++){
            if(hashArray[k]!=0){
                System.out.println("Frequency of "+ k + " is "+ hashArray[k]);
            }
        }

    }
    public static void main(String[] args) {
        int[] testArray = {2,2,4,2,6,8,6,9};
        countANumber(testArray);
    }
}
