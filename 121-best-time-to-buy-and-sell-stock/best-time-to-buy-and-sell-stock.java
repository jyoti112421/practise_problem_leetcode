class Solution {
    public int maxProfit(int[] prices) {
        int buyprice = Integer.MAX_VALUE; // Initialize buyprice to a large value
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyprice) {
                buyprice = prices[i]; // Update buyprice to the minimum value
            } else {
                int current_profit = prices[i] - buyprice;
                profit = Math.max(current_profit, profit);
            }
        }
        return profit;
    }
}
