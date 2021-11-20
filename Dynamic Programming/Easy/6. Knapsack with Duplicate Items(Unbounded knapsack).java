// Knapsack with Duplicate Items ( Unbounded KnapSack)

//Dp- Tabulation Approach
static int knapSack(int N, int cap, int val[], int wt[])
    {
        // code here
        int[] dp = new int[cap+1];
        
        for(int w=0; w<N; w++){
            for(int c=wt[w]; c<dp.length; c++){
                dp[c] = Math.max(dp[c-wt[w]]+val[w], dp[c]);
            }
        }
        return dp[cap];
    }
// Time Complexity:O(N*capacity)
// Space Complexity:O(Capacity)
