// 938. Range Sum of BST

class Solution {
    
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        
        if(root == null){
            return 0;
        }
        
        if(low > root.val){
            rangeSumBST(root.right, low, high);
        }
        else if(high < root.val){
            rangeSumBST(root.left, low, high);
        }
        else{
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
            sum += root.val;
        }
        return sum;
    }
}
