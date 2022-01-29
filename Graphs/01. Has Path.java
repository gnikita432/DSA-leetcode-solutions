public static boolean hasPath(ArrayList[] graph, int src, int dest, boolean[] visited) {
  //base case
  if (src == dest)
    return true;

  //setting the value corresponding to src in visited as true.
  visited[src] = true;
  //applying for loop to access each neighbor of src
  for (Edge e : graph[src]) {
    //checking whether this neighbor has been visited or not.
    if (!visited[e.nbr]) {
      //if not than a recursive call is made to this neighbor and result is stored
      boolean nbrHasPath = hasPath(graph, e.nbr, dest, visited);
      //if result is true than true is returned.
      if (nbrHasPath)
        return true;
    }
  }
  //if control reaches this point than it means that none of the neighbor has a path
  //to reach the destination, so we false is returned.
  return false;
}

// Time Complexity: O(V+E)
// Where V is the number of vertices and E is the number of edges. In the worst case, all the vertices and all the edges will be travelled.
// The time complexity of the while loop (k log(k)).Which sum up to O(n log(k)).

// Space Complexity: O(V)
// It will be the height of the recursion stack, which can be O(V) at max.
