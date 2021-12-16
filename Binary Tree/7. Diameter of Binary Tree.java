// 543. Diameter of Binary Tree

// Inefficient way - O(n^2)
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        
        int dvr = height(root.left) + height(root.right) + 2;
        
        int dia = Math.max(dvr, Math.max(ld,rd));
        
        return dia;
        
    }
    
    public int height(TreeNode root){
        
        if(root == null){
            return -1;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        int h = Math.max(lh,rh)+1;
        return h;
        
    }
}
