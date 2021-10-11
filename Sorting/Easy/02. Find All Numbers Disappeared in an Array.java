// 448. Find All Numbers Disappeared in an Array

//Cyclic Sort Approach
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
       
        List <Integer> ans = new ArrayList<>();
        
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
                ans.add(j+1);
            }
            j++;
        }
        return ans;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)

//Another method is of taking frequency array
