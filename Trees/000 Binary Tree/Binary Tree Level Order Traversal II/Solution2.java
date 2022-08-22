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
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        //Corner case
        if(root==null)
            return res;
        
        //Performing level Order Traversal
        Queue<TreeNode> Q= new LinkedList<>();
        Q.add(root);
        Q.add(null);
        
        List<Integer> level = new ArrayList<>();
        while(!Q.isEmpty()) {
            TreeNode temp = Q.poll();
            
            if(temp==null) {
                List<Integer> tempList = new ArrayList<>();
                tempList.addAll(level);
                level.clear();
                
                //Adding the elements at first position 
                //So that at the last list comes as first 
                res.add(0,tempList);
                
                if(!Q.isEmpty())
                    Q.add(null);
            }
            else {
                level.add(temp.val);
                
                if(temp.left!=null) 
                    Q.add(temp.left);
                
                if(temp.right!=null)
                    Q.add(temp.right);
            }
        }
        
        return res;
    }
}
