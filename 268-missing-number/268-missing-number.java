class Solution {
    public int missingNumber(int[] nums) {
        
        // We can take frequency array- count of each element in the range and return the element containing 0
        
        //Cyclic Sort
        
        int i = 0 ;
        while(i<nums.length){
            if(nums[i]!=0){
             int correct = nums[i]-1;
              if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
                 else{
                i++;
            }
            }
            else{
                i++;
            }
        }
        int j = 0;
        while(j<nums.length){
            if(nums[j]==0){
                return j+1;
            }
            j++;
        }
        return 0;
    }
}