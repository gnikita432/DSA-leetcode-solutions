// 410. Split Array Largest Sum

//Binary search approach with explanation
class Solution {
    public int splitArray(int[] nums, int m) {
        
       // if I split the array in exactly 1 way (minimum) then only 1 comibination can be created that is the whole array  | 7,2,5,10,8 whith m = 1 piece so sum af all the elements will eventully my ans and as no other comibations are possible so the whole sum would be the onlly ans as max sum would be sum off all pices(piece = 1) ie sum of whole array
        //ie the max ans possible is sum of whole array
       
            
        //Now if i split array to its maximum that is nums.length-1, as array can be split beyoud this, this will be invalid as all elements couldnt be fixed.
        //so if array splits in nums.length-1 ie m = 5-1 = 4 then only 1 combination is possible like the previous one, the combination is
        // 7| 2 | 5 | 10 | 8 and max sum from all the splits is 10 ie ans=10 for max splits
        
         int sum = 0, max=nums[0];
        for(int num : nums){
            sum+=num;
            if(num>max)
                max=num;
        }
        
        // Now the lower bound becomes 10 and uper bound becomes whole sum ie 32
        //all splits can be between 1 and 32 so ans can be between this only
        
        int start = max, end = sum;
        
        while(start<end){
            
            int mid = start + (end-start)/2;
            
            if(ismpieces(nums, m, mid)){
                end = mid; // As we want the smallest so we dont return it but we will check more in the left side for sum minimum value and if they ask us for max so we would do this with start.
            }
            else{
                start = mid + 1; //as piceses will be more thn m so our min value is less we need to check for a greater value
            }
        }
        return start; //or end
    }
    
    public boolean ismpieces(int[] nums, int m, int mid){
        int sum = 0, pices=1;
        for(int num : nums){
            if(sum+num > mid){
                pices++;
                sum = num;
            }
            else
                sum+=num;
            
        }
        if(pices <= m){
            return true;
        }
        return false;
    }
}
// Time Complexity : O(n log n)



//Binary Search Approach
class Solution {
  public int splitArray(int[] nums, int m) {

    int max = nums[0], maxsum = nums[0];

    for (int i = 1 ; i < nums.length; i++) {
      maxsum += nums[i];
      if (max < nums[i]) {
        max = nums[i];
      }
    }
    int start = max;
    int end = maxsum;

    while (start < end) {

      int mid = start + (end - start) / 2;

      int sum = 0;
      int pieces = 1;
      for (int num : nums) {
        if (sum + num > mid) {
          sum = num;
          pieces++;
        } else {
          sum += num;
        }
      }

      if (pieces > m) {
        start = mid + 1;
      } else {
        end = mid;
      }

    }
    return start;
  }
}
// Time Complexity : O(n)
