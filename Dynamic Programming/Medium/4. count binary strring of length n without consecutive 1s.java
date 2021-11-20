// Count binary Strings

// https://practice.geeksforgeeks.org/problems/consecutive-1s-not-allowed1912/1#

//Tabulation approach

class Solution {
    public int findIntegers(int n) {
        int prev0 = 1;
        int prev1 = 1;
        for(int i=2;i<=n;i++){
            int new0 = prev0+prev1;
            int new1 = prev0;
            prev0 = new0;
            prev1=new1;
        }
        return prev0+prev1;
    }
}
