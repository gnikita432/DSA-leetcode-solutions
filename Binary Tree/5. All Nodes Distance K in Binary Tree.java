// 863. All Nodes Distance K in Binary Tree

class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        
        List <TreeNode> path = rootToNode(root, target);
       
        List<Integer> ans = new ArrayList<>();
        
        for(int i = 0; i<path.size(); i++){
          TreeNode blocker = i-1>=0? path.get(i-1) : null;
           ans.addAll(klevelDown(path.get(i), k-i, new ArrayList<>(), blocker));
        }
        
     return ans;
    }
    
    public List<TreeNode> rootToNode(TreeNode root, TreeNode target){
        
        if(root == null){
            return new ArrayList<>();
        }
        
        if(root.val == target.val){
            List<TreeNode> path = new ArrayList<>();
            path.add(target);
            return path;
        }
       
        
       List<TreeNode> lp = rootToNode(root.left, target);
        if(lp.size()>0){
            lp.add(root);
            return lp;
        }
       List<TreeNode> rp = rootToNode(root.right, target);
        if(rp.size()>0){
            rp.add(root);
            return rp;
        }
        
        return new ArrayList<>();
        
    }
    
    public List<Integer> klevelDown(TreeNode target, int k, List<Integer> nodes, TreeNode blocker){
        if(target == null){
            return nodes;
        }
        if(target == blocker){
            return nodes;
        }
        
        if(k==0){
           
            nodes.add(target.val);
            return nodes;
        }
        if(k<0){
            return nodes;
        }
        
        
        klevelDown(target.left, k-1, nodes, blocker);
        klevelDown(target.right, k-1, nodes, blocker);
         
        return nodes;
    }
    
}
