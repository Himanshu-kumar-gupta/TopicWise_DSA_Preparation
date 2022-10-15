/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if(root==null || root==p || root==q)
            return root
        
        val left = lowestCommonAncestor(root.left,p,q)
        val right = lowestCommonAncestor(root.right,p,q)
        
        return when {
            left==null -> right
            right==null -> left
            //on both side we got not null
            //thus, on both side we got our elements
            else -> root
        }
    }
}
