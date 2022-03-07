// Graph Constructor 

{
 ArrayList<Integer> [] graph = new ArrayList [n];
        
    for(int i=0 ; i<n ; i++){
        graph[i] = new ArrayList<>();
    }
    
    for(int i=0, j=0 ; i<edges.length; i++){
            graph[edges[i][j]].add(edges[i][j+1]);
            graph[edges[i][j+1]].add(edges[i][j]);
    }
    
    for(ArrayList<Integer> edge : graph){
        for(Integer e : edge){
        System.out.print( e + " ");
        }
        System.out.println();
    }
}     