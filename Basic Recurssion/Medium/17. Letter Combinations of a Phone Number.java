// 17. Letter Combinations of a Phone Number

class Solution {
    
    static String[] codes={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public List<String> letterCombinations(String digits) {
     
    if(digits.equals("")){
            ArrayList<String> b=new ArrayList<>();
            return b;
        }
        
    return combinations(digits);
        
    }
    
    public List<String> combinations(String digits){
        
        if(digits.length() == 0){
            List<String> br = new ArrayList<>();
            br.add("");
            return br;
        }
        
       char c = digits.charAt(0);
        String s = digits.substring(1);
        
        List<String> res = combinations(s);
        
        int ch = c - '0';
        String code = codes[ch];
        
        List<String> fres = new ArrayList<>();
        
        for(String r : res){
            for(int i = 0; i<code.length(); i++){
               fres.add(code.charAt(i) + r) ;
            }
        }
        return fres;
    }
    
}
