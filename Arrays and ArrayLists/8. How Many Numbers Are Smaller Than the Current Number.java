class Solution {

    //O(n^2) approach
    public int[] smallerNumbersThanCurrent1(int[] nums) {
        
        int[] count = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                count[i]+= (j!=i && nums[j]<nums[i])? 1 : 0;
            }
        }
        return count;
    }
    
     //O(n) approach
     public int[] smallerNumbersThanCurrent2(int[] nums) {
         
         //Frequency array
         int[] freq = new int[101];
         for(int i = 0 ; i<nums.length ; i++){
             freq[nums[i]]++;
         }
         
         // Modified frequency array
         for(int i=1; i<freq.length;i++){
             freq[i]+=freq[i-1];
         }
         
         //answer
         int[] ans = new int[nums.length];
         for(int i = 0 ; i<ans.length; i++){
             ans[i] = (nums[i]==0)? 0 : freq[nums[i]-1];
         } 
         return ans;
     }
}
