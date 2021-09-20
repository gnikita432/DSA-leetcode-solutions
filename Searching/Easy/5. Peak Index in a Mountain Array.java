// 852. Peak Index in a Mountain Array

//Brue force approach of linear search
class Solution {
 public int peakIndexInMountainArray(int[] arr) {
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i+1]<arr[i]){
                return i;
            }
        }
        return -1;
    }    
}
// Time Complexity : O(n)

//Optimized Approach- Binary Search
class Solution {
     public int peakIndexInMountainArray(int[] arr) {
       int start = 0, end = arr.length-1;
         int mid = 0;
        while(start<end){
            mid = start + (end-start)/2;
            
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }
            else if(arr[mid]<arr[mid-1]){
                end = mid;
            }
        }
         return start;
    }
}
// Time Complexity : O(log n)
