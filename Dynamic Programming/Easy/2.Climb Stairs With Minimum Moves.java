//Climb Stairs With Minimum Moves

//Recurssion Approach

 public static int minpaths(int idx, int n, int[] arr){
        
        if(idx == n){
            return 0;
        }
        
        int min = Integer.MAX_VALUE;
        for(int jumps=1; jumps<=arr[idx] && jumps+idx<=n; jumps++){
            int path = minpaths(idx+jumps, n, arr);
           if(min > path){
               min = path;
           }
        }
        if(min==Integer.MAX_VALUE){
            return min; //returning min because it will be the maximum among all the other path while if i return min+1 in this case it will exceed the range and the value will go negative and therefore minimum answer will come as this min value -23..... 
        }
        return min + 1;
    }
    