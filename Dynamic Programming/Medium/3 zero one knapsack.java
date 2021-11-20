//Zero One knapsack
//Similar to target sum subset

//https://www.geeksforgeeks.org/0-1-knapsack-problem-dp-10/

//Approach 1 - Recurssion
 static int knapSack(int W, int wt[], int val[], int n)
    {
        // Base Case
        if (n == 0 || W == 0)
            return 0;
 
        // If weight of the nth item is
        // more than Knapsack capacity W,
        // then this item cannot be included
        // in the optimal solution
        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
 
        // Return the maximum of two cases:
        // (1) nth item included
        // (2) not included
        else
            return Math.max(val[n - 1]
                       + knapSack(W - wt[n - 1], wt,
                                  val, n - 1),
                       knapSack(W, wt, val, n - 1));
    }
// Time Complexity: O(2^n). 
// Auxiliary Space :O(1). 



public class Main {

  public static void main(String[] args) throws Exception {
    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // int n = Integer.parseInt(br.readLine());

    // int[] price = new int[n];
    // String str1 = br.readLine();
    // for (int i = 0; i < n; i++) {
    //   price[i] = Integer.parseInt(str1.split(" ")[i]);
    // }

    // int[] weight = new int[n];
    // String str2 = br.readLine();
    // for (int i = 0; i < n; i++) {
    //   weight[i] = Integer.parseInt(str2.split(" ")[i]);
    // }

    // int cap = Integer.parseInt(br.readLine());

    int[][] dp = new int[n + 1][cap + 1];
    for (int i = 1; i < dp.length; i++) {
      for (int j = 1; j < dp[0].length; j++) {
        int val = price[i - 1];
        int wt = weight[i - 1];

        if (j >= wt) { //If the current capacity is greater than the weight of the current item
          dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - wt] + val); // max cost will be max of cost before putting the item and after putting it
        } else {
          dp[i][j] = dp[i - 1][j]; //If current capacity is less than weight do not add item to the bag
        }
      }
    }

    System.out.println(dp[n][cap]);
  }
}

// Time Complexity :O(n*c)
// Space Complexity : O(n*c)
