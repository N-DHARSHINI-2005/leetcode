class Solution {
public int maxProfit(int[] prices) {
        int profit = 0;
        int bestBuy = prices[0];

        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            
            if (currentPrice > bestBuy) {
                profit = Math.max(profit, currentPrice - bestBuy);
            }
            
            bestBuy = Math.min(bestBuy, currentPrice);
        }

        return profit;
    }
};