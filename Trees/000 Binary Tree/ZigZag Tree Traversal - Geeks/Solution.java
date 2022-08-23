class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
        ArrayList<Integer> res = new ArrayList<>();
        
        //Corner case
        if(root==null)
            return res;
           
        boolean leftToRight=true;
        
        //Performing level Order Traversal
        Queue<Node> Q= new LinkedList<>();
        Q.add(root);
        while(!Q.isEmpty()) {
            int lSize=Q.size();
            List<Integer> level= new LinkedList<>();
            
            //Traversing through each element in a level
            //And adding its left and right element to create the next level
            for(int i=0;i<lSize;i++) {
                Node temp = Q.poll();
                
                if(temp.left!=null) 
                    Q.add(temp.left);
                if(temp.right!=null)
                    Q.add(temp.right);

                // Adding elements in a level
                //and at alternate level change the direction
                if(leftToRight)
                    level.add(temp.data);
                else
                    level.add(0,temp.data);
            }
            res.addAll(level);
            //Changing the order after every level
            leftToRight=!leftToRight;
        }
        
        return res;
	}
}
