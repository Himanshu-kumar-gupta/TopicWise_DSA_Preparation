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
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val r1Leaf:ArrayList<Int> = getPostOrder(root1,ArrayList<Int>())
        val r2Leaf:ArrayList<Int> = getPostOrder(root2,ArrayList<Int>())

        return r1Leaf.equals(r2Leaf)
    }

    fun getPostOrder(root: TreeNode?, leaf:ArrayList<Int>):ArrayList<Int> {
        root ?: return leaf
        getPostOrder(root.left,leaf)
        getPostOrder(root.right,leaf)

        if(root.left==null && root.right==null)
            leaf.add(root.`val`)
        
        return leaf
    }
}
