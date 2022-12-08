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
    ArrayList<TreeNode> r1Leafs = new ArrayList();
    int pos=0;
    boolean similar = true;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        getPreOrder(root1);
        checkLeaf(root2);
        if(pos!=r1Leafs.size())
            similar = false;
        return similar;
    }

    public void getPreOrder(TreeNode root) {
        if(root==null)
            return;
        getPreOrder(root.left);
        getPreOrder(root.right);

        if(root.left==null && root.right==null)
            r1Leafs.add(root);
    }

    public void checkLeaf(TreeNode root) {
        if(root==null)
            return;
        checkLeaf(root.left);
        checkLeaf(root.right);
        if(root.left==null && root.right==null) {
            if(pos>=r1Leafs.size()||root.val!=r1Leafs.get(pos++).val)
                similar=false;
        }
    }
}
