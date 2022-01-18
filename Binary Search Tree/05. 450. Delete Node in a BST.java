//450. Delete Node in a BST

class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root == null){
            return null;    
        }
        if(key > root.val){
            root.right = deleteNode(root.right, key);
        }
        else if(key < root.val){
            root.left = deleteNode(root.left, key);
        }
        else{ // key == root.val
            if(root.right==null && root.left==null){
                return null;
            }
            else if(root.right!=null && root.left!=null){
                TreeNode node = lowest(root.right);
                deleteNode(root, node.val);
                root.val = node.val;
                return root;
            }
            else{
                return root.left==null? root.right : root.left;
            }
        }
        return root;
    }
    public TreeNode lowest(TreeNode root){
        if(root.left != null){
            return lowest(root.left);
        }else{
            return root;
        }
    }
}
