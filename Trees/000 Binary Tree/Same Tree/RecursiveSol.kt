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
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        if(p==null || q==null)
            return p==q
        
        if(p.`val` == q.`val`)
            return isSameTree(p.left,q.left) && return isSameTree(p.right,q.right)
        
        return false
    }
}
