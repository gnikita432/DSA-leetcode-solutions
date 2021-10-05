// 1552. Magnetic Force Between Two Balls

class Solution {
    public int maxDistance(int[] position, int m) {
        
        Arrays.sort(position);
        
        int start = 1, end = position[position.length-1] - position[0];
        int res = 0;
        
        while(start<=end){
            
            int mid = start + (end-start)/2;
          
            if(canballsfits(position, m, mid)){
                res = mid;
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return res;
    }
    
    public boolean canballsfits(int[] position, int m, int mid){
        int noofballs = 1, ballp = 0;
        for(int i = 1; i<position.length; i++){
            if(position[i]-position[ballp]>=mid){
                noofballs++;
                ballp = i;
            }
            if(noofballs >= m){
                return true;
            }
        }
        return false;
    }
}
// Time Complexity : O(n log n)
