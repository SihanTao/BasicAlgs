package DynamicProgramming.Q3;

public class Solution {
  public int maxSubArray(int[] nums) {
    int[] results = new int[nums.length];
    results[0] = nums[0];
    int result = results[0];
    for (int i = 1; i < nums.length; i++) {
      results[i] = Math.max(results[i - 1] + nums[i], nums[i]);
      if (results[i] > result) {
        result = results[i];
      }
    }
    return result;
  }
}
