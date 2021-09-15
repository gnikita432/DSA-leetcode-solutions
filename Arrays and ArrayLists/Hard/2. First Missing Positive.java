// 41. First Missing Positive

public class Solution {
  public int firstMissingPositive(int[] nums) {

    int i = 0;
    while (i < nums.length) {
      if (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
        swap(nums, i, nums[i] - 1);
      } else {
        i++;
      }
    }

    i = 0;
    while (i < nums.length && nums[i] == i + 1) i++;

    return i + 1;
  }

  private void swap(int[] A, int i, int j) {
    int temp = A[i];
    A[i] = A[j];
    A[j] = temp;
  }

}
// Time Complexity : O(n)
// Space Complexity : O(1)

// frequency array approach or sort array approach will not work for negative values
