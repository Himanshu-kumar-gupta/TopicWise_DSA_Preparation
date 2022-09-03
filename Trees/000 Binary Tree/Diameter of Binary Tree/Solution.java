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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root)[0]-1;
    }
    
    static int[] diameter(TreeNode root) {
        //[0] denotes diameter
        //[1] denotes height
        int res[]={0,0};
        
        if(root==null)
            return res;
        
        int left[]=diameter(root.left);
        int right[]=diameter(root.right);
        
        //Calculating height
        res[1] = Math.max(left[1],right[1])+1;
        
        //Calculating diameter
        //diam1 = left diam = laft[0]
        //diam2 = right diam = right[0]
        //diam3 = passess through root = left height+ right height+ 1
        res[0] = Math.max(Math.max(left[0],right[0]), left[1]+right[1]+1);
        
        return res;
    }
}
