package com.practice.geeksforgeeks.array;

public class BuySellStock2 {
    public int maxProfit(int[] prices) {
        // code here
        int buy = prices[0], sell = -1;
        int output = 0;
        int n = prices.length;
        for(int i = 1; i < n; i++) {
            if(prices[i] < buy) {
                buy = prices[i];
            } else {
                output += (prices[i] - buy);
                buy = prices[i];
            }
        }
        return output;
    }
}
