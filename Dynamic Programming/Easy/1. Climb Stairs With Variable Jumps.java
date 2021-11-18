//Climb Stairs With Variable Jumps

//Simple Recurssion approach

public static int countPaths(int[] arr, int index, int len) {
    if (index == len) {
      return 1;
    }
    int count = 0;
    for (int jump = 1; jump <= arr[index]; jump++) {
      if ((jump + index) <= len) {
        count += countPaths(arr, jump + index, len);
      } else {
        break;
      }
    }
    return count;
  }

  //DP - Memoization approach

public static int paths(int n, int[] arr, int idx, int[] qb){
      
      if(idx==n){
          return 1;
      }
      if(qb[idx]>0){
          return qb[idx];
      }
      
      int path = 0;
      for(int i = 1 ; i<=arr[idx]; i++){
          if(i+idx <= n){
      path += paths(n, arr, i+idx, qb);
          }
      }
      
      qb[idx] = path;
      return path;
  }

//DP - Tabulation Approach

public static int paths(int n, int[] arr){
  
  int[] tabulation = new int[n+1];
  
  tabulation[n] = 1;
  
  for(int t=n-1; t>=0; t--){
      for(int jump=1; jump<=arr[t] && jump+t<=n; jump++){
          tabulation[t] += tabulation[t+jump];
      }
  }
  
  return tabulation[0];
  
  }

// Time Complexity : O(n^2)
// Space Complexity : O(n)
