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

  