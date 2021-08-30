class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth=Integer.MIN_VALUE;
     
        for(int i=0 ; i<accounts.length; i++){
               int wealth =0;
            for(int j=0 ; j<accounts[0].length; j++){
                wealth+=accounts[i][j];
            }
            if(wealth>maxWealth){
                maxWealth=wealth;
            }
        }
        return maxWealth;
    }
}