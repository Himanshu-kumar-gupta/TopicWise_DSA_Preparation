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
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        if(root==null)
            return TreeNode(`val`)
        var curr=root
        var prev=root
        
        while(curr!=null) {
            prev=curr
            if(`val`<curr.`val`)
                curr=curr.left
            else
                curr=curr.right
        }
        
        if(`val`<prev!!.`val`)
            prev.left=TreeNode(`val`)
        else
            prev.right=TreeNode(`val`)
        
        return root   
    }
}
