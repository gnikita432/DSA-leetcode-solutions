// Print All Paths

  public static void printAllPaths(ArrayList< Edge>[] graph, int src, int dest, boolean[] visited, String psf) {
    if (src == dest) {
      System.out.println(psf);
      return;
    }

    visited[src] = true;
    for (Edge e : graph[src]) {
      if (!visited[e.nbr]) {
        printAllPaths(graph, e.nbr, dest, visited, psf + e.nbr);
      }
    }
    visited[src] = false;
  }

printAllPaths(graph, src, dest, visited, src + "");
