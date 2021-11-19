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

