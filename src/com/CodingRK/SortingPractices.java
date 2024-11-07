package com.CodingRK;

import java.util.Arrays;

import static com.CodingRK.ArrayPrint.arrayPrint;

public class SortingPractices {

    //Bubble Sort
    //Comparing the adjacenet elements and shifting the largest element to the rightmost position.
    public static void bubbleSort(int[] inputArr){
        for (int i=0; i<inputArr.length; i++){
            for (int j=i+1; j<inputArr.length; j++){
                if (inputArr[i] > inputArr[j]){
                    //swapping larger element to right side
                    int temp = inputArr[i];
                    inputArr[i] = inputArr [j];
                    inputArr[j] = temp;
                }
            }
        }
    }

    //Selection Sort
    public static void selectionSort(int[] inputArr){
        for (int i=0; i< inputArr.length-1; i++){
            int minPosition = i;
            for (int j= i+1; j<inputArr.length; j++){
                if (inputArr[minPosition] < inputArr[j]){
                    //rather than swapping it with every element we will store/remember its position in
                    //minPosition variable and swap it single time outside the loop
                    minPosition=j;
                }
            }
            //swapping
            int temp = inputArr[minPosition];
            inputArr[minPosition] = inputArr[i];
            inputArr[i] = temp;
        }
    }

    //instertion sort :- basically we have two parts one is sorted one which is on left side and another is unsorted
    //we find right place in first loop and in the second nested loop(while loop) we insert it in the right place by shifting all
    //other elements.
    public static void insertionSort(int[] inputArr) {
        for (int i=1; i<inputArr.length; i++ ){
            int curr = inputArr[i];
            System.out.println(curr);
            int prevIndex = i-1;
            //finding the right position for current element
            while (prevIndex >= 0 && inputArr[prevIndex]>curr){
                inputArr[prevIndex+1] = inputArr[prevIndex];
                prevIndex--;
            }
            inputArr[prevIndex+1] = curr;
        }
    }

    //counting sort :- defines a range for elements in array and then counts the repition of that element and prinsts it
    // as per the repeated numbers
    public static void countingSort(int[] inputArr){
        //finding the max range (works with positive values only)
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<inputArr.length; i++){
            largest = Integer.max(largest, inputArr[i]);
        }

        //increasing the elements of count array
        int[] count = new int[largest+1];
        for (int i=0; i< inputArr.length; i++){
            count[inputArr[i]]++;
        }

        //sorting the elements in an array
        int currentCounter=0;
        for (int i=0; i<count.length; i++){
            while(count[i]>0){
                inputArr[currentCounter] = i;
                currentCounter++;
                count[i]--;
            }
        }
    }

    public static void mergeSort(int[] arr, int si, int ei){

        if(si>=ei){
            return;
        }

        //Recursion call
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid); //Left sort
        mergeSort(arr, mid+1, ei); //Right sort
        merge(arr, si, mid, ei);

    }

    public static void merge(int[] arr, int si, int mid, int ei){
        int temp[] = new int[ei - si + 1];

        int i = si; //iterator for left array
        int j = mid+1; //iterator for right array
        int k = 0; //iterator for temp array

        while( i<= mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //Left part
        while( i <= mid){
            temp[k++]= arr[i++];
        }
 
        //Right part
        while( j <= ei){
            temp[k++]= arr[j++];
        }

        //Copying the temp array to original one
        for(int x=0; x<temp.length; x++){
            arr[si+x] = temp[x];
        }

    }

    public static void main(String[] args) {
        int[] testArr = {6,2,5,4,1,3};
        mergeSort(testArr,0, testArr.length-1);
        arrayPrint(testArr);
    }
}
