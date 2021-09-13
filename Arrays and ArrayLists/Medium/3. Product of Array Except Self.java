// 238. Product of Array Except Self

//Approach 1 - time limit exceeded
class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] ans = new int[nums.length];
        
        for(int j = 0 ; j<ans.length; j++){
            int product = 1;
          for(int i = 0 ; i<ans.length ; i++){
            if(j!=i){
                product*=nums[i];
              }
            }
            ans[j] = product;
        }
        return ans;
    }
}
// Time Complexity : O(n^2)


//Approach 2 - Optimized solution
class Solution {
  public int[] productExceptSelf(int[] nums) {

    int[] ans = new int[nums.length];
    int product = 1, productw0 = 0, c=0;
    boolean isall0 = true;
      
    for (int i = 0 ; i < nums.length; i++) {
      if (nums[i] == 0) {
        productw0 = 1;
          c++;
      } else {
        isall0 = false;
        product *= nums[i];
      }
    }

    for (int i = 0 ; i < nums.length; i++) {
      if (productw0 == 1) {
        if (nums[i] == 0) {
          ans[i] = (isall0==true || c>1)? 0 : product;
        }
        else {
          ans[i] = 0;
        }
      }
      else {
        ans[i] = product / nums[i];
      }
    }
    return ans;
  }
}
// Time Complexity : O(n)


//Approach 3 - more optimized and clean approach
public class Solution {
  public int[] productExceptSelf(int[] nums) {

    int n = nums.length;
    int[] res = new int[n];
    res[0] = 1;

    for (int i = 1; i < n; i++) {
      res[i] = res[i - 1] * nums[i - 1];
    }

    int right = 1;

    for (int i = n - 1; i >= 0; i--) {
      res[i] *= right;
      right *= nums[i];
    }

    return res;
  }
}
// Time Complexity : O(n)
