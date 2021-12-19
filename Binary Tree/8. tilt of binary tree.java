// 563. Binary Tree Tilt

public class Solution {
    int result = 0;
    
    public int findTilt(TreeNode root) {
        postOrder(root);
        return result;
    }
    
    private int postOrder(TreeNode root) {
        if (root == null) return 0;
        
        int left = postOrder(root.left);
        int right = postOrder(root.right);
        
        result += Math.abs(left - right);
        
        return left + right + root.val;
        
    }
}
