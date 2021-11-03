// Tower Of Hanoi 

class Hanoi {

    public long toh(int N, int from, int to, int aux) {
        
        if(N==0){
            return 0;
        }
        
       long c1 = toh(N-1, from, aux, to);
      
       System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        
       long c2 = toh(N-1, aux, to, from);
       
       return 1 + c1 + c2;
    }
}
// Time Complexity : O(2^n)
// Space Complexity : O(n)
