class Solution {
    fun pivotIndex(nums: IntArray): Int {
        val len=nums.size
        val sums = IntArray(len)
        
        //Adding left sum to array
        for(i in 1 until len)
            sums[i] = sums[i-1]+ nums[i-1]
        
        
        val total = sums[len-1]+nums[len-1]     
        //Comapring left sum to right sum
        for(i in nums.indices)
            //Right sum = total sum(sum at last+last element) - sum at position - element at position
            if(sums[i]==total-sums[i]-nums[i])
                return i;
        
        return -1;
    }
}
