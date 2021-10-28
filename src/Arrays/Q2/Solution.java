package Arrays.Q2;

public class Solution {
  public int maxProfit(int[] prices) {
    int[][] profits = new int[2][prices.length];
    profits[0][0] = 0;
    profits[1][0] = - prices[0];
    int n = prices.length;
    for (int i = 1; i < n; i++) {
      profits[0][i] = Math.max(profits[1][i - 1] + prices[i], profits[0][i - 1]);
      profits[1][i] = Math.max(profits[1][i - 1], profits[0][i - 1] - prices[i]);
    }

    return profits[0][n - 1];
  }
}
