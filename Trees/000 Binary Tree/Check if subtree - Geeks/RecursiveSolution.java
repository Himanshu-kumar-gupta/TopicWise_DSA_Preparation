class Solution {
    public static boolean isSubtree(Node T, Node S) {
        //Peform preOrder traversal with checking identical at T
        if(T==null)
            return false;

        if(isIdentical(T,S))
            return true;
        
        return isSubtree(T.left, S) || isSubtree(T.right, S);
    }
    
    public static boolean isIdentical(Node root, Node subRoot) {
        //if any one of root or subRoot is null -> return false, as they cannot be identical
        //If both are null -> return true as identical, This check also works for leaf nodes
        if(root==null || subRoot == null)
            return root==subRoot;
        
        //If roots are equal proceed for left and right tree
        if(root.data==subRoot.data)
            //Return true if both are identical
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        
        return false;
    }
}
