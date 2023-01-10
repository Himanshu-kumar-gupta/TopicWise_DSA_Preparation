class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long res[] = new long[n];
        Stack<Long> st = new Stack<>();
        
        // Traversing from end
        for(int i=n-1;i>=0;i--) {
            
            if(st.isEmpty())
                res[i]=-1;
            // If greater element found then it is answer
            else if(arr[i]<st.peek())
                res[i] = st.peek();
            else {
                // Remove while stack is not empty or less element found
                // Update the answer otherwise
                while(!st.isEmpty() && arr[i]>=st.peek())
                    st.pop();
                    
                if(st.isEmpty())
                    res[i]=-1;
                else
                    res[i] = st.peek();
            }
            
            st.add(arr[i]);    
        }
        
        return res;
    } 
}
