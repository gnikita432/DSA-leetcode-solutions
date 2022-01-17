//701. Insert into a Binary Search Tree

class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
        if(root == null){
            return new TreeNode(val, null , null);
        }
        
        if(val<root.val){
            root.left = insertIntoBST(root.left, val);
        }
        else if(val>root.val){
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
