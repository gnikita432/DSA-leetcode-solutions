// 33. Search in Rotated Sorted Array

class Solution {
    //search
  public int search(int[] nums, int target) {

    int p = Pivot(nums, target);

    if (p == -1) {
      return binarySearch(nums, target, 0, nums.length - 1);
    }
    else if (nums[p] == target) {
      return p;
    }
   
    else if (target >= nums[0]) {
      return binarySearch(nums, target, 0, p - 1);
    }
      return binarySearch(nums, target, p + 1, nums.length - 1);
  }

    //finding pivot
  public int Pivot(int[] nums, int target) {
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

  //finding pivot with duplicate numbers
  public int findPivotWithDuplicates(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
        int mid = start + (end - start) / 2;
    
        if (mid < end && arr[mid] > arr[mid + 1]) {
        return mid;
        }
        if (mid > start && arr[mid] < arr[mid - 1]) {
        return mid - 1;
        }

        if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
        
        if (start < end && arr[start] > arr[start + 1]) {
            return start;
        }
        start++;

        if (end > start && arr[end] < arr[end - 1]) {
            return end - 1;
        }
        end--;
        }
        // left side is sorted, so pivot should be in right
        else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
        start = mid + 1;
        } else {
        end = mid - 1;
        }
    }
    return -1;
    }


     //Binary Search
  public int binarySearch(int[] nums, int target, int start, int end) {

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        return mid;
      }
      else if (nums[mid] > target) {
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }
    return -1;
  }
}

/*
Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Time Complexity : O(log n)
*/
