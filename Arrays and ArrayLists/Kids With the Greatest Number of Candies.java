class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      ArrayList <Boolean> ans = new ArrayList <> ();
       
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }    
        for(int i=0; i<candies.length; i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }  
        return ans;
    }
}