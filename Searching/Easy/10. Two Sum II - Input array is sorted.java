// 167. Two Sum II - Input array is sorted

// 1 linear search approach which uses 2 for loop to check sum- O(n^2)

// 2 Binary Search Approach- O(n log n)
// Consider each element and find is (target-nums[i]) exist in array range [i+1,N-1]? (If yes, we are done), else increment one step, then again search the element exist in array.
class Solution {
public int[] twoSum(int[] numbers, int target) {
    
        for(int i = 0; i < numbers.length - 1; i++){
            
            int low = i + 1, high = numbers.length - 1;
            
            while(low <= high){
                
               int mid = low + (high - low)/2;
                
                if(numbers[mid] == target - numbers[i]){
                    return new int[]{i+1, mid+1};
                }
                else if(numbers[mid] < target - numbers[i]){
                    low = mid + 1;
                } 
                else {
                    high = mid - 1;
                }
                
            }
        }
        return new int[]{-1,-1};
    }
}
// Time Complexity : O(n log n)
// Space Complexity : O(1)

//Optimum Solution using Two Pointers- O(n)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int start = 0, end = numbers.length-1;
        
        for(int i=0; i<numbers.length; i++){
            if(numbers[start]+numbers[end]<target){
                start++;
            }
            else if(numbers[start]+numbers[end]>target){
                end--;
            }
            else{
                return new int[]{start+1,end+1};
            }
        }
        return new int[]{-1,-1};
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
