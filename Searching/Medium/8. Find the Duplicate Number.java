// 287. Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        
        // Approach 1 - take 1 number andinterate for numbers afterthat andif nums[i]==no return  no  --- O(n^2)
        
        // Approach 2 - Sort the array and find whose index is not in sequence ie n[i] = n[i+1] return n[i] --- O(n log n)
        
        // Approach 3 - take Frequency array and if count of any element is 2 then return it ---  O(n) and also space complexity of O(n)
        
        // Approach 4 -  Since the numbers are [1:N], so we use the array indices for storing the visited state of each number, only the duplicate will be visited twice. For each number we goto its index position and multiply by -1. In case of duplicate it will be multiplied twice and the number will be +ve. --- O(n)
         for(int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) ;
            
            // mark as visited
            nums[index] *= -1;
            // incase of duplicate, this will become +ve 
            if(nums[index] > 0)
                return Math.abs(nums[i]);
        }    
        return -1;
        
        // Approach 5 - Floyd Cycle detection
            if(nums.length ==0 )
                return 0;
            int slow=0, fast=0;
            slow = nums[slow];
            fast = nums[nums[fast]];
            while(slow != fast){
                if(slow == nums[slow])
                    return slow;
                slow = nums[slow];
                fast = nums[nums[fast]];
            }
            fast = 0;
            while(slow != fast){
                if(slow == nums[slow])
                    return slow;
                slow = nums[slow];
                fast = nums[fast];
            }
        return slow; 
    }
}
// Time complexity : O(n)
// Space Complexity : O(1)
