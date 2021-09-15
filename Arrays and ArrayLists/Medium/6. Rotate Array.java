// 189. Rotate Array

class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums,0,nums.length-1);    
    }
    
    public void reverse(int[] nums, int i, int k){
       
        while(i<k){
            int temp=nums[i];
            nums[i]=nums[k];
            nums[k]=temp;
            i++;
            k--;
        }
    }  
}
// Time Complexity : O(n);
// Space Complexity : O(1);
