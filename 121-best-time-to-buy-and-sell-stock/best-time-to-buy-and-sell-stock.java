class Solution {
    public int maxProfit(int[] prices) {

        int min = prices[0];
        int n = prices.length;
        int profit = 0;

        for (int i = 1; i < n; i++) {
            int cost = prices[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, prices[i]);
        }
        return profit ;
    }
}