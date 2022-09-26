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
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        return when {
            root == null || root.`val` == `val` -> root
            root.`val` > `val` -> searchBST(root.left, `val`)
            else -> searchBST(root.right, `val`)
        }
    }
}
