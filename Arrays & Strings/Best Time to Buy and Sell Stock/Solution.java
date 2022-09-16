class Solution {
    public int maxProfit(int[] prices) {
        int maxDiff = 0;
        int min = prices[0];
        
        for(int i : prices)
            //Update min element in every iteration
            // If element is greater than min ,it could be candidate for maxDiff
            if(i>min) {
                if(i-min>maxDiff)
                    maxDiff=i-min;
            }
            else
                min=i;
        
        return maxDiff;
    }
}
