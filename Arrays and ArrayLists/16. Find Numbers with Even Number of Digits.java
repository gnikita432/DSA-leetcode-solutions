// 1295. Find Numbers with Even Number of Digits

class Solution {

    //Brute force approach
    public int findNumbers(int[] nums) {
        int evennos = 0;
        for(int i=0 ; i<nums.length ; i++){
            int n = nums[i];
            int digit = 0;
            while(n!=0){
            n=n/10;
            digit++;
            }
            if(digit%2==0){
                evennos++;
            }
        }
        return evennos;
    }
    
    //O(n) Approach
    public int findNumbers(int[] nums) {
        
        int count=0; 
        for(int i =0 ; i< nums.length; i++){ 
            if((nums[i]>9 && nums[i]<100) || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        return count;
    }
}
