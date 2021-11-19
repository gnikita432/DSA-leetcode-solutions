// 377. Combination Sum IV
// Coin Change Permutation

//1 Simple Recursion Approach - Time Limit Exceeded 

class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        return permutations(nums, target);
        
    }
    
    public int permutations(int[] nums, int target){
        
        if(target == 0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        
        int count = 0 ;
        for(int i=0; i<nums.length; i++){
           count+= permutations(nums, target-nums[i]);
        }
        return count;
    }
}

