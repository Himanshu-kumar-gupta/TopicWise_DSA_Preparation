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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        
        //Corner case
        if(root==null)
            return res;
        
        boolean leftToRight=true;
        
        //Performing level Order Traversal
        Queue<TreeNode> Q= new LinkedList<>();
        Q.add(root);

        while(!Q.isEmpty()) {
            int lSize=Q.size();
            //Using LinkedList as it is better in shifting
            List<Integer> level = new LinkedList<>();
            
            //Traversing through each element in a level
            //And adding its left and right element to create the next level
            for(int i=0;i<lSize;i++) {
                TreeNode temp = Q.poll();
                
                if(temp.left!=null) 
                    Q.add(temp.left);
                
                if(temp.right!=null)
                    Q.add(temp.right);
                
                if(leftToRight)
                    level.add(temp.val);
                else
                    //Adding the elements at first position 
                    //So that at the right most element comes as first(reverse)
                    level.add(0,temp.val);
            }
            
            res.add(level);
            
            //Changing the order after every level
            leftToRight=!leftToRight;
        }
        
        return res;
    }
}
