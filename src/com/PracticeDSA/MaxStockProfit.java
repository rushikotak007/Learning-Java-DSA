package com.PracticeDSA;

public class MaxStockProfit {
    public static int calculateMaxStockProfit(int[] prices) {
        int leastBuyPrice = prices[0];
        int maxProfit = 0;
        int currentBuyPoint;
        for (int i=0; i<prices.length; i++){
            currentBuyPoint = prices[i];
            if (currentBuyPoint<leastBuyPrice){
                leastBuyPrice = currentBuyPoint;
            }
            int currentProfit = currentBuyPoint - leastBuyPrice;
            if (maxProfit<currentProfit){
                maxProfit= currentProfit;
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int[] testArray = {3,4,5,6,3,8};
        System.out.println(calculateMaxStockProfit(testArray));
    }
}
