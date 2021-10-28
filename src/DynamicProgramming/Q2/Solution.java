package DynamicProgramming.Q2;

public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else {
                maxProfit = Math.max(price - minPrice, maxProfit);
            }
        }
        return maxProfit;
    }
}
