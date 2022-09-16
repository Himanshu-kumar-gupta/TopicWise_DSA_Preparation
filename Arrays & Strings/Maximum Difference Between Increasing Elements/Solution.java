class Solution {
    public int maximumDifference(int[] nums) {
        int maxDiff = 0;
        int min = nums[0];
        
        for(int i : nums)
            //Update min element in every iteration
            // If element is greater than min ,it could be candidate for maxDiff
            if(i>min) {
                if(i-min>maxDiff)
                    maxDiff=i-min;
            }
            else
                min=i;
        
        return (maxDiff==0)? -1 : maxDiff;     
    }
}
