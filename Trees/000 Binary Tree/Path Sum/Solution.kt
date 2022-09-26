/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        if(root==null)
            return false
        else if(root.left==null && root.right==null && root.`val`==targetSum)
            return true
        else
            return hasPathSum(root.left,targetSum-root.`val`) || hasPathSum(root.right,targetSum-root.`val`)
    }
}
