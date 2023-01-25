class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st = new Stack();
        int nsr[] = new int[n];
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])
                st.pop();
            
            if(st.isEmpty())
                nsr[i] = n;
            else
                nsr[i] = st.peek();
            
            st.add(i);
        }

        st.clear();
        // Removed area array - See Solution.kt
        int area = 0;
        int maxArea = 0;
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && heights[i]<=heights[st.peek()])
                st.pop();
            
            // width = nsr - nsl -1
            // area = width * height
            if(st.isEmpty())
                // width = nsr-(-1)-1 
                area = nsr[i] * heights[i];
            else
                area = (nsr[i]-st.peek()-1) * heights[i];
            
            if(area>maxArea)
                maxArea = area;
            st.add(i);
        }

        return maxArea;
    }
}
