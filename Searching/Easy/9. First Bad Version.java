// 278. First Bad Version

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

// linear search Approach
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        for(int i=1;i<=n;i++){
            if(isBadVersion(i)){
                return i;
            }
        }
        return n;
    }
}
// Time Complexity : O(n)


// Binary Search Approach
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

         int first = 1;
         int last = n;
         int ans =-1;
        
        while(first<=last){
            
             int mid = first + (last-first)/2;
            
            if(isBadVersion(mid)){
                ans=mid;
                last=mid-1;
            }
            else{
               first=mid+1;
            }
        }
        
        return ans;
    }
}
// Time Complexity : O(log n)
