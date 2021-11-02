// leetcode - 204. Count Primes [medium]

//Brute force - TLE
class Solution {
    public int countPrimes(int n) {
        
        int ans=0;
        for(int i=2; i<n; i++){
            ans+=isprime(i);
        }
        return ans;
    }
    
    public int isprime(int N){
         
        int c = 2;
        
        while(c*c <= N){
            if(N%c==0){
                return 0;
            }
            c++;
        }
        return 1;
    }
}
// Time Complexity : O(n^2)
// Space Complexity :O(1)
