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
//Row Column Matrix- If matrix if sorted by row wise and by column wise so we can use this binary search
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
//Strictly Sorted Matrix- Optial binary search approach for matix if  matrix is sorted like Integers in each row are sorted from left to right and The first integer of each row is greater than the last integer of the previous row.

//Take middle column
//Perform binary search on this middle column to eliminate rows - O(log n)

//if element == target {return ans}
//else if element > target {ignore all the rows after that elements row}
//else if element < target {ignore all the rows above that elements row}

//In the last 2 rows will be remaining
//Check whether the mid column you are at contains the ans?
//if not then consider four parts- [i][j-1]   | [i][j] | [i][j+1]
//                                 [i+1][j-1] |[i+1][j]| [i+1][j+1]   
//now do simple binary search in this 4 parts - O(log m)
//Time Complexity - O(log n + log m)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rstart = 0, rend = matrix.length-1, cstart = 0, cend = matrix[0].length-1;
        
        int cmid = cstart + (cend-cstart)/2;    
     
        while(rstart < (rend - 1)){
        int rmid = rstart + (rend-rstart)/2;
            
            if(matrix[rmid][cmid]==target){
                return true;
            }
            else if(matrix[rmid][cmid]>target){
                rend = rmid;
            }
            else{
                rstart = rmid;
            }
        }
        
        if(matrix[rstart][cmid]==target){
            return true;
        }
        else if(matrix[rend][cmid]==target){
            return true;
        }
        else{
            if(binarysearch(matrix, rstart, 0, cmid-1, target))
                return true;
            else if(binarysearch(matrix, rend, 0, cmid-1, target))
                return true;
            else if(binarysearch(matrix, rstart, cmid+1, matrix[0].length-1, target))
                return true;
            else if(binarysearch(matrix, rend, cmid+1, matrix[0].length-1, target))
                return true;
        }
        
        return false;
    }
    
    public boolean binarysearch(int[][]matrix, int row, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            else if(matrix[row][mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return false;
    }
}
//Time Complexity : O(log n)

//Approach 5 convert it in 1D array then apply binary search - not optimal solution
