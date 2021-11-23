// Paint House
/*
1. You are given a number n, representing the number of houses.
2. In the next n rows, you are given 3 space separated numbers representing the cost of painting nth house with red or blue or green color.
3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.

Input:
4
1 5 7
5 8 4
3 2 9
1 2 4
*/

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
      
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      
      int[][] colors = new int[n][3];
      
      for(int i=0; i<colors.length; i++){
          for(int j=0; j<colors[0].length; j++){
              colors[i][j] = scn.nextInt();
          }
      }
      
      int[][] dp = new int[n][3];
      
      for(int i=0; i<dp.length; i++){
          for(int j=0; j<dp[0].length; j++){
              if(i==0){
                  dp[i][j] = colors[i][j];
              }
              else if(j==0){
                  dp[i][j] = colors[i][j] + Math.min(dp[i-1][j+1], dp[i-1][j+2]);
              }
                else if(j==1){
                  dp[i][j] = colors[i][j] + Math.min(dp[i-1][j-1], dp[i-1][j+1]);
              }
                else if(j==2){
                  dp[i][j] = colors[i][j] + Math.min(dp[i-1][j-2], dp[i-1][j-1]);
              }
          }
      }
      
      int ans = Math.min(dp[n-1][0],Math.min(dp[n-1][1],dp[n-1][2]));
      System.out.println(ans);

  }
}
// Time Complexity : O(n*3)
// Space Complexity : O(n*3)
