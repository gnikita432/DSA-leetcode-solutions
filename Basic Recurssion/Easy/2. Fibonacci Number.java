//509. Fibonacci Number

class Solution {
    public int fib(int n) {

        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return  fib(n - 1) + fib(n - 2);  
    } 
}
// Time Complexity : O(n)
// Space Complexity : O(n)
