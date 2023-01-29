class Solution {
    fun maximalRectangle(matrix: Array<CharArray>): Int {
        val pre = IntArray(matrix[0].size)
        var area = 0
        var maxArea = 0

        for(i in 0..matrix.size-1) {
            for(j in 0..pre.size-1)
                if(matrix[i][j]=='1')
                    pre[j]++
                else
                    pre[j]=0

            area = maxAreaOfHistoG(pre)

            if(area>maxArea)
                maxArea = area
        }

        return maxArea
    } 

    fun maxAreaOfHistoG(height: IntArray): Int {
        val n= height.size
        val nsr = IntArray(n)
        val st = Stack<Int>()

        for(i in n-1 downTo 0) {
            while(st.isNotEmpty() && height[i]<=height[st.peek()])
                st.pop()
            
            nsr[i] = if(st.isEmpty())
                n
            else
                st.peek()

            st.add(i)                
        } 

        st.clear()
        var area = 0
        var maxArea = 0

        for(i in 0..n-1) {
            while(st.isNotEmpty() && height[i] <= height[st.peek()])
                st.pop()
            
            area = if(st.isEmpty())
                nsr[i] * height[i]
            else
                (nsr[i]-st.peek()-1)*height[i]
            
            if(area>maxArea)
                maxArea = area
            
            st.add(i)
        }

        return maxArea
    }
}
