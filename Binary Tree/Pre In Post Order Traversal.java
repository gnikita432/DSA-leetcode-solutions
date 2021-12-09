// Pre Post In Order Traversal

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 // Pre Order Traversal

class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> ans = new ArrayList<>();
        return preorder(ans, root);
        
    }
    public List<Integer> preorder(List ans , TreeNode root){
        if(root == null){
            return ans;
        }
        
        ans.add(root.val);
        preorder(ans, root.left);
        preorder(ans, root.right);
        
        return ans;
    }
}

// In Order Traversal

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> ans = new ArrayList<>();
        
        return preorder(ans, root);
        
    }
    
    public List<Integer> preorder(List ans , TreeNode root){
        if(root == null){
            return ans;
        }
        
        preorder(ans, root.left);
        ans.add(root.val);
        preorder(ans, root.right);
        
        return ans;
    }
}
