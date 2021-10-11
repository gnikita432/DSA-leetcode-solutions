// 645. Set Mismatch

class Solution {
   public int[] findErrorNums(int[] nums){
    
        int i = 0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            
            if(nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
            else{
                i++;
            }
        }
        
        int j = 0;
        while(j<nums.length){
            if(j+1 != nums[j]){
               return new int[]{nums[j], j+1};
            }
            j++;
        }
        return new int[]{0,0};
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
