//832. Flipping an Image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
     
        for(int i=0 ; i<image.length;i++){
            for(int j=0,k=image[i].length-1; j<image[i].length/2 ; j++,k--){
               int temp = image[i][j];
                image[i][j]=image[i][k];
                image[i][k]=temp;
            }
        }
       for(int i=0 ; i<image.length;i++){
           for(int j=0 ; j<image[i].length ; j++){
               image[i][j]=(image[i][j]==0)? 1 : 0;
            }
        } 
       return image;
    }
}

// Input: image = [[1,1,0],[1,0,1],[0,0,0]]
// Output: [[1,0,0],[0,1,0],[1,1,1]]
