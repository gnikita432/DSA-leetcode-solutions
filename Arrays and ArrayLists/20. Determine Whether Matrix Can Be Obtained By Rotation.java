// 1886. Determine Whether Matrix Can Be Obtained By Rotation

class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        int count = 0 ;
        boolean value = false;
        
        while(value==false && count<4){
         mat = rotate(mat);
         value = check(mat,target);
           
            count++;
        }      
        return value;
    }
    
    public boolean check(int[][] result , int[][] target){
         for(int i = 0 , k=target.length-1 ; i<target.length; i++,k--){
            for(int j = 0 ; j<target[i].length; j++){
              if(result[i][j]!=target[i][j]){
                  return false;
              }
            }
        }
        return true;
    }
    
    public int[][] rotate(int[][] mat){
        int [][] result = new int[mat.length][mat[0].length];
        for(int i = 0 , k=mat.length-1 ; i<mat.length; i++,k--){
            for(int j = 0 ; j<mat[i].length; j++){
               result[i][j]=mat[j][k];
            }
        }
        return result;
    }
}
