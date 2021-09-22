// 367. Valid Perfect Square

//Binary Search Approach- Optimal approach O(log n)
class Solution {
    public boolean isPerfectSquare(int num) {
         
    long start = 1,end = num;
      
    while (start <= end) {
        
      long mid = start + (end - start) / 2;
        
      if (mid*mid == num )
        return true;
      
      else if (mid*mid > num)
        end = mid - 1;
        
      else
        start = mid + 1;
    }
      
    return false;
    }
}
// Time Complexity : O(log n)
// Space Complexity :O(1)

//Linear Search Approch will be of O(n)
