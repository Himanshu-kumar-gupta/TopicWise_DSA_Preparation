class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val nCount = HashMap<Int,Int>()
        val res = ArrayList<Int>()
        
        //Add the count of each element of one array in HashMap 
        for(i in nums1) 
            nCount[i]= nCount.getOrDefault(i,0)+1
        
        
        for(i in nums2) {
            //If HashMap contains the key with valid count add it to result 
            //and subtract count of element in HashMap by 1
            if(nCount.containsKey(i) && nCount[i]!!>0) {
                res.add(i)
                nCount[i]=nCount[i]!!-1
            }
        }
        
        //Convert ArrayList to array
        return res.toIntArray()
    }
}
