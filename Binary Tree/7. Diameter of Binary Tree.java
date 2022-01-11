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


// Efficient Approach - O(n)

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
       
      diapair ans = diameter2(root);
       return ans.dia;
    }
    
     class diapair{
        int ht;
        int dia;
    }
    
    public diapair diameter2(TreeNode root){
        if(root == null){
            diapair bp = new diapair();
            bp.ht = -1;
            bp.dia = 0;
            return bp;
        }
        diapair ld = diameter2(root.left);
        diapair rd = diameter2(root.right);
        
        diapair mp = new diapair();
        mp.ht = Math.max(ld.ht, rd.ht)+1;
        
        int factor = ld.ht + rd.ht +2;
        mp.dia = Math.max(factor, Math.max(ld.dia, rd.dia) );
            
            return mp;
    }
    
}

