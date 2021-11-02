// leetcode - 204. Count Primes [medium]

//Optimum approach - Sieve of Eratosthenes
class Solution {
    public int countPrimes(int n) {
        
     boolean[] isprime = new boolean[n];
     int count = 0;
        
        for(int i = 2; i*i<=n; i++){
            if(!isprime[i]){
                    for(int j = i*2; j<n; j+=i){
                        isprime[j] = true;
                    }
            }
        }
        for(int i=2;i<isprime.length;i++){
            if(!isprime[i]){
                count++;
            }
        }
        return count;
    }
}
// Time Complexity : O(n * log(log(n)))
// Space Complexity : O(n)


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
// Time Complexity : O(n * sqrt(n))
// Space Complexity :O(1)
