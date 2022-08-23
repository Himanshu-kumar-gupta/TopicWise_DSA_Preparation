class Node {
    int data;
    Node left;
    Node right;

    Node(int dta) {
        this.data=dta;
        this.left=null;
        this.right=null;
    }
}
public class MakeTree {
    static int index=-1;
    static int[] treeNodes;

    //Function to change array to binary tree and returns the root node
    public static Node buildTree() {
        index++;

        if(treeNodes[index]==-1)
            return null;

        Node newNode = new Node(treeNodes[index]);
        newNode.left=buildTree();
        newNode.right=buildTree();

        return newNode;
    }
    public static void main(String[] args) {
        treeNodes= new int[]{9,7,-1,3,-1,-1,2,1,-1,-1,5,-1,-1};
        System.out.println(buildTree().data);
    }
}
