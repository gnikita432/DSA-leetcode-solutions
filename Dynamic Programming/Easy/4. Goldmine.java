// Goldmine

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        
        int[][] mine = new int[n][m];
        
        for(int i = 0;i<n; i++){
            for(int j=0; j<m; j++){
                mine[i][j]=scn.nextInt();
            }
        }
        
        int[][] dp = new int[n][m];
        
        for(int i=0; i<n; i++){
            dp[i][m-1] = mine[i][m-1];
        }
        
        for(int col=m-1; col>0; col--){
            for(int row=0; row<n; row++){
                
                if(row==0){
                dp[row][col-1] = mine[row][col-1] + Math.max(dp[row][col],dp[row+1][col]);
                }
                else if(row==n-1){
                dp[row][col-1] = mine[row][col-1] + Math.max(dp[row][col],dp[row-1][col]);    
                }
                else{
                dp[row][col-1] = mine[row][col-1] + Math.max(Math.max(dp[row][col],dp[row+1][col]), dp[row-1][col]);
                }
            }
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(max<dp[i][0]){
                max=dp[i][0];
            }
        }
     
     System.out.println(max);
    }

}
