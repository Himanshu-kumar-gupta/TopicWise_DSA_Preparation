class Solution {
    public int findMin(int[] nums) {
        int len=nums.length;
        int start=0,end=len-1;
        
        if(nums[start]<=nums[end])
            return nums[start];
        
        while(start<=end) {
            int mid=start+(end-start)/2;
            
            //Doing % to overcome outOfBound
            int prev=(mid+len-1)% len;
            int next=(mid+1)% len;
            
            if(nums[mid]<nums[prev] && nums[mid]<nums[next])
                //No. of rotation = mid or len-mid 
                return nums[mid]; 
            //If at mid element is greater than end then 
            //the unsorted part is confirmed at right side of mid
            else if(nums[mid]>nums[end])
                start=mid+1;
            else
            //Otherwise the unsorted part is on left
            //Or search space is sorted 
            //In both cases we need to move left
            //To find min element
                end=mid-1;
        }
        
        return -1;
    }
}
