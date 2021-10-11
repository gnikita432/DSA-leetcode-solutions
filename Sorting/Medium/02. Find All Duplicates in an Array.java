// 442. Find All Duplicates in an Array

//Cyclic Sort
class Solution {
    public int findDuplicate(int[] nums) {
       
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
              return nums[j];
            }
            j++;
        }
        return -1;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)

//Another method is of taking frequency array
