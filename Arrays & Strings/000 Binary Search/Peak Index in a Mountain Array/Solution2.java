class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0, end = arr.length-1;

        // Finding the Peak ele
        // Using < instead of <= so that when extreme elements we do not move out of bound
        // also it works because it is clear that ele is present and will be at start==end
        while(start<end) {
            int mid = start + (end-start)/2;

          // As we are checking only > not = thus, end = mid
            if(arr[mid+1]>arr[mid])
                start = mid + 1;
            else
                end = mid;
        }

        return start;
    }
}
