class Solution {
    fun maximumDifference(nums: IntArray): Int {
        var maxDiff = 0
        var min = nums[0]
        
        for(i in nums)
            //Update min element in every iteration
            // If element is greater than min ,it could be candidate for maxDiff
            if(i>min) {
                if(i-min>maxDiff)
                    maxDiff=i-min
            }
            else
                min=i
        
        return if(maxDiff==0) -1 else maxDiff            
    }
}
