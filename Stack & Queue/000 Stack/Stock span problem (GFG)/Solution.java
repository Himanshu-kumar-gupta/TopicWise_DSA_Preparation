


class Solution
{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int res[] = new int[n];
        
        Stack<Integer> st = new Stack<>(); 
        
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && price[i]>=price[st.peek()])
                st.pop();
            
            if(st.isEmpty())
                res[i]=i+1;
            else
                res[i]=i-st.peek();
            
            st.add(i);
        }
        
        return res;
    }
    
}
