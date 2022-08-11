class Solution {
    public int findMin(int[] nums) {
        int len=nums.length;
        int start=0,end=len-1;
        
        if(nums[start]<=nums[end])
            return nums[start];
        
        while(start<end) { //leave for one element
            int mid=start+(end-start)/2;
            
            //If at mid element is greater than end then 
            //the unsorted part is confirmed at right side of mid
            if(nums[mid]>nums[end])
                //doing mid+1 as the mid element is greater it cannot be min
                start=mid+1;
            else
            //Otherwise the unsorted part is on left
            //Or search space is sorted 
            //In both cases we need to move left
            //To find min element
            //end = mid cause mid can be min in this case
                end=mid;
        }
        
        return nums[start];
    }
}
