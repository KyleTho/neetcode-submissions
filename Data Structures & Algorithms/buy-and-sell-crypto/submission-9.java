class Solution {
    public int maxProfit(int[] prices) {

        int sell = 1;
        int buy = 0;
        int maxProfit = 0;
        int profit = 0;
        
        while (sell < prices.length) {

            if (prices[sell] > prices[buy]) {
                profit = prices[sell] - prices[buy];
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buy = sell;
            }
            sell++;

        }

        return maxProfit;
    }
}
