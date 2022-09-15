class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        //Start Filling elements from last of Array
        //Decrease last, m and n by 1 for their respective array positions
        var last=m+n-1
        var mLast=m-1
        var nLast=n-1
        
        
        //Check for valid values of mLast & nLast before accessing them in array
        while(nLast>=0) {
            if(mLast>=0 && nums1[mLast]>=nums2[nLast])
                nums1[last--]=nums1[mLast--]
            else
                nums1[last--] = nums2[nLast--]
        }
    }
}
