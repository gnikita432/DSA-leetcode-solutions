// Heap Sort

// Increasing order
public class Main {
  public static void main(String[] args) throws Exception {
    PriorityQueue< Integer> pq = new PriorityQueue< >();
    int[] ranks = (22, 99, 3, 11, 88, 4, 1)
    for (int i = val : ranks) {
      pq.add(arr[i]);
    }
    while (pq.size() > 0) {
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}


//Decreasing Order
public class Main {
  public static void main(String[] args) throws Exception {
    PriorityQueue< Integer> pq = new PriorityQueue< >(collections.reverseOrder());
    int[] ranks = (22, 99, 3, 11, 88, 4, 1)
    for (int i = val : ranks) {
      pq.add(arr[i]);
    }
    while (pq.size() > 0) {
      System.out.println(pq.peek());
      pq.remove();
    }
  }
}

// Time Commplexity : O(n log n)
// Space Commplexity : O(n)
