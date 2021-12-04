// 20. Valid Parentheses

public class Solution {
    public boolean isValid(String s) {
        
        if(s.length() % 2 ==1 ){
            return false;
        }

        Stack<Character> stack = new Stack ();
        
        // Iterate through string until empty
        for(int i = 0; i<s.length(); i++) {
            
            // Push any open parentheses onto stack
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            
            // Check stack for corresponding closing parentheses, false if not valid
            
            else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(')
                stack.pop();
            
            else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[')
                stack.pop();
            
            else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{')
                stack.pop();
            
            else
                return false;
            
        }
        
        // return true if no open parentheses left in stack
        return stack.empty();
        
    }
}
