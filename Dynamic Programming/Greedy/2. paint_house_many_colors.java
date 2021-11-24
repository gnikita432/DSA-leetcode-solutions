// paint_house_many_colors

// n^3 approach
public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int k = scn.nextInt();

    int[][] arr = new int[n][k];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < k; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int[][] dp = new int[arr.length][arr[0].length];
    for (int j = 0; j < arr.length[0]; j++) {
      dp[0][j] = arr[0][j];
    }

    for (int i = 0; i < dp.length; i++) {
      for (int j = 0; j < dp[0].length; j++) {
        int min = Integer.MAX_VALUE;

        for (int k = 0; k < dp[0].length; k++) {
         
            if (dp[i - 1] [k] < min) {
              min = dp[i - 1][k];
            }
          
        }
        dp[i][j] = arr[i][j] + min;
      }
    }

    int min = Integer.MAX_VALUE;
    for ( int k = 0; k < dp[0].length; k++) {
      if (dp[n - 1][k]) < min) {
        min = dp[i - 1][k];
      }
    }

    System.out.print(min);
  }
}

//n^2 Approach
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int c = scn.nextInt();
    int[][] arr = new int [n][c];
    for (int i = 0 ; i < arr.length; i++) {
      for (int j =  0 ; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int least = Integer.MAX_VALUE;
    int sleast = Integer.MAX_VALUE;
    int[][] dp = new int[arr.length][arr[0].length];
    for (int j = 0 ; j < arr[0].length; j++) {
      dp[0][j] = arr[0][j];
      if (dp[0][j] <= least) {
        sleast = least;
        least = dp[0][j];
      }
      else if (dp[0][j] <= sleast) {
        sleast = dp[0][j];
      }
    }


    for (int i = 1 ; i < dp.length; i++) {
      int nleast = Integer.MAX_VALUE;
      int nsleast = Integer.MAX_VALUE;
      for (int j =  0 ; j < dp[0].length; j++) {
        if (dp[i - 1][j] == least) {
          dp[i][j] = arr[i][j] + sleast;
        }
        else {
          dp[i][j] = arr[i][j] + least;
        }


        if (dp[i][j] <= nleast) {
          nsleast = nleast;
          nleast = dp[i][j];
        }
        else if (dp[i][j] <= nsleast) {
          nsleast = dp[i][j];
        }


      }
      least = nleast;
      sleast = nsleast;
    }
    System.out.println(least);

  }
}
