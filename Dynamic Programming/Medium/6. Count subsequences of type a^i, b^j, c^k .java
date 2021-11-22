// Count subsequences of type a^i, b^j, c^k 

//DP - Tabulation Approach

class Solution
{
    public int fun(String s)
    {
        int a = 0;
        int ab = 0;
        int abc = 0;
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                a = 2*a + 1;
            }else if(s.charAt(i)=='b'){
                ab = 2*ab + a;
            }else{
                abc = 2*abc + ab;
            }
        
        }
        return abc;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
