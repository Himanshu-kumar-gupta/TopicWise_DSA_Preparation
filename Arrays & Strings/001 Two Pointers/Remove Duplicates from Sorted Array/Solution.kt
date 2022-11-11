class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var unqPos = 1
        for(i in 1..nums.size-1)
            // If no duplicacy found add element at unique pos
            if(nums[i]!=nums[i-1])
                nums[unqPos++] = nums[i]
        
        return unqPos
    }
}
