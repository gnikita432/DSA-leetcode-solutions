// Rotation Count - GFG Question
// https://www.youtube.com/watch?v=W9QJ8HaRvJQ&t=10928s

class Solution {
    int findKRotation(int arr[], int n) {
        return Pivot(arr,n)+1;
    }
    
    int Pivot(int[] nums, int target) {
        
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
          int mid = start + (end - start) / 2;
    
          if (mid < end && nums[mid] > nums[mid + 1]) {
            return mid;
          }
          if (mid > start && nums[mid] < nums[mid - 1]) {
            return mid - 1;
          }
          else if (nums[start] >= nums[mid]) {
            end = mid - 1;
          }
          else {
            start = mid + 1;
          }
    
        }
        return -1;
  }
}
// Time Complexity : O(log n)
