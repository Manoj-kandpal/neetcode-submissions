class Solution {
    public int maxProfit(int[] prices) {
        int max = -1;

        int i=0;
        int maxProfitIndex = 0;
        while (i < prices.length) {
            if (prices[i] - prices[maxProfitIndex] > max) {
                max = prices[i] - prices[maxProfitIndex];
            } else if (prices[i] - prices[maxProfitIndex] < 0) {
                maxProfitIndex = i;
            }

            i++;
        }

        return max;
    }
}
