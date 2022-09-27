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
    val seen = HashSet<Int>();
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        return when {
            root==null -> false
            seen.contains(k-root.`val`) -> true
            else -> { seen.add(root.`val`)
                    findTarget(root.left,k) || findTarget(root.right,k)
            }
        }
    }
}
