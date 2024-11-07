package com.PracticeDSA;

import static com.CodingRK.ArrayPrint.arrayPrint;

public class RecursionPractice {
    public static int getPower(int base, int power){
        if(power==0){
            return 1;
        }
        else if(power%2==0){
            return getPower(base, power/2) * getPower(base,power/2);
        }
        else{
            return base*getPower(base, power/2) * getPower(base,power/2);
        }
    }

    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("Transfer disk "+ n +" from " + src + " to "+dest);
            return;
        }else{
            //tranferring n-1 elements into helper tower using dest as a helper
            towerOfHanoi(n-1, src, dest, helper);

            //transfer nth element from the src to destination
            System.out.println("Transfer disk "+ n +" from " + src + " to " + dest);

            ////tranferring n-1 elements into dest tower using src as a helper
            towerOfHanoi(n-1, helper, src, dest);
        }
    }

    public static void quickSort(int[] arr, int si, int ei) {

        if(si>=ei){
            return;
        }

        int pIdx = partition(arr, si, ei);
        //this Partition function will put the pivot on the right position by rearranging smaller and bigger elements than pivot around the pivot. after that it also returns the index of it.

        //Now it's time to put other elements on its place recursively so that the array gets sorted
        quickSort(arr, pIdx+1, ei);
        quickSort(arr, si, pIdx-1);
    }

    public static int partition(int[] arr, int si, int ei){

        int pivot = arr[ei];
        int i = si - 1;

        for(int j=si; j<ei; j++){
            if (arr[j]<= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;

        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    //Rotated Search Array


    public static void main(String[] args) {
//        System.out.println(getPower(2,3));
//        towerOfHanoi(3, "A", "B", "C");
        int[] testArr = {2,4,3,8,6,1};
        quickSort(testArr, 0,testArr.length-1);
        arrayPrint(testArr);
    }

}
