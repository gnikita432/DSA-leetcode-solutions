// 198. House Robber
// Maximum Sum Non Adjacent Elements

//Greedy - Tabulation Approach

class Solution {
    public int rob(int[] nums) {
        
        int inc = nums[0];
        int exc = 0;
        
        for(int i=1; i<nums.length; i++){
            int ninc = exc + nums[i];
            int nexc = Math.max(inc,exc);
            inc = ninc;
            exc = nexc;
        }
        return Math.max(inc, exc);
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
