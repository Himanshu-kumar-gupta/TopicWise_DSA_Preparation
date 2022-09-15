class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0, maxSum= nums[0];
        
        for(int i:nums) {
            //If sum is -ve
            //Start sum from current element
            //negative number will decrease the value
            if(sum<0)
                sum=i;
            //Add the current element to sum if positive 
            else
                sum+=i;
            
            //Update maxSum
            if(sum>maxSum)
                maxSum=sum;
        }
        
        return maxSum;
    }
}
