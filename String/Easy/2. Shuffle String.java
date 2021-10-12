// 1528. Shuffle String

class Solution {
    public String restoreString(String s, int[] indices) {
        
        char ans[] = s.toCharArray();
        int i = 0;
        while(i<s.length()){
            if(indices[i] != i){
                swap(ans, indices[i], i);
                
                int temp2 = indices[indices[i]];
                indices[indices[i]] =indices[i];
                indices[i] = temp2;
             
            }
            else{
                i++;
            }
        }
      
        String string = new String(ans);
        return string;
        
    }
    
   public char[] swap(char[] ch, int i, int j)
    {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
        return ch;
    }
    
}
// Time Complexity : O(n)
// Space Complexity :O(n)
