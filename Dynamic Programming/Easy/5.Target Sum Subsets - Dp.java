// Target Sum Subsets - Dp

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int tar = scn.nextInt();
        
        boolean[][] dp = new boolean[n+1][tar + 1];
        
        for(int row=0; row<dp.length; row++){
            for(int col=0; col<dp[row].length; col++){
                //1
                if(row==0 && col==0){
                        dp[row][col]=true;
                    }
                
                //2    
                else if(row==0){
                        dp[row][col]=false;
                    }
                
                //3
                else if(col==0){
                       dp[row][col]=true;
                }
                
                //4
                else{
                    if(col>=arr[row-1]){
                        dp[row][col] = dp[row-1][col-arr[row-1]] || dp[row-1][col];
                    }
                    else{
                        dp[row][col] = dp[row-1][col];
                    }
                }
            }
        }

        System.out.println(dp[n][tar]);
  
    }
}
// Time Complexity : O(n*target)
// Space Complexity : O(n*target)
