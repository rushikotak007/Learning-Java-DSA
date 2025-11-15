
package com.StriverDSA;

import java.util.*;

import static com.CodingRK.ArrayPrint.arrayPrint;

public class ArrayEasy {
    public static int largest(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static boolean isSortedArray(int[] arr) {
        boolean result = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int value : arr) {
            set.add(value);
        }

        int k = set.size();
        int j = 0;

        for (int x : set) {
            arr[j++] = x;
        }

        return k;
    }

    public static void rotateByOne(int[] nums) {

//        storing the starting element
        int temp = nums[0];

//        Shifting every element by one position
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

//        Assigning the first element to the last element
        nums[(nums.length - 1)] = temp;
    }

    public static void rotateByKElements(int[] nums, int k, String direction) {
        int pivot = 0;

        if (direction.equals("right")) {
            pivot = nums.length - k;
        } else if (direction.equals("left")) {
            pivot = k;
        } else {
            System.out.println("Invalid direction");
            return;
        }

        int[] temp = new int[pivot];

        // Store first 'pivot' elements
        for (int i = 0; i < pivot; i++) {
            temp[i] = nums[i];
        }

        // Shift rest of the array to the front
        for (int i = 0; i < nums.length - pivot; i++) {
            nums[i] = nums[i + pivot];
        }

        // Copy temp elements to the end
        for (int i = 0; i < pivot; i++) {
            nums[nums.length - pivot + i] = temp[i];
        }
    }

    public static void moveZeroToEnd(int[] nums) {

        //Brute Force
//        int[] temp = new int[nums.length];
//        int counter = 0;
//
//        for (int i = 0; i <nums.length; i++) {
//            if (nums[i]!=0){
//                temp[counter] = nums[i];
//                counter++;
//            }
//        }
//
//        for (int i =0; i< nums.length; i++) {
//            nums[i]=temp[i];
//        }

        //Optimal (Two Pointer)
        if (nums.length == 1) {
            return;
        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }
    }


//    public static int getLongestSubarraySum(int[] nums, int k){
//     It was using hashMap
//        long sum = 0;
//        int maxLen=0;
//
//        HashMap<Long, Integer> prefixSumMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length ; i++) {
//
//            //updating the current sum to store in HashMap
//            sum += nums[i];
//
//            //If sum is = k then store the length if it is greater than maxLen
//            if(sum==k){
//                maxLen = Math.max(maxLen, i+1);
//            }
//
//            //Till now we checked for the subarrays starting from index 0 now for other arrays
//            long rem = sum-k;
//
//            //In order to get the sum of subArray as k we estimated the sum of remaining elements and by memorising its position through hashMap
//            if(prefixSumMap.containsKey(rem)){
//                int length = i - prefixSumMap.get(rem);
//                maxLen = Math.max(maxLen, length);
//            }
//
//            prefixSumMap.putIfAbsent(sum, i);
//
//        }
//
//        return maxLen;
//    }

    //    Using two pointer
    public static int getLongestSubarraySum(int[] nums, int k) {

        int maxLen = 0;
        int left = 0; //Left Pointer
        int right = 0; // Right Pointer
        int sum = nums[0];

        while (right < nums.length) {

            while (left < nums.length && sum > k) {
                sum -= nums[left];
                left++;
            }
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            right++;
            if (right < nums.length) {
                sum += nums[right];
            }


        }

        return maxLen;
    }

    //This is with using binary search method in which we have to find the element's index from which it starts using greator than the target
    public static int findLowerBound(int[] nums, int x) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= x) {
                right = mid - 1;
                if (nums[mid] <= nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                    return mid;
                }
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void floorAndCeil(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int floor = -1;
        int ciel = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                floor = mid;
                ciel = mid;
            }

            if (nums[mid] > target) {
                right = mid - 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        System.out.println("Floor is : " + floor);
        System.out.println("Ciel is : " + ciel);
    }

    public static int firstOccurance(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static int lastOccurance(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    //We are testing dutch flad algorithm to sort an array consisting of 0s, 1s and 2s.
    public static void dutchFlagAlgo(int[] nums) {
        //Dutch Flag Algorithm is consisting of three pointer low, mid and high which are arranged in such a way that all the three values get sorted. Note: it is also a condition that it can be used only when three values
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 2) {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            }
        }
    }

    public static int howManyRotation(int[] nums) {
        int idx = 0;
        int lowest = Integer.MAX_VALUE;

        int left = 0;
        int right = nums.length - 1;


        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] < lowest) {
                idx = mid;
                lowest = nums[mid];
            }

            if (nums[mid] <= nums[right]) {
                right = mid - 1;  // min could be at mid or left side
            } else {
                left = mid + 1;   // min is in right half
            }
        }

        return idx;
    }

    public static void findLeaders(int[] nums){
        int max = Integer.MIN_VALUE;

        for(int i = nums.length -1; i>=0; i-- ){
            if(nums[i]>max){
                max = nums[i];
                System.out.println(max);
            }
        }
    }

    public int longestConsecutive(int[] nums) {

        Arrays.sort(nums);

        int left = 0;
        int count = 1;
        int max = 1;

        for(int i=0; i<nums.length-1; i++){
            if(nums[left] != nums[left+1]-1){
                count = 1;
            }else if(nums[left]==nums[left+1]){
                count++;
            }
            left++;
            max = Math.max(count, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] testArr = {4,5,6,7,1,3};
        System.out.println(howManyRotation(testArr));
    }
}

