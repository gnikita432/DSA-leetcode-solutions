// 153. Find Minimum in Rotated Sorted Array

class Solution {
  public int findMin(int[] nums) {

    if (nums[0] <= nums[nums.length - 1]) {
      return nums[0];
    }

    return nums[peak(nums) + 1];
  }

  public int peak(int[] nums) {

    int start = 0, end = nums.length - 1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] > nums[mid + 1]) {
        return mid;
      }
      else if (nums[mid] < nums[mid - 1]) {
        return mid - 1;
      }
      else if (nums[mid] > nums[start]) {
        start = mid + 1;
      }
      else {
        end = mid - 1;
      }
    }
    return -1;
  }
}
// Time Complexity : O(log n)
// Space Complexity : O(1)
