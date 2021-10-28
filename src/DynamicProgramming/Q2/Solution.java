package DynamicProgramming.Q2;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        int indexOfMin;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                indexOfMin = i;
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(prices[i] - minPrice, maxProfit);
            }
        }
        return maxProfit;
    }
}
