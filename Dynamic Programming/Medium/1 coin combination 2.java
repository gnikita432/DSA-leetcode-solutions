// 518. Coin Change 2

// Recursion: (Time Limit Exceeded)

class Solution {
    public int change(int amount, int[] coins) {
        return change(amount, 0, coins);
    }
    
    public int change(int amount, int start, int[] coins) {
        if (amount < 0) {
            return 0;
        }
        
        if (amount == 0) {
            return 1;
        }
        
        int count = 0;
        for (int i = start; i < coins.length; ++ i) {
            count += change(amount - coins[i], i, coins);
        }
        
        return count;
    }
}


// Recursion with memoization: (Accepted)

class Solution {
    public int change(int amount, int[] coins) {
        Map<String, Integer> cache = new HashMap<>();
        return change(amount, 0, cache, coins);
    }
    
    public int change(int amount, int start, Map<String, Integer> cache, int[] coins) {
        if (amount < 0) {
            return 0;
        }
        
        if (amount == 0) {
            return 1;
        }
        
        String key = amount + "," + start;
        if (cache.containsKey(key)) {
            return cache.get(key);
        }
        
        int count = 0;
        for (int i = start; i < coins.length; ++ i) {
            count += change(amount - coins[i], i, cache, coins);
        }
        
        cache.put(key, count);
        return count;
    }
}

// DP - Tabulation Approach

class Solution {
    public int change(int amount, int[] coins) {
        
        int[] dp = new int[amount+1];
        dp[0] = 1;
      
            for(int coin=0; coin<coins.length; coin++){
                    for(int amt=1; amt<dp.length; amt++){
                      if(amt>=coins[coin]){
                      dp[amt]+=dp[amt - coins[coin]];
                      }
                }
           }
        return dp[amount];
    }
}

