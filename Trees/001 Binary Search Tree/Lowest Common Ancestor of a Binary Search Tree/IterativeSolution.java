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
        
        //root will not be null, as we will get result before that
        while(true) {
            int curr = root.val;
            if(curr>p.val && curr>q.val)
                //both of them lie on left
                root=root.left;
            else if(curr<p.val && curr<q.val)
                //both of them lie on right
                root=root.right;
            else
                //first time they split
                //or p/q = curr
                return root;
        }

    }
}
