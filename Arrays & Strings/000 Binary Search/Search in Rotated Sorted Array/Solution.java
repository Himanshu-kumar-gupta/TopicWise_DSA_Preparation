class Solution {
    public int search(int[] nums, int target) {
        int minIndex=-1,len=nums.length;
        
        int start=0,end=len-1;
        
        //finding the index of min element
        if(nums[start]>nums[end]){
            while(start<=end) {
            int mid=start+(end-start)/2;
            int prev=(mid+len-1) % len;
            
            if(nums[mid]<nums[prev]){
                minIndex=mid;
                break;
            }
            else if(nums[mid]>nums[end])
                start=mid+1;
            else
                end=mid-1;
            }
        
            //Checking if target is at sorted left side or sorted right side of minIndex 
            //Updating start and end accordingly
            if(target>=nums[0]&&target<=nums[minIndex-1]) {
                start=0;
                end=minIndex-1;
            }
            else {
                start=minIndex;
                end=len-1;
            }
        }
        
        //Finding target in the updated search space
        while(start<=end) {
            int mid=start+(end-start)/2;
            
            if(nums[mid]==target)
                return mid;
            else if(target<nums[mid])
                end=mid-1;
            else
                start=mid+1;
        }
        
        return -1;
    }
}
