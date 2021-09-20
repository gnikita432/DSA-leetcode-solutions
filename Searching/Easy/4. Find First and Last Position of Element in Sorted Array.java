// 34. Find First and Last Position of Element in Sorted Array

//Binary Search Approach
class Solution {
  public int[] searchRange(int[] nums, int target) {

    int[] ans = new int[2];
    ans[0] = search(nums, target, true);
    ans[1] = search(nums, target, false);

    return ans;
  }

  public int search(int[] nums, int target, boolean firstIndex) {
    int start = 0, end = nums.length - 1, idx = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (target == nums[mid]) {
        idx = mid;
        if (firstIndex) {
          end = mid - 1;
        }
        else {
          start = start + 1;
        }
      }
      else if (target < nums[mid]) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return idx;
  }
}
// Time Complexity : O(log n)
