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


//Same approach as above just space is optimized to constant
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        int k = 0, i = 0, j = 0, count=-1, bm=0;
        
        boolean iseven = (nums1.length + nums2.length) %2 ==0? true : false;
        int mid = (nums1.length + nums2.length) /2; 
        
        while(k < nums1.length + nums2.length){
            if(i<nums1.length && j<nums2.length && nums1[i]<nums2[j]){
               count++;
                if(count==mid){
                    return iseven? (bm+nums1[i])/(double)(2) : (double)(nums1[i]);
                }
                else if(count==mid-1){
                    bm = nums1[i];
                }
               
                i++;
            }
            else if(j<nums2.length && i<nums1.length && nums2[j]<=nums1[i]){
                 count++;
                  if(count==mid){
                    return  iseven? (bm+nums2[j])/(double)(2) : (double)(nums2[j]);
                }
                   else if(count==mid-1){
                   bm = nums2[j];
                }
                j++;
            }
            else if(j<nums2.length){
                 count++;
                  if(count==mid){
                    return  iseven? (bm+nums2[j])/(double)(2) : (double)(nums2[j]);
                }
                   else if(count==mid-1){
                     bm = nums2[j];
                }
                j++;
            }
             else if(i<nums1.length){
                   count++;
                   if(count==mid){
                    return  iseven? (bm+nums1[i])/(double)(2) : (double)(nums1[i]);
                }
                    else if(count==mid-1){
                     bm = nums1[i];
                }
                i++;
            }
            
            k++;
        }
        return -1;

    }
}
// Time Complexity : O(n+m)
// Space Complexity : O(1);


//Binary Search Approach - Most Optimal Approach
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        if(nums2.length<nums1.length)
            return findMedianSortedArrays(nums2, nums1);
        
        int low = 0, high = nums1.length;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            int cut1 = mid;
            int cut2 = (nums1.length + nums2.length + 1)/2 - cut1;
            
            int l1 = cut1==0? Integer.MIN_VALUE : nums1[cut1-1]; 
            int l2 = cut2==0? Integer.MIN_VALUE : nums2[cut2-1];
            int r1 = cut1==nums1.length? Integer.MAX_VALUE : nums1[cut1]; 
            int r2 = cut2==nums2.length? Integer.MAX_VALUE : nums2[cut2];
            
            if(l1<=r2 && l2<=r1){
                if((nums1.length+nums2.length)%2==0)
                    return (Math.max(l1,l2)+Math.min(r1,r2)) / 2.0;
                else
                    return Math.max(l1,l2) ;
            }
            else if(l1>r2){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return 0.0;
    }
}
// Time Complexity : O(log min(n,m))
// Space Complexity : O(1)
