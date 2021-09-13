// 73. Set Matrix Zeroes

//Approach 1 
class Solution {
    public void setZeroes(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<> ();
        
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length ; j++){
                if(matrix[i][j]==0){
                    ans.add(i);
                    ans.add(j);
                }
            }
        }    
        for(int i = 0 ; i<ans.size() ; i+=2){
            int k = ans.get(i);
            for(int j = 0 ; j<matrix[0].length ; j++){
               matrix[k][j] = 0; 
            }
            k = ans.get(i+1);
            for(int j = 0 ; j<matrix.length ; j++){
                 matrix[j][k] = 0; 
            }
        }
    }
}
// Time Complexity : O(n*m)
// Space Complexity : O(n+m)

//Approach 2
class Solution {
    public void setZeroes(int[][] matrix) {
        
        int[] row = new int[matrix.length];
        int[] column = new int[matrix[0].length];
        
        for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    row[i]=-1;
                    column[j]=-1;
                }
            }
        }    
          for(int i =0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(row[i]==-1||column[j]==-1){
                   matrix[i][j]=0;
                }
            }
        }        
    }
}
// Time Complexity : O(n*m)
// Space Complexity : O(n+m)

//Approach 3 - Memory optimization
class Solution {
  public void setZeroes(int[][] matrix) {

    boolean fr = false, fc = false;

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          matrix[i][0] = 0;
          matrix[0][j] = 0;
          if (i == 0) fr = true;
          if (j == 0) fc = true;
        }
      }
    }
    for (int i = 1; i < matrix.length; i++) {
      for (int j = 1; j < matrix[0].length; j++) {
        if (matrix[i][0] == 0 || matrix[0][j] == 0) {
          matrix[i][j] = 0;
        }
      }
    }
    if (fr) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[0][j] = 0;
      }
    }
    if (fc) {
      for (int i = 0; i < matrix.length; i++) {
        matrix[i][0] = 0;
      }
    }
  }
}
// Time Complexity : O(n*m)
// Space Complexity : O(1)
