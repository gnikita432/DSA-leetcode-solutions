// 1380. Lucky Numbers in a Matrix

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
       List<Integer> number = new ArrayList<>();
       int k = 0;
        
        for(int i=0; i<matrix.length;i++){
            
            //Minimum number in the row
            int min = Integer.MAX_VALUE;
            for(int j=0; j<matrix[i].length; j++){
                if(min>matrix[i][j]){
                    min=matrix[i][j];
                     k = j;
                }  
            }
            
            //Is the minimum number in row is also the maximum in column
            int max = Integer.MIN_VALUE;
            for(int j=0 ; j<matrix.length; j++){
                if(matrix[j][k]>max){
                    max = matrix[j][k];
                }
            }
            
            //Check for lucky number
            if(max==min){
                number.add(min);
            }
        }
        
        return number;
    }
}

// Time Complexity => O(n*m)
