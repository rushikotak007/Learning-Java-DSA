package com.CodingRK;

public class SubArrays {
    public static void getSubArrays(int[] arr) {
        //outermost loop with starter value
        for (int i = 0; i< arr.length; i++ ){
            //middle loop for setting end value for each subArray
            for(int j=i; j<arr.length; j++){
                System.out.print("[");
                //innermost loop for printing elements in an array
                for (int k=i; k<j+1; k++ ){
                    System.out.print(arr[k]);
                    if (k!=j){
                        System.out.print(",");
                    }
                }
                System.out.print("],  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] testArray = {2,4,6,8,10};
        getSubArrays(testArray);
    }
}
