// 875. Koko Eating Bananas

//Binary search approach
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
     
        int max = piles[0]; 
        for(int i = 1; i < piles.length ;i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        
        int start = 1, end = max;
        
        while(start<end){
            
            int mid = start + ( end - start)/2;
            
            int totalnoofhr = 0;
          for(int i = 0 ; i<piles.length; i++){
                // int noofhr = (piles[i] / mid) + (piles[i] % mid); 
                int noofhr = (int)Math.ceil(piles[i]*1.0/mid); 
               totalnoofhr+=noofhr;
            }
            if(totalnoofhr<=h){
                end = mid;
            }
            else if(totalnoofhr>=h){
               start = mid+1;
            }
        }
            
        return start;
    }
}

// Time Complexity : O(n log(max))
