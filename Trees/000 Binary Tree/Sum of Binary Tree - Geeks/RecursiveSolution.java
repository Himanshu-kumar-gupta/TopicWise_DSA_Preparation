class BinaryTree
{
    static int sumBT(Node head){
        //Code
        if(head==null)
            return 0;
            
        int l=sumBT(head.left);
        int r=sumBT(head.right);
        
        return l+r+head.data;
    }
}
