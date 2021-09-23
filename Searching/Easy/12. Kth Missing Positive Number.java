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


//Approach 2 Binary Search- O(log n)
class Solution {
    public int findKthPositive(int[] arr, int k) {

           int start=0, end=arr.length-1;
     
        while(start<=end){
            
            int mid=start+(end-start)/2;
            
            if(arr[mid]-mid-1<k){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
    return k+start; // arr[end] + (k-missingnumberscount)
    }
}
// Time Complexity : O(log n)


  //Approach 3
  //By freqquency Array
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] count = new int[1001];
        for(int n : arr){
            count[n]++;
        }
        
        int c = 1, ans=0;
        while(ans<k){
            if (c>=arr.length||count[c] == 0){
                ans++;
            }
            c++;
        }
        return c-1;
    }
}
 // Not working for some test cases
 