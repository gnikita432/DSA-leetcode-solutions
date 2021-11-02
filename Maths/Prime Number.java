// Check if the number is prime number or not
// https://practice.geeksforgeeks.org/problems/prime-number2314/1#

class Solution{
    static int isPrime(int N){

        if(N<=1){
            return 0;
        }
        
        int c = 2; 
        while(c*c <= N){
            if(N%c==0){
                return 0;
            }
            c++;
        }
        return 1;
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
