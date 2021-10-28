package Arrays.Q3;

public class Solution {
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    int index = nums.length - k;
    int[] result = new int[nums.length];
    if (k >= 0) System.arraycopy(nums, index + 0, result, 0, k);

    if (nums.length - k >= 0) System.arraycopy(nums, k - k, result, k, nums.length - k);

    System.arraycopy(result, 0, nums, 0, nums.length);
  }
}
