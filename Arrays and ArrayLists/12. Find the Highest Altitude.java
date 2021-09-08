//1732. Find the Highest Altitude

class Solution {
    public int largestAltitude(int[] gain) {

        int[] altitude = new int[gain.length+1];
        int max=altitude[0];
        
        for(int i = 1 ; i<altitude.length; i++){
            altitude[i]=altitude[i-1]+gain[i-1];
             if(altitude[i]>max){
                max=altitude[i];
            }
        }
        return max;
    }
}

// Example 1:

// Input: gain = [-5,1,5,0,-7]
// Output: 1
// Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.