/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int curr = root.val;
        if(curr>p.val && curr>q.val)
            //both of them lie on left
            return lowestCommonAncestor(root.left,p,q);
        else if(curr<p.val && curr<q.val)
            //both of them lie on right
            return lowestCommonAncestor(root.right,p,q);
        else
            //first time they split
            //or p/q = curr
            return root;
    }
}
