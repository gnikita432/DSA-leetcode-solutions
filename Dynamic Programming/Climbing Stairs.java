// 70. Climbing Stairs

class Solution {
    public int climbStairs(int n) {
      
        return ways(n, new int[n+1]);
        
    }
    
    public int ways(int n, int[] qb){
         if (n == 0) {
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(qb[n]>0){
            return qb[n];
        }
       
        int p1 = ways(n - 1, qb);
        int p2 = ways(n - 2, qb);
        
        int ans = p1 + p2;
        
        qb[n] = ans;
        
        return ans; 
    }
}


class Solution {
    public int climbStairs(int n) {
      
        return ways(n);
        
    }
    
    public int ways(int n){
        
        int[] tabulation = new int[n+1];
        tabulation[0] = 1;
        tabulation[1] = 1;
        
        for(int i = 2; i<=n ; i++){

            tabulation[i] = tabulation[i-1] + tabulation[i-2];
        }
        return tabulation[n];
    }
}
