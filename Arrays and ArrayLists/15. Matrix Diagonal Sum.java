//1572. Matrix Diagonal Sum

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i=0,j=mat[i].length-1 ; i<mat.length; i++,j--){
           sum+=mat[i][i];
           sum+=mat[i][j];
        }
        return mat.length % 2 == 0 ? sum : sum - mat[mat.length/2][mat.length/2]; 
    }
}

// Input: mat = [[1,2,3],
//               [4,5,6],
//               [7,8,9]]
// Output: 25
