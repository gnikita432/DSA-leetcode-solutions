// 4. Median of Two Sorted Arrays

//Linearly - Two Pointer Approach
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int[] sarry = new int[nums1.length + nums2.length];
        int k = 0, i = 0, j = 0;
        
        while( k < sarry.length){
            if(i<nums1.length && j<nums2.length && nums1[i]<nums2[j]){
                sarry[k]=nums1[i];
                i++;
            }
            else if(j<nums2.length && i<nums1.length && nums2[j]<=nums1[i]){
                sarry[k]=nums2[j];
                j++;
            }
            else if(j<nums2.length){
                   sarry[k]=nums2[j];
                j++;
            }
             else if(i<nums1.length){
                   sarry[k]=nums1[i];
                i++;
            }
            
            k++;
        }
        
        if(sarry.length%2==0)
         return (sarry[(sarry.length-1)/2] + sarry[sarry.length/2])/(double)2;
        
        else
            return (double)(sarry[sarry.length/2]);

    }
}
// Time Complexity : O(n+m)
// Space Complexity : O(n+m)


