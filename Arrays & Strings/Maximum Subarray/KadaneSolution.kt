class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum=0
        var maxSum= nums[0]
        
        for(i in nums) {
            //If sum is -ve
            //Start sum from current element
            //negative number will decrease the value
            if(sum<0)
                sum=i
            //Add the current element to sum if positive 
            else
                sum+=i
            
            //Update maxSum
            if(sum>maxSum)
                maxSum=sum
        }
        
        return maxSum
    }
}
