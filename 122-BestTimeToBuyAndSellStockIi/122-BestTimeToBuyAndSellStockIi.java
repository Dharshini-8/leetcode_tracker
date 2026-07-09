// Last updated: 7/9/2026, 9:28:05 AM
class Solution {
    //test
    public int maxProfit(int[] prices) {
    
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {
                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}