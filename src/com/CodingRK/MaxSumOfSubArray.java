package com.CodingRK;

public class MaxSumOfSubArray {
    public static int getMaxSumOfSubArrayBrute(int[] inputArr) {

        int currentArrSum = 0;
        int maxArrSum = Integer.MIN_VALUE;

        //outermost loop with starter value
        for (int i = 0; i< inputArr.length; i++ ){
            //middle loop for setting end value for each subArray
            for(int j=i; j<inputArr.length; j++){
                //innermost loop for printing elements in an array
                for (int k=i; k<j+1; k++ ){
//                    System.out.print(inputArr[k]);
                    currentArrSum += inputArr[k];
                }
                if(currentArrSum > maxArrSum){
                    maxArrSum=currentArrSum;
                }
                currentArrSum=0;
            }
        }
        return maxArrSum;
    }

    public static int getMaxSumOfSubArrayBetter(int[] inputArr) {
        int maxArrSum= Integer.MIN_VALUE;
        int[] prefixSum = new int[5];
        int currentSum =0;
        for(int i=0; i<inputArr.length; i++ ){
            currentSum +=  inputArr[i];
            prefixSum[i] = currentSum;
        }
        //printing prefix array
        for (int i=0; i<prefixSum.length; i++){
            System.out.print(prefixSum[i] + " ");
        }
        System.out.println();

        for (int i=0; i<prefixSum.length; i++){
            for(int j=i; j<prefixSum.length; j++){
                currentSum= prefixSum[j] - prefixSum[i];
                if(currentSum>maxArrSum){
                    maxArrSum= currentSum;
                }
            }
        }

        return maxArrSum;
    }

    public static int getMaxSumOfSubarrayKaddane(int[] inputArr) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i= 0; i< inputArr.length; i++){
            currentSum += inputArr[i];
            if (currentSum < 0){
                currentSum=0;
            }
            if ( currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return  maxSum;
    }

    public static void main(String[] args) {
        int[] testArray = {-2,4,-6,8,10};
        System.out.println(getMaxSumOfSubarrayKaddane(testArray));
    }
}
