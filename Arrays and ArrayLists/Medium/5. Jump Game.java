// 55. Jump Game

class Solution {
    public boolean canJump(int[] nums) {
        
    int i= 0, maxReach=0;
        
    while(i<nums.length && i<=maxReach){
        maxReach = Math.max(i + nums[i], maxReach);
        i++;
    }
        
    if(i == nums.length){
        return true;
    }
        
    return false;
    }
}
// Time Complexity : O(n);
// Space Complexity: O(1);
