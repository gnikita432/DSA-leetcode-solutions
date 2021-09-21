// 410. Split Array Largest Sum

//Binary Search Approach
class Solution {
  public int splitArray(int[] nums, int m) {

    int max = nums[0], maxsum = nums[0];

    for (int i = 1 ; i < nums.length; i++) {
      maxsum += nums[i];
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    int start = max;
    int end = maxsum;

    while (start < end) {

      int mid = start + (end - start) / 2;

      int sum = 0;
      int pieces = 1;
      for (int num : nums) {
        if (sum + num > mid) {
          sum = num;
          pieces++;
        } else {
          sum += num;
        }
      }

      if (pieces > m) {
        start = mid + 1;
      } else {
        end = mid;
      }

    }
    return start;
  }
}
// Time Complexity : O(n)
