class Solution {
    public int[] searchRange(int[] nums, int target) {
        //Taking two pointer left & right
        int left=0,right=nums.length-1,lIndex=-1,rIndex=-1;
        while(left<=right) { 
            
            //If target not found from left
            if(lIndex==-1) {
                //If target found at left
                if(target==nums[left])
                    lIndex=left--;  //subtracting left as it will increment next, Consider [0,-1]   
                left++;
            }
            
            if(rIndex==-1) {
                if(target==nums[right])
                    rIndex=right++;         
                right--;
            }
            
            //Exit if both target found
            if(lIndex!=-1 && rIndex!=-1) 
                break;
        }
        int output[]={lIndex,rIndex};
        return output;
    }
}
