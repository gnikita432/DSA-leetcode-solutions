// 200. Number of Islands

class Solution {
    public int numIslands(char[][] grid) {
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int count = 0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(visited[i][j]==false && grid[i][j]=='1'){
                     connectedGraphs(grid, i, j, visited);
                    count++;
                }
            }
        }
        return count;
    }
    public void connectedGraphs(char[][] grid, int i, int j, boolean[][] visited){
        
        if( i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0' || visited[i][j]==true){
            return;
        }
        
        visited[i][j]=true;
        connectedGraphs(grid, i-1, j, visited);
        connectedGraphs(grid, i, j+1, visited);
        connectedGraphs(grid, i+1, j, visited);
        connectedGraphs(grid, i, j-1, visited);
        
    }
}

// Time Complexity:
// O(4*n2)
// O(4*n2) which is simply written as O(n2)
// This is because each cell of the matrix is processed at most 4 times. For Example, a particular cell can call a cell to its north, east, west or south.

// Space Complexity:
// O(n2)
// Since a 2D array is used to store "visited" elements hence the space complexity is quadratic.
