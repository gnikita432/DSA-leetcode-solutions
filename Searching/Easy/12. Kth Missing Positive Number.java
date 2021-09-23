// 1539. Kth Missing Positive Number

 //Approach 1
 //Linear Search- 0ms 100% faster
class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int i=1, j=0, count=0;
        while(count<k){
            if(j<arr.length && i == arr[j]){
                j++;
            }
            else{
                count++;
            }
            i++;
        }
        return i-1;
    }
}
// Time Complexity : O(n)
