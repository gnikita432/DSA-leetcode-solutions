// 110. Balanced Binary Tree

class Solution {
    
    boolean isbalanced = true;
    
    public boolean isBalanced(TreeNode root) {
        
        heightBalanced(root);
        return isbalanced;
        
    }
    
    public int heightBalanced(TreeNode root){
        
        if(root == null){
            return 0;
        }
        
        int lh = heightBalanced(root.left);
        int rh = heightBalanced(root.right);
        
       
        if(Math.abs(lh-rh)>1){
            isbalanced = false;
        }
        
        return Math.max(lh, rh)+1;
    }
    
}
