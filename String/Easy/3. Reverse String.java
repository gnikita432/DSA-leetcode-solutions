//344. Reverse String

//Recurssive Approach
class Solution {
    public void reverseString(char[] s) {
        
        recurssiveReverse(s, 0, s.length-1);
        
    }
    
    public void recurssiveReverse(char[] s, int i, int j){
        
        if(i>=j){
            return;
        }
        
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
        
        recurssiveReverse(s, i+1, j-1);
    }
}


//Iterative approach
class Solution {
    public void reverseString(char[] s) {
        
        int i=0, j=s.length-1;
        while(i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            i++;
            j--;
        }
        
    }
}
// Time Complexity : O(n)
// Space Complexity :O(1)