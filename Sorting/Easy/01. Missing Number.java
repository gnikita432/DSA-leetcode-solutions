// 268. Missing Number

//Cyclic Sort
 public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            int j = nums[i];
            if(nums[i]!=nums.length && nums[i]!=i){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            } else {
                i++;
            }
        }
        for(i=0; i<nums.length; i++){
            if(nums[i]!=i) return i;
        }
        return nums.length;
    }

// Time Complexity : O(n)
// Space Complexity : O(1)    

//Another approach
// We can also use frequency array- count of each element in the range and return the element containing 0
        