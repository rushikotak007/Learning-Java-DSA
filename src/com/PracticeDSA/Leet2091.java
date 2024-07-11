package com.PracticeDSA;

public class Leet2091 {
    public int maxNoOfDeletions(int[] inputArr){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        int minIndex = 0;
        int maxIndex = 0;
        for(int i=0; i<inputArr.length; i++){
            if(inputArr[i]<min){
                min = inputArr[i];
                minIndex = i;
            }
            if (inputArr[i]>max){
                max = inputArr[i];
                maxIndex = i;
            }
        }

        //Case-1 : Checking the number of elements to be removed from front
        int Front = Math.max(minIndex, maxIndex)+1;

        //Case-2 : Checking the number of elements to be removed from Back
        int Back = inputArr.length - Math.min(minIndex,maxIndex);

        //Case-3 : Removing from both the ends
        // front elemeents removal + rear elements removal
        // Math.min(minIndex,maxIndex) + inputArr.length - Math.max(minIndex, maxIndex)
        int BothSide = Math.min(minIndex,maxIndex) + inputArr.length - Math.max(minIndex, maxIndex);

        return Math.min( Math.min(Front, Back ),BothSide);
    }

}
