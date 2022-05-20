// 841. Keys and Rooms

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        List<Integer> components = new ArrayList<Integer>();
        connectedRooms(rooms, 0, visited, components);
        if(components.size() == rooms.size()){
            return true;
        }
       return false;
    }
    
    public void connectedRooms(List<List<Integer>> rooms, int room, boolean[] visited, List<Integer> components){
       
        if(visited[room]==false){
        components.add(room);}
        
        if(visited[room] == false){
               visited[room] = true;
            for(int keys : rooms.get(room)){
               connectedRooms( rooms, keys, visited, components);
            }
        }
       
    }
}
