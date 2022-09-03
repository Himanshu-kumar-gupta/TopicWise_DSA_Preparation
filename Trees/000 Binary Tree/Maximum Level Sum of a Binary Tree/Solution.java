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
        //Initializing with root level as it can have value of -10^5
        int maxSum=root.val,maxLevel=1,level=1;
        
        Queue<TreeNode> Q=new LinkedList<>();
        
        if(root.left!=null)
            Q.add(root.left);
        
        if(root.right!=null)
            Q.add(root.right);
        
        //Level order traversal as required
        while(!Q.isEmpty()) {
            int qSize=Q.size();
            int sum=0;
            for(int i=0;i<qSize;i++) {
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
