// 1011. Capacity To Ship Packages Within D Days

class Solution {
    public int shipWithinDays(int[] weights, int days) {
    
        int sum = 0, max=0;
        for(int i=0; i<weights.length; i++){
            max = Math.max(max, weights[i]);
            sum+=weights[i];
        }
        
        return binarySearch(weights, max, sum, days);    
    }
    
    public int binarySearch(int[] weights, int start, int end, int days){
        
        while(start<end){
            int mid = start + (end-start)/2;
         
            int cover = 0, mindays = 1;
            for(int i=0; i<weights.length; i++){
               
                if(cover+weights[i]>mid){
                   cover = 0;
                    mindays++;
                }
                 cover+=weights[i];
            }
             
            if(mindays>days){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }
}

// Time Complexity : O(n log n)
