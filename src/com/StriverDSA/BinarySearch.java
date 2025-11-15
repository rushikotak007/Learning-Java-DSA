package com.StriverDSA;

import java.util.Arrays;

public class BinarySearch {

    static int findSqrt(int n){
        int left = 1;
        int right = n;

        while(left <= right){

            int mid = (left + right)/2;

            if(n == mid*mid){
                return mid;
            }else if( mid*mid<n && ((mid+1)*(mid+1))>n){
                return mid;
            }

            if(mid*mid > n){
                right = mid;
            }else{
                left = mid;
            }
        }

        return -1;
    }



    static int findNthRoot(int n, int r){
        int left = 1;
        int right = n;

        while(left < right){
            int mid = (left + right)/2;

            if(n == calculateNthPower(mid,r)){
                return mid;
            }
            else if(mid > calculateNthPower(n, r)){
                left = mid;
            }else{
                right = mid;
            }
        }

        return -1;
    }

    public static int peakElementInArray(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = (left + right)/2;

            if(nums[mid-1] < nums[mid] && nums[mid] < nums[mid+1]){
                return mid;
            }else if(nums[mid]>nums[mid+1]){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }

    private static int calculateNthPower(int base, int power){
        int ans = 1;
        while(power != 0){
            power--;
            ans *= base;
        }
        return ans;
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int right = Arrays.stream(piles).max().getAsInt();
        int left = 1;

        while(left < right){
            int mid = (left + right)/2;
            int totalHours = calculateHours(piles,mid);
            if(totalHours <= h ){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }

        return right;
    }

    private static int calculateHours(int[] piles, int speed){
        int ans = 0;

        for (int pile : piles) {
            ans += (int) Math.ceil((double) pile / speed);
        }

        return ans;
    }

    public static void main(String[] args){
        int[] testArr = {3,4,8,6,13};
        System.out.println(minEatingSpeed(testArr,8));
    }
}
