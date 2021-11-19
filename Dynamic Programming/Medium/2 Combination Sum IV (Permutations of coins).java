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


// 2 Dp - memoization Approach - 100% faster

class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        return permutations(nums, target, new Integer[target+1]);
        
    }
    
    public int permutations(int[] nums, int target, Integer[] qb){
        
        if(target == 0){
            return 1;
        }
        if(target<0){
            return 0;
        }
        if(qb[target]!=null){
            return qb[target];
        }
        int count = 0 ;
        for(int i=0; i<nums.length; i++){
           count+= permutations(nums, target-nums[i], qb);
        }
        return qb[target] = count;
    }
}

