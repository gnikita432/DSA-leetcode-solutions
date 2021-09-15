// 1499. Max Value of Equation

//Approach 1 - Brute force approach
//O(n^2) - Time Limit Exceeded
class Solution {
  public int findMaxValueOfEquation(int[][] points, int k) {

    int max = Integer.MIN_VALUE;
    for (int j = 1 ; j < points.length ; j++) {
      for (int i = j - 1 ; i >= 0 ; i--) {
        int xi = points[i][0];
        int xj = points[j][0];

        int x = xj - xi;

        if (x <= k) {
          int yi = points[i][1];
          int yj = points[j][1];

          int ans = yi + yj + x;

          if (ans > max) {
            max = ans;
          }
        }
      }
    }
    return max;
  }
}
