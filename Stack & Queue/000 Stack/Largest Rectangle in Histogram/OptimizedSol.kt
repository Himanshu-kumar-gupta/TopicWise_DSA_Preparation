class Solution {
    fun largestRectangleArea(heights: IntArray): Int {
        val n = heights.size
        val st = Stack<Int>()
        val nsr = IntArray(n)
        for(i in n-1 downTo 0) {
            while(st.isNotEmpty() && heights[i]<=heights[st.peek()])
                st.pop()
            
            if(st.isEmpty())
                nsr[i] = n
            else
                nsr[i] = st.peek()
            
            st.add(i)
        }

        st.clear();
        // Removed area array - See Solution.kt
        var area = 0
        var maxArea = 0
        for(i in 0..n-1) {
            while(st.isNotEmpty() && heights[i]<=heights[st.peek()])
                st.pop()
            
            // width = nsr - nsl -1
            // area = width * height
            if(st.isEmpty())
                // width = nsr-(-1)-1 
                area = nsr[i] * heights[i]
            else
                area = (nsr[i]-st.peek()-1) * heights[i]
            
            if(area>maxArea)
                maxArea = area
            st.add(i)
        }

        return maxArea
    }
}
