class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) 
    {
        Stack<Integer> st = new Stack<>();
        long nsr[] = new long[(int)n];
        for(int i=(int)n-1;i>=0;i--) {
            while(!st.isEmpty() && hist[i]<=hist[st.peek()])
                st.pop();

            if(st.isEmpty())
                nsr[i] = n;
            else
                nsr[i] = st.peek();
            
            st.add(i);
        }

        st.clear();
        // Removed area array - See Solution.kt Leetcode
        long area = 0;
        long maxArea = 0;
        for(int i=0;i<(int)n;i++) {
            while(!st.isEmpty() && hist[i]<=hist[st.peek()])
                st.pop();
            
            // width = nsr - nsl -1
            // area = width * height
            if(st.isEmpty())
                // width = nsr-(-1)-1 
                area = nsr[i] * hist[i];
            else
                area = (nsr[i]-st.peek()-1) * hist[i];
            
            if(area>maxArea)
                maxArea = area;
            st.add(i);
        }

        return maxArea;
    }
}



