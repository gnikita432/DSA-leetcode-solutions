// 104. Maximum Depth of Binary Tree

class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        int lmax = maxDepth(root.left);
        int rmax = maxDepth(root.right);
        
        return Math.max(lmax, rmax) + 1;
        
    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
