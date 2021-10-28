package Array.Q3;

public class Solution {
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    int index = nums.length - k;
    int[] result = new int[nums.length];
    for (int i = 0; i < k; i++) {
      result[i] = nums[index + i];
    }

    for (int i = k; i < nums.length; i++) {
      result[i] = nums[i - k];
    }

    System.arraycopy(result, 0, nums, 0, nums.length);
  }
}
