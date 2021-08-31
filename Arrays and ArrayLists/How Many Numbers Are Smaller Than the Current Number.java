class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int [] ans = new int[nums.length];
     for(int i=0 ; i<nums.length; i++){
         for(int j=0 ; j <nums.length; j++){
             if(nums[i]>nums[j]){
                 ans[i]++;
             }
         }
     }   
        return ans;
    }
}

//Optimized - o(n)
class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        var buck = new int[101];
        
        for (int i = 0; i < nums.length; i++){
            buck[nums[i]]++;                  
        }
      
        for (int i = 1; i < buck.length; i++){
            buck[i] += buck[i - 1];           
        }

        for (int i = 0; i < nums.length; i++){
            nums[i] = nums[i] == 0 ? 0 : buck[nums[i] - 1]; 
        }
        
        return nums;
    }
}