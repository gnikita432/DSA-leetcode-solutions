// 102. Binary Tree Level Order Traversal

class Solution {
    public List < List < Integer >> levelOrder(TreeNode root) {

        List < List < Integer >> level = new ArrayList < > ();
        
        if(root == null){
            return level;
        }

        Queue < TreeNode > Qlist = new ArrayDeque < > ();
        Qlist.add(root);



        while (Qlist.size() > 0) {
            int count = Qlist.size();

            List < Integer > orders = new ArrayList < > ();
            for (int i = 0; i < count; i++) {


                TreeNode element = Qlist.remove();
                orders.add(element.val);

                if (element.left != null) {
                    Qlist.add(element.left);
                }
                if (element.right != null) {
                    Qlist.add(element.right);
                }

            }

            level.add(orders);
        }
        return level;
    }
}


//Another Approach without Queue

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        compute(ans,root,0);
        return ans;
    }
    
    public void compute(List<List<Integer>> ans,TreeNode curr,int level)
    {
        if(curr==null) return;
        
        if(ans.size()==level) 
            ans.add(new ArrayList<Integer>());
        
        ans.get(level).add(curr.val);
        
        compute(ans,curr.left,level+1);
        compute(ans,curr.right,level+1);
    }
}
