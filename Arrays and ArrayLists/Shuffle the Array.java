class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n*2];
        for(int i = 0 , j = 0; i < 2*n ; i+=2, j++){
            ans[i]=nums[j];
            ans[i+1]=nums[j+n];
        } 
        return ans;
    }
}
