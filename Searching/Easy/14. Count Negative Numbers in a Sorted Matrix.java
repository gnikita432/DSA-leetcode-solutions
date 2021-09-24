// 1351. Count Negative Numbers in a Sorted Matrix

 //Approach 1 Linear search - O(n^2)  
        
 //Approach 2 Binary Search - O(n+m)
class Solution {
    public int countNegatives(int[][] grid) {

        int row = 0 , column = grid[0].length-1, ans = 0;
        while(row < grid.length && column >=0){
            if(grid[row][column] < 0){
                ans+= grid.length - row ;
                column--;
            }
            else{
                row++;
            }
        }
        return ans;
    }
}
// Time Complexity : O(N+M)
