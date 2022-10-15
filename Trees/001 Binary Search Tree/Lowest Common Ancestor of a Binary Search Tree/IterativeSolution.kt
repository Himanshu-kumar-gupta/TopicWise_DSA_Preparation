/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        //root will not be null, as we will get result before that
        var rootC = root
        var curr = 0
        while(true) {
            curr = rootC!!.`val`
            if(curr>p!!.`val` && curr>q!!.`val`)
                //both of them lie on left
                rootC=rootC!!.left
            else if(curr<p!!.`val` && curr<q!!.`val`)
                //both of them lie on right
                rootC=rootC!!.right
            else
                //first time they split
                //or p/q = curr
                return rootC
        }
    }
}
