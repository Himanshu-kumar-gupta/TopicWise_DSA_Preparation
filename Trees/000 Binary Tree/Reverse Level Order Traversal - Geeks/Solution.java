class Tree
{
    public ArrayList<Integer> reverseLevelOrder(Node node) 
    {
        ArrayList<Integer> res= new ArrayList<>();
        Queue<Node> Q=new LinkedList<>();
        Q.add(node);
        Q.add(null);
        
        while(!Q.isEmpty()) {
            Node temp=Q.poll();
            
            if(temp==null) {
                if(!Q.isEmpty())
                    Q.add(null);
            }
            else {
                res.add(temp.data);
                
                //Adding left elements later so in reverse they come first
                if(temp.right!=null)
                    Q.add(temp.right);
                
                if(temp.left!=null) 
                    Q.add(temp.left);
            }
        }
        
        Collections.reverse(res);
        
        return res;
        
    }
}      
