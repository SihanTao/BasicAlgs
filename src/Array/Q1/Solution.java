package Array.Q1;

public class Solution {
  public int removeDuplicates(int[] nums) {
    if (nums.length == 0) {
      return 0;
    }

    int slow = 0;
    int fast = 1;

    while (fast < nums.length) {
      while (fast < nums.length && nums[slow] == nums[fast]) {
        fast++;
        if (fast == nums.length) return slow + 1;
      }
      nums[++slow] = nums[fast++];
    }
    return slow + 1;
  }
}
