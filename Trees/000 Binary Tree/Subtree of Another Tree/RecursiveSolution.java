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
    public boolean isIdentical(TreeNode root, TreeNode subRoot) {
        //if any one of root or subRoot is null -> return false, as they cannot be identical
        //If both are null -> return true as identical, This check also works for leaf nodes
        if(root==null || subRoot == null)
            return root==subRoot;
        
        //If roots are equal proceed for left and right tree
        if(root.val==subRoot.val)
            //Return true if both are identical
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        
        return false;
    }
    
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        //Peform preOrder traversal with checking identical at root
        if(root==null)
            return false;

        if(isIdentical(root,subRoot))
            return true;
        
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
