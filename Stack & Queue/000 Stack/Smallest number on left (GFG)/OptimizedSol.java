class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        Stack<Integer> st = new Stack<>();
        List<Integer> res = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && a[i]<=st.peek())
                st.pop();
            
            if(st.isEmpty())
                res.add(-1);
            else
                res.add(st.peek());
                
            st.add(a[i]);
        }
        
        return res;
    }
}
