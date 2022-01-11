//Validate BST

//giving error in corner cases

class Solution {
    public boolean isValidBST(TreeNode root) {
     BSTPair ans =  isBST(root);
        return ans.isBST;
    }
    public class BSTPair{
        boolean isBST;
        int min;
        int max;
    }
    public BSTPair isBST(TreeNode node){
          if (node == null) {
      BSTPair bp = new BSTPair();
      bp.min = Integer.MAX_VALUE;
      bp.max = Integer.MIN_VALUE;
      bp.isBST = true;
      return bp;
    }

    BSTPair lp = isBST(node.left);
    BSTPair rp = isBST(node.right);

    BSTPair mp = new BSTPair();
    mp.min = Math.min(node.val, Math.min(lp.min, rp.min));
    mp.max = Math.max(node.val, Math.max(lp.max, rp.max));
    mp.isBST = lp.isBST && rp.isBST && node.val >= lp.max && node.val <= rp.min;

    return mp;
    }
}
