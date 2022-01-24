// K Largest Elements

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(br.readLine());
    }

    int k = Integer.parseInt(br.readLine());

    PriorityQueue pq = new PriorityQueue <>();
    for (int i = 0; i < arr.length; i++) {
      if (i < k) {
        pq.add(arr[i]);
      } else {
        if (arr[i] > pq.peek()) {
          pq.remove();
          pq.add(arr[i]);
        }
      }
    }

    while (pq.size() > 0) {
      System.out.println(pq.remove());
    }
  }
}

// Complexities:
// Time Complexity: O((n log(k))
// The time complexity of for loop (k log(k) + 2((n-k) log(k))).

// The time complexity of the while loop (k log(k)).Which sum up to O(n log(k)).

// Space Complexity: O(k)
// The space complexity for the function O(k), which is the size of the priority queue used.
