class Solution {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        // Your code here
        return diameterRecur(root)[0];
    }
    
        static int[] diameterRecur(Node root) {
        //[0] denotes diameter
        //[1] denotes height
        int res[]={0,0};
        
        if(root==null)
            return res;
        
        int left[]=diameterRecur(root.left);
        int right[]=diameterRecur(root.right);
        
        //Calculating height
        res[1] = Math.max(left[1],right[1])+1;
        
        //Calculating diameter
        //diam1 = left diam = laft[0]
        //diam2 = right diam = right[0]
        //diam3 = passess through root = left height+ right height+ 1
        res[0] = Math.max(Math.max(left[0],right[0]), left[1]+right[1]+1);
        
        return res;
    }
}
