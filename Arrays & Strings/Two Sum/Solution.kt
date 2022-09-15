class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val res = IntArray(2)
        val seen = HashMap<Int,Int>()
        
        for(i in nums.indices) {
            if(seen.containsKey(target-nums[i])) {
                res[0]=seen[target-nums[i]]!!
                res[1] = i
                return res
            }
            else
                seen[nums[i]]=i
        }
        
        return res
    }
}

//O(N) as saerch in HashMap - O(1)
