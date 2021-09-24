// 1608. Special Array With X Elements Greater Than or Equal X

class Solution {
    public int specialArray(int[] nums) {
        
        int[] count = new int[102];
        
        for(int i = 0 ; i<nums.length ; i++){
            count[(nums[i]>100)? 101 : nums[i]]++;
        }
        
        for(int i = count.length-1 ; i>0 ; i--){
            count[i-1]+=count[i];
        }
        
        int j = 0;
        while(j <= nums.length){
            if(count[j]==j){
                return j;
            }
            j++;
        }
        
        return -1;
    }
}
// Time Complexity : O(n)
