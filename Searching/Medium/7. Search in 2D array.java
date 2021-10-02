// 74. Search a 2D Matrix

//Approach 1 
// Linear Search
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
        for(int i =0 ; i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;  
    }
}
// Time Complexity : O(n^2)


//Approach 2
//Binary Search on each row
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      
        for(int i=0;i<matrix.length;i++){
                int low=0;
                int high=matrix[0].length-1;
                while(low<=high){
                    int  mid =  (high+low)/2;
                    if(matrix[i][mid]==target){
                        return true;
                    }
                    else if(matrix[i][mid]>target){
                        high=mid-1;
                    }
                    else {         
                        low=mid+1;
                    }
                } 
             }
          return false;
    }
}
// Time Complexity : O(n log n)


//Approach 3
//If matrix if sorted by row wise and by column wise so we can use this binary search
//but this method is not optimum if matrix is sorted like Integers in each row are sorted from left to right and The first integer of each row is greater than the last integer of the previous row.
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = 0, column = matrix[0].length-1;
        
        while(row<matrix.length && column>=0){
            if(matrix[row][column] == target){
                return true;
            }
           else if(matrix[row][column]<target){
                row++;
            }
            else{
                column--;
            }
        }
        return false;
    }
}
// Time Complexity : O(log n)


//Approach 4 
//Optial binary search approach for matix if  matrix is sorted like Integers in each row are sorted from left to right and The first integer of each row is greater than the last integer of the previous row.