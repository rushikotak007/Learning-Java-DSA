package com.PracticeDSA;


public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int left=0, right=arr.length-1;
        while(right > left){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                return mid;
            }
            if (arr[mid]>target) {
                right=mid-1;
            }
            if(arr[mid]<target) {
                left=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int target = 8;
        int[] arr = {2,4,6,8,10};
        System.out.println(binarySearch(arr, target));
    }
}
