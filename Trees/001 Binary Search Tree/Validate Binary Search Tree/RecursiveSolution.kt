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
    fun isValidBST(root: TreeNode?, min:Long =Long.MIN_VALUE, max:Long =Long.MAX_VALUE): Boolean {
        return when {
            root==null -> true
            root.`val`<=min || root.`val`>=max -> false
            else -> isValidBST(root.left,min,root.`val`.toLong()) && isValidBST(root.right,root.`val`.toLong(),max)
        }
    }
}
