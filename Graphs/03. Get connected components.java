// Get connected components

{
 ArrayList< ArrayList< Integer>> comps = new ArrayList< >();

    boolean[] visited = new boolean[vtces];

    for (int i = 0; i < vtces; i++) {

      if (visited[i] == false) {

        ArrayList< Integer> comp = new ArrayList< >();
        dfs(graph, i, visited, comp);
        comps.add(comp);
      }
    }

    System.out.println(comps);
}

  public static void dfs(ArrayList< Edge>[] graph, int src, boolean[] visited, ArrayList< Integer> comp) {

    visited[src] = true;
    comp.add(src);

    for (Edge e : graph[src]) {

      if (visited[e.nbr] == false) {

        dfs(graph, e.nbr, visited, comp);
      }
    }
  }

//   Time Complexity:
// The time complexity of the above code is O(V) as we are going to visit every vertex exactly once.

// Space Complexity:
// The space complexity of the above code is O(h) where h is the height of the recursion stack.
// So, dear reader, we hope that you have understood everything completely. We recommend you watch the complete solution video once to understand the concept once completely. With this, we have completed our discussion of this problem.

