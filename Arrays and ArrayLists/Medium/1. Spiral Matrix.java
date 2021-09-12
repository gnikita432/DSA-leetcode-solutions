// 54. Spiral Matrix

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> ans = new ArrayList<> ();
        
        int minr = 0, minc = 0, maxr = matrix.length-1, maxc = matrix[0].length-1;
        int t = matrix.length*matrix[0].length, count = 0 ;
        
        while(count<t){
            
            for(int r = minr, c = minc ; c<=maxc && count<t; c++){
                ans.add(matrix[r][c]);
                count++;
            }
            minr++;
            
            for(int r = minr, c = maxc ; r<=maxr && count<t ; r++){
                ans.add(matrix[r][c]);
                count++;
            }
            maxc--;
            
            for(int r = maxr, c=maxc ; c>=minc && count<t ; c--){
                ans.add(matrix[r][c]);
                count++;
            }
            maxr--;
            
            for(int r = maxr, c=minc ; r>=minr && count<t ; r--){
                ans.add(matrix[r][c]);
                count++;
            }
            minc++;
            
        }
        return ans;
    }
}

// Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
// Output: [1,2,3,4,8,12,11,10,9,5,6,7]
