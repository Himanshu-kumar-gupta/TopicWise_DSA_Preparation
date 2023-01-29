class Solution {
    public int maxArea(int M[][], int n, int m) {
        int pre[] = new int[m];
        int area=0, maxArea =0;

        for(int i=0;i<n;i++) {
            // Adding the height of previous row
            // for 1 row of matrix the elements are already 0 in pre
            // If the height is zero in matrix we make height at that place 0 in pre, as it cannot add height
            for(int j=0;j<m;j++)
                if(M[i][j]==1)
                    pre[j]++;
                else
                    pre[j]=0;
            
            // calculate area on pre matrix
            area = maxAreaOfHistoG(pre);
            if(area>maxArea)
                maxArea = area;
        }
        
        return maxArea;
    }
    
    public static int maxAreaOfHistoG(int height[]) {
        int n=height.length;
        int nsr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && height[i]<=height[st.peek()]) 
                st.pop();
            
            if(st.isEmpty())
                nsr[i]=n;
            else
                nsr[i]=st.peek();
            
            st.add(i);
        }

        st.clear();
        int area =0;
        int maxArea = 0;
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && height[i]<=height[st.peek()]) 
                st.pop();

            if(st.isEmpty())
                area=nsr[i]*height[i];
            else
                area = (nsr[i]-st.peek()-1)*height[i];
            
            if(area>maxArea)
                maxArea = area;

            st.add(i);
        }   

        return maxArea;     
    }
}
