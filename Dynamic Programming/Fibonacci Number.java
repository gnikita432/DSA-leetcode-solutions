// 509. Fibonacci Number

// DP = Recursion + Memoization

class Solution {
    public int fib(int n) {
        
        return fibo(n, new int[n+1]);
        
    }
    
    public int fibo(int n, int[] qb){
        
         if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        if(qb[n] > 0){
            return qb[n];
        }

        int fibo1 = fibo(n-1 , qb);
        int fibo2 = fibo(n-2 , qb);
        
        int ans = fibo1 + fibo2 ; 
        
        qb[n] = ans;
        
        return ans;
       
    }
    
}

// Time Complexity : O(n)
// Space Complexity : O(n)
