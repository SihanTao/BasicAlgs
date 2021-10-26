package Arrays.Q1;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int front = 0;
        int back = 1;

        while (back < nums.length) {
            while (back < nums.length && nums[front] == nums[back]){
                back++;
                if (back == nums.length)
                    return front + 1;
            }
            nums[++front] = nums[back++];
        }
        return front + 1;
    }
}
