/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
        int i;
        for(i=1;i<ind && node.next!=null;i++)
           node=node.next;
       
        if(i!=ind)
            return -1;
        else
            return node.data;
       
    }
}
