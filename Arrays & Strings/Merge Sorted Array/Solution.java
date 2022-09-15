class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //Start Filling elements from last of Array
        //Decrease last, m and n by 1 for their respective array positions
        int last=m+n-1;
        m--;
        n--;
        
        //Check for valid values of m&n before accessing them in array
        while(n>=0) {
            if(m>=0 && nums1[m]>=nums2[n])
                nums1[last--]=nums1[m--];
            else
                nums1[last--] = nums2[n--];
        }
    }
}
