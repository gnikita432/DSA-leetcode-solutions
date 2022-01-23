// 128. Longest Consecutive Sequence

class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashMap <Integer, Boolean> fhm = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            fhm.put(nums[i], true);
        }
        for(int i=0; i<nums.length; i++){
            if(fhm.containsKey(nums[i]-1)){
                fhm.put(nums[i], false);
            }
        }
        
        int maxi = 0;
        for(int i=0; i<nums.length; i++){
            int tmax=1;
            if(fhm.get(nums[i])){
                while(fhm.containsKey(nums[i]+tmax)){
                    tmax++;
                }
            }
            if(maxi<tmax){
                maxi = tmax;
            }
        }
        return maxi;
    }
}

// Time COMPLEXITY : O(n)
// SPACE Commplexity : O(n)
