// Min Cost In Maze Traversal

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        int[][] dp = new int[n][m];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(i==0 && j==0){
                    dp[i][j]=arr[i][j];
                }
               else if(i-1>=0 && j-1>=0){
                 dp[i][j] = arr[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
                }
                else if(i-1>=0){
                     dp[i][j] = arr[i][j] + dp[i-1][j];
                }
                else if(j-1>=0){
                     dp[i][j] = arr[i][j] + dp[i][j-1];
                }
            }
        }
        System.out.println(dp[n-1][m-1]);
    }

}
