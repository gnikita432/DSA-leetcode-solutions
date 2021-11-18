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

//DP - Memoization Approach

 public static int minpaths(int idx, int n, int[] arr, int[] qb){
        
        if(idx == n){
            return 0;
        }
        if(qb[idx]>0){
            return qb[idx];
        }
        
        int min = Integer.MAX_VALUE;
        for(int jumps=1; jumps<=arr[idx] && jumps+idx<=n; jumps++){
            int path = minpaths(idx+jumps, n, arr, qb);
           if(min > path){
               min = path;
           }
        }
        
        int ans = min + 1;
        
        if(min==Integer.MAX_VALUE){
            ans = min; //returning min because it will be the maximum among all the other path while if i return min+1 in this case it will exceed the range and the value will go negative and therefore minimum answer will come as this min value -23..... 
        }
       
        qb[idx] = ans;
        
        return ans; 
    }


//DP - Tabulation Approach
 public static int minpathstab(int n, int[] arr){
        
        int[] tabulation = new int[n+1];
        
        tabulation[n]=0;
        for(int tab = n-1; tab>=0; tab--){
            int min = Integer.MAX_VALUE;
            for(int jumps=1; jumps<=arr[tab] && tab+jumps<=n; jumps++){
              int pans = tabulation[tab+jumps];
               if(min>pans){
                   min=pans;
               }
            }
            tabulation[tab]= min==Integer.MAX_VALUE? min : min+1;
        }
        return tabulation[0];
    }
    // Time Complexity : O(n^2)
    // Space Complexity:O(n)
    