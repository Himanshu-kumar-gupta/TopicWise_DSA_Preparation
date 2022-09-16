class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxDiff = 0
        var min = prices[0]
        
        for(i in prices)
            //Update min element in every iteration
            // If element is greater than min ,it could be candidate for maxDiff
            if(i>min) {
                if(i-min>maxDiff)
                    maxDiff=i-min
            }
            else
                min=i
        
        return maxDiff  
    }
}
