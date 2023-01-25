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
        val area = IntArray(n)
        var maxArea = 0
        for(i in area.indices) {
            while(st.isNotEmpty() && heights[i]<=heights[st.peek()])
                st.pop()
            
            // width = nsr - nsl -1
            // area = width * height
            if(st.isEmpty())
                // width = nsr-(-1)-1 
                area[i] = nsr[i] * heights[i]
            else
                area[i] = (nsr[i]-st.peek()-1) * heights[i]
            
            if(area[i]>maxArea)
                maxArea = area[i]
            st.add(i)
        }

        return maxArea
    }
}
