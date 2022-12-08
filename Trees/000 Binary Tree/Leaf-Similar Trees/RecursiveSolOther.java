/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1Leaf = getPostOrder(root1,new ArrayList<Integer>());
        ArrayList<Integer> r2Leaf = getPostOrder(root2,new ArrayList<Integer>());

        return r1Leaf.equals(r2Leaf);
    }

    public ArrayList<Integer> getPostOrder(TreeNode root, ArrayList<Integer> leaf) {
        if(root==null)
            return leaf;
        getPostOrder(root.left,leaf);
        getPostOrder(root.right,leaf);

        if(root.left==null && root.right==null)
            leaf.add(root.val);
        
        return leaf;
    }
}
