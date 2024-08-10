package com.PracticeDSA;

public class TrappedRainWater {
    public static int calculateTrappedRainWater(int[] heights){
        int n = heights.length;

        //find left max boundary
        int[] leftMax = new int[n];
        leftMax[0] = heights[0];
        for (int i=1; i<n; i++){
            leftMax[i] = Integer.max(leftMax[i], leftMax[i-1]);
        }

        //find right max boundary
        int[] rightMax = new int[n];
        rightMax[n-1] = heights[n-1];
        for (int i= n-2; i>=0; i--){
            rightMax[i] = Integer.max(rightMax[i], rightMax[i+1]);
        }

        int trappedWater = 0;
        //loop to find water levels
        for (int i=1; i<n; i++){
            int currentdWaterLevel = Integer.min(leftMax[i], rightMax[i]);
            //calculate trapped water for each water level by formula trapped water = water level - bar height
            int currentTrappedWater = currentdWaterLevel - heights[i];
            trappedWater += currentTrappedWater;
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int[] testArray = {5, 2,5, 2, 3};
        int ans = calculateTrappedRainWater(testArray);
        System.out.println(ans);
    }
}


