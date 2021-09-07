class Solution {
    
     //O(n^2) Approach
     public int numIdenticalPairs1(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
    
    //O(n) Approach    
    public int numIdenticalPairs2(int[] nums) {
        //Frequency array
        int [] freq = new int[101];
        for(int i = 0 ; i<nums.length; i++){
            freq[nums[i]]++;
        }
        
        //Counting good pairs
        int count = 0;
        for(int c : freq){
         count+=(c!=0 && c>1)? ((c-1)*(c))/2 : 0 ;    
        }
        return count;
    }
   
}