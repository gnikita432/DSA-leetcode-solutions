// 441. Arranging Coins

//Linear Search Brute force approach - O(n)
class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        long sum = 0;
        while(sum<=n){
            sum+=i;
            i++;
        }
        return i-2;
    }
}


//Binary search approach - Optimal solution
class Solution {
    public int arrangeCoins(int n) {
        
       long start = 1, end = n, ans=-1;
       
        while(start<=end){
            
            long mid = start + (end-start) / 2;
            long sum = mid*(mid+1)/2;
            
            if(sum == n){
                return (int)mid;
            }
            else if(sum<n){
                start = mid + 1;
              
            }
            else{
               end = mid-1;
            }
        }
        return (int)end;
    }
}
// Time Complexity : O(log n)
