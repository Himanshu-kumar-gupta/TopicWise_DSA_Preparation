class Solution {
    public int trap(int[] height) {
        int n=height.length;

        // Finding max to left for each element
        int maxToLeft[] = new int[n];
        maxToLeft[0] = height[0];
        for(int i=1;i<n;i++)
            maxToLeft[i]=Math.max(height[i],maxToLeft[i-1]);

        // Finding max to right for each element
        int maxToRight[] = new int[n];
        maxToRight[n-1] = height[n-1];
        for(int i=n-2;i>=0;i--)
            maxToRight[i]=Math.max(height[i],maxToRight[i+1]);

        int min = 0, water =0;
        for(int i=0;i<n;i++) {
            // Finding min as level of water will be at the min level of max left and max right
            min = Math.min(maxToLeft[i],maxToRight[i]);

            //Water Stored will be excluded of building height if building height is lower than min
            water += min - height[i];
        }

        return water;
    }
}
