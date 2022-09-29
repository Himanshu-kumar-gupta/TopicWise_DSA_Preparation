class Solution {
    fun findClosestNumber(nums: IntArray): Int {
        var close = nums[0]
        
        for(i in nums) {
            var c = Math.abs(close)
            
            //Change if absolute value is less than closest
            //if equal take the positive value
            if(Math.abs(i)<c || i==c)
                close=i
        }
        
        return close
    }
}
