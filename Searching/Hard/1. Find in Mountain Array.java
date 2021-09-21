// 1095. Find in Mountain Array

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */


//We can do this by linear search which will take O(n) time complexity

//This is binary Search Approach Which takes O(log n) time complexity
class Solution {
  public int findInMountainArray(int target, MountainArray mountainArr) {
    int idx = peakIndexInMountainArray(mountainArr);
    int ans1 =  search(mountainArr, target, 0, idx);
    if (ans1 != -1) {
      return ans1;
    } else {
      int ans2 = search(mountainArr, target, idx + 1, mountainArr.length() - 1);
      return ans2;
    }

  }

  public int peakIndexInMountainArray(MountainArray mountainArr) {
    int start = 0, end = mountainArr.length() - 1;

    while (start < end) {
      int mid = start + (end - start) / 2;
      if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
        start = mid + 1;
      } else {
        end = mid;
      }
    }

    return start;
  }

  public int search(MountainArray mountainArr, int target, int start, int end) {
    boolean isasce = mountainArr.get(start) < mountainArr.get(end) ? true : false;
    if (isasce) {
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mountainArr.get(mid) == target) {
          return mid;
        }
        else if (mountainArr.get(mid) > target) {
          end = mid - 1;
        }
        else {
          start = mid + 1;
        }
      }
    }
    else {
      while (start <= end) {
        int mid = start + (end - start) / 2;
        if (mountainArr.get(mid) == target) {
          return mid;
        }
        else if (mountainArr.get(mid) < target) {
          end = mid - 1;
        }
        else {
          start = mid + 1;
        }
      }
    }
    return -1;
  }

}

/*
 Example 1:

Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Time Complexity : O(log n)
*/
