// 34. Find First and Last Position of Element in Sorted Array

// Approach 1 - without binary search
class Solution {
  public int[] searchRange(int[] nums, int target) {
    
    int[] ans = new int[2];
    int c = 0;
    ans[0]=-1; ans[1]=-1;
      
    for (int i = 0 ; i < nums.length ; i++) {
        
      if (nums[i] == target) {
          
          if (c == 0) {
              ans[0] = i ;
              ans[1] = i;
           } else {
              ans[1] = i;
           }
          
        c++;
      }
    }
    return ans;
  }
}
// Time Complexity : O(n)
