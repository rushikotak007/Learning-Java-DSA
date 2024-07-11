package com.CodingRK;

public class KthLargestElement {
    static void justTrying(int[] nums){
        int left = 0, right = nums.length-1;
        int mid = (left + (right-left)) / 2;

        System.out.println(mid);
    }

    static int partition(int[] nums, int left, int right){
        int pivot = nums[left];
        int l = left + 1;
        int r = right;

        while (l <= r) {
            if (nums[l] < pivot && nums[r] > pivot) {
                swap(nums, l, r);
                l++;
                r--;
            }
            if (nums[l] >= pivot) {
                l++;
            }
            if (nums[r] <= pivot) {
                r--;
            }
        }

        swap(nums, left, r);
        return r;
    }

    static int kthLargestElement(int[] nums, int k){
        int left = 0, right = nums.length - 1, kth = 0;

        while (true) {
            int idx = partition(nums, left, right);
            if (idx == nums.length - k) {
                kth = nums[idx];
                break;
            } else if (idx < nums.length - k) {
                left = idx + 1;
            } else {
                right = idx - 1;
            }
        }
        return kth;
    }

    static void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{3, 4, 5, 1,7};
//        System.out.println(kthLargestElement(testArr, 2));  // Should print 5
        justTrying(testArr);
    }
}
