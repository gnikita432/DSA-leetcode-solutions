// 540. Single Element in a Sorted Array

//Approach 1 count the frequency of element and return element with 1 frequency - O(n)

//Approach 2 binary search - O(log n)
class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        int start = 0, end = nums.length-1;
        if(nums.length==1){
            return nums[0];
        }
        while(start<end){
            
            int mid = start + (end - start)/2;
            if(mid>0 && nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
           else if(mid%2==0 && nums[mid]==nums[mid+1]){
                start = mid + 1;
            }
            else if(mid%2==0 && nums[mid]!=nums[mid+1]){
                end = mid-1;
            }
            else if(mid>0 && mid%2!=0 && nums[mid]==nums[mid-1]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return nums[start];
    }
}
// Time Complexity : O(log n)
