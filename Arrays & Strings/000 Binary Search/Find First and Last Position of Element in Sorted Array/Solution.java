class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0,end=nums.length-1,lIndex=-1,rIndex=-1;
        
        //Calculating for first occurrence
        while(start<=end) { 
            int mid=start+(end-start)/2;
            
            if(nums[mid]==target) {
                lIndex=mid;
                //For first occurence we change the mid by end
                end=mid-1;
            }        
            else if(target<nums[mid])
                end=mid-1;
            else
                start=mid+1;

        }
        
        start=0;
        end=nums.length-1;
        
        //For second Occurence
        while(start<=end) { 
            int mid=start+(end-start)/2;
            
            if(nums[mid]==target) {
                rIndex=mid;
                //For second occurence we change the mid by start
                start=mid+1;
            }        
            else if(target<nums[mid])
                end=mid-1;
            else
                start=mid+1;

        }
        
        int output[]={lIndex,rIndex};
        
        return output;
    }
}
