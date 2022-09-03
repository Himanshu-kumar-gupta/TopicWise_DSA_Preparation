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
    public int maxLevelSum(TreeNode root) {
        //Initializing with min value as it can have value of -10^5
        int maxSum=Integer.MIN_VALUE,maxLevel=0,level=0;
        
        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(root);
        
        //Level order traversal as required
        while(!Q.isEmpty()) {            
            int sum=0;
            for(int i=Q.size();i>0;i--) {
                TreeNode temp = Q.poll();                
                sum+=temp.val;
                
                if(temp.left!=null)
                    Q.add(temp.left);
                
                if(temp.right!=null)
                    Q.add(temp.right);
            }
            
            level++;
            if(maxSum<sum) {
                maxSum=sum;
                maxLevel=level;
            }
        }
        
        return maxLevel;       
    }
}
