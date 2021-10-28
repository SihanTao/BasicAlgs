package Arrays.Q6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    Arrays.sort(nums1);
    Arrays.sort(nums2);
    int n1 = nums1.length;
    int n2 = nums2.length;
    int n = Math.max(n1, n2);
    int[] intersection = new int[n];

    int i = 0;
    int j = 0;
    int index = 0;
    while (i < n1 && j < n2) {
      if (nums1[i] < nums2[j]) {
        i++;
      } else if (nums1[i] > nums2[j]) {
        j++;
      } else {
        intersection[index++] = nums1[i];
        i++;
        j++;
      }
    }
    return Arrays.copyOfRange(intersection, 0, index);
  }
}
