class Solution {
    public int dominantIndex(int[] nums) {
    int max = 0;
    int max_second = 0;
    int value = 0;


    for (int i = 0; i < nums.length; ++i)
      if (nums[i] > max) {
        max_second = max;
        max = nums[i];
        value = i;
      } else if (nums[i] > max_second) {
        max_second = nums[i];
      }

    return max >= 2 * max_second ? value : -1;
  }
};