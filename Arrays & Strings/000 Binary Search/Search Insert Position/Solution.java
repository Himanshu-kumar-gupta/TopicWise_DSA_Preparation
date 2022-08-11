class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0,end=nums.length-1,res=-1;
        
        while(start<=end) {
            int mid=start+(end-start)/2;
            
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid])
                end=mid-1;
            else {
                res=mid;
                start=mid+1;
            }
        }
        
        return res+1;
    }
}
