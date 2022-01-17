// 700. Search in a Binary Search Tree

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        
        if(root == null){
            return null;
        }
        
        if(val>root.val){
            return searchBST(root.right, val);
        }
        else if(val<root.val){
           return  searchBST(root.left, val);
        }
        else{
            return root;
        }
    }
}
